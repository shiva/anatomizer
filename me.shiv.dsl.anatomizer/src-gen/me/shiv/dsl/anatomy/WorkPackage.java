/**
 */
package me.shiv.dsl.anatomy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.shiv.dsl.anatomy.WorkPackage#getName <em>Name</em>}</li>
 *   <li>{@link me.shiv.dsl.anatomy.WorkPackage#getDesc <em>Desc</em>}</li>
 *   <li>{@link me.shiv.dsl.anatomy.WorkPackage#getDep <em>Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.shiv.dsl.anatomy.AnatomyPackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends EObject
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
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getWorkPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link me.shiv.dsl.anatomy.WorkPackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getWorkPackage_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link me.shiv.dsl.anatomy.WorkPackage#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Dep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dep</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dep</em>' attribute.
   * @see #setDep(String)
   * @see me.shiv.dsl.anatomy.AnatomyPackage#getWorkPackage_Dep()
   * @model
   * @generated
   */
  String getDep();

  /**
   * Sets the value of the '{@link me.shiv.dsl.anatomy.WorkPackage#getDep <em>Dep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dep</em>' attribute.
   * @see #getDep()
   * @generated
   */
  void setDep(String value);

} // WorkPackage
