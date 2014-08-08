/**
 */
package me.shiv.dsl.anatomy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.shiv.dsl.anatomy.Shipment#getName <em>Name</em>}</li>
 *   <li>{@link me.shiv.dsl.anatomy.Shipment#getWorkPackages <em>Work Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.shiv.dsl.anatomy.AnatomyPackage#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getShipment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link me.shiv.dsl.anatomy.Shipment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Work Packages</b></em>' containment reference list.
   * The list contents are of type {@link me.shiv.dsl.anatomy.WorkPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Packages</em>' containment reference list.
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getShipment_WorkPackages()
   * @model containment="true"
   * @generated
   */
  EList<WorkPackage> getWorkPackages();

} // Shipment
