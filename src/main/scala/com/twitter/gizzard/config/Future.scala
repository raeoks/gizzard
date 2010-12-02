package com.twitter.gizzard.config

import com.twitter.util.Duration


trait Future {
  def poolSize: Int
  def maxPoolSize: Int
  def keepAlive: Duration
  def timeout: Duration

  def apply(name: String) = {
    new gizzard.Future(name, poolSize, maxPoolSize, keepAlive, timeout)
  }
}
