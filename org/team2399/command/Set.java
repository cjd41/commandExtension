/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008-2017. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.team2399.command;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * A set.
 */
class Set<E> extends AbstractSet<E> {
  private List<E> m_set = new Vector<E>();

  public Set() {
  }

  @Override
  public boolean add(E o) {
    if (m_set.contains(o)) {
      return false;
    }
    m_set.add(o);
    return true;
  }

  @Override
  public boolean contains(Object o) {
    return m_set.contains(o);
  }

  @Override
  public Iterator<E> iterator() {
    return m_set.iterator();
  }

  @Override
  public int size()
  {
	  return m_set.size();
  }
}
