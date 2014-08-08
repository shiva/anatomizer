/**
 */
package me.shiv.dsl.anatomy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.shiv.dsl.anatomy.Model#getShipments <em>Shipments</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.shiv.dsl.anatomy.AnatomyPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Shipments</b></em>' containment reference list.
   * The list contents are of type {@link me.shiv.dsl.anatomy.Shipment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shipments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shipments</em>' containment reference list.
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getModel_Shipments()
   * @model containment="true"
   * @generated
   */
  EList<Shipment> getShipments();

} // Model
