/**
 */
package me.shiv.dsl.anatomy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see me.shiv.dsl.anatomy.AnatomyFactory
 * @model kind="package"
 * @generated
 */
public interface AnatomyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "anatomy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.shiv.me/dsl/Anatomy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "anatomy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnatomyPackage eINSTANCE = me.shiv.dsl.anatomy.impl.AnatomyPackageImpl.init();

  /**
   * The meta object id for the '{@link me.shiv.dsl.anatomy.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.shiv.dsl.anatomy.impl.ModelImpl
   * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Shipments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SHIPMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link me.shiv.dsl.anatomy.impl.ShipmentImpl <em>Shipment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.shiv.dsl.anatomy.impl.ShipmentImpl
   * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getShipment()
   * @generated
   */
  int SHIPMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIPMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Work Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIPMENT__WORK_PACKAGES = 1;

  /**
   * The number of structural features of the '<em>Shipment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIPMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link me.shiv.dsl.anatomy.impl.WorkPackageImpl <em>Work Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.shiv.dsl.anatomy.impl.WorkPackageImpl
   * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getWorkPackage()
   * @generated
   */
  int WORK_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PACKAGE__DESC = 1;

  /**
   * The feature id for the '<em><b>Dep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PACKAGE__DEP = 2;

  /**
   * The number of structural features of the '<em>Work Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_PACKAGE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link me.shiv.dsl.anatomy.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see me.shiv.dsl.anatomy.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link me.shiv.dsl.anatomy.Model#getShipments <em>Shipments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shipments</em>'.
   * @see me.shiv.dsl.anatomy.Model#getShipments()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Shipments();

  /**
   * Returns the meta object for class '{@link me.shiv.dsl.anatomy.Shipment <em>Shipment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shipment</em>'.
   * @see me.shiv.dsl.anatomy.Shipment
   * @generated
   */
  EClass getShipment();

  /**
   * Returns the meta object for the attribute '{@link me.shiv.dsl.anatomy.Shipment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see me.shiv.dsl.anatomy.Shipment#getName()
   * @see #getShipment()
   * @generated
   */
  EAttribute getShipment_Name();

  /**
   * Returns the meta object for the containment reference list '{@link me.shiv.dsl.anatomy.Shipment#getWorkPackages <em>Work Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Work Packages</em>'.
   * @see me.shiv.dsl.anatomy.Shipment#getWorkPackages()
   * @see #getShipment()
   * @generated
   */
  EReference getShipment_WorkPackages();

  /**
   * Returns the meta object for class '{@link me.shiv.dsl.anatomy.WorkPackage <em>Work Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Package</em>'.
   * @see me.shiv.dsl.anatomy.WorkPackage
   * @generated
   */
  EClass getWorkPackage();

  /**
   * Returns the meta object for the attribute '{@link me.shiv.dsl.anatomy.WorkPackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see me.shiv.dsl.anatomy.WorkPackage#getName()
   * @see #getWorkPackage()
   * @generated
   */
  EAttribute getWorkPackage_Name();

  /**
   * Returns the meta object for the attribute '{@link me.shiv.dsl.anatomy.WorkPackage#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see me.shiv.dsl.anatomy.WorkPackage#getDesc()
   * @see #getWorkPackage()
   * @generated
   */
  EAttribute getWorkPackage_Desc();

  /**
   * Returns the meta object for the attribute '{@link me.shiv.dsl.anatomy.WorkPackage#getDep <em>Dep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dep</em>'.
   * @see me.shiv.dsl.anatomy.WorkPackage#getDep()
   * @see #getWorkPackage()
   * @generated
   */
  EAttribute getWorkPackage_Dep();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AnatomyFactory getAnatomyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link me.shiv.dsl.anatomy.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.shiv.dsl.anatomy.impl.ModelImpl
     * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Shipments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SHIPMENTS = eINSTANCE.getModel_Shipments();

    /**
     * The meta object literal for the '{@link me.shiv.dsl.anatomy.impl.ShipmentImpl <em>Shipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.shiv.dsl.anatomy.impl.ShipmentImpl
     * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getShipment()
     * @generated
     */
    EClass SHIPMENT = eINSTANCE.getShipment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIPMENT__NAME = eINSTANCE.getShipment_Name();

    /**
     * The meta object literal for the '<em><b>Work Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIPMENT__WORK_PACKAGES = eINSTANCE.getShipment_WorkPackages();

    /**
     * The meta object literal for the '{@link me.shiv.dsl.anatomy.impl.WorkPackageImpl <em>Work Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.shiv.dsl.anatomy.impl.WorkPackageImpl
     * @see me.shiv.dsl.anatomy.impl.AnatomyPackageImpl#getWorkPackage()
     * @generated
     */
    EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_PACKAGE__NAME = eINSTANCE.getWorkPackage_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_PACKAGE__DESC = eINSTANCE.getWorkPackage_Desc();

    /**
     * The meta object literal for the '<em><b>Dep</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_PACKAGE__DEP = eINSTANCE.getWorkPackage_Dep();

  }

} //AnatomyPackage
