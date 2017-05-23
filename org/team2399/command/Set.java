/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008-2017. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.team2399.command;

import java.util.Iterator;
import java.util.Vector;

/**
 * A set.
 */
class Set<E> implements Iterable<E> {
  private Vector<E> m_set = new Vector<E>();

  public Set() {
  }

  public void add(E o) {
    if (m_set.contains(o)) {
      return;
    }
    m_set.addElement(o);
  }

  public void add(Set<E> s) {
    for (E e : s) {
      add(e);
    }
  }

  public boolean contains(Object o) {
    return m_set.contains(o);
  }

  public Iterator<E> iterator() {
    return m_set.iterator();
  }
}
