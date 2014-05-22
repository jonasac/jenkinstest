package com.github.jonasac.jenkinstest

import org.scalatest.FunSuite
import com.github.jonasac.Jenkinstest

/**
 * Created by jonasacl on 5/22/14.
 */
class jenkinstestTest extends FunSuite {
  assert(Jenkinstest.helloWorld == "Hello, World!")
}
