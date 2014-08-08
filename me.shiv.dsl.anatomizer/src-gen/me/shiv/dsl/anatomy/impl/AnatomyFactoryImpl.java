/**
 */
package me.shiv.dsl.anatomy.impl;

import me.shiv.dsl.anatomy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnatomyFactoryImpl extends EFactoryImpl implements AnatomyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnatomyFactory init()
  {
    try
    {
      AnatomyFactory theAnatomyFactory = (AnatomyFactory)EPackage.Registry.INSTANCE.getEFactory(AnatomyPackage.eNS_URI);
      if (theAnatomyFactory != null)
      {
        return theAnatomyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnatomyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnatomyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AnatomyPackage.MODEL: return createModel();
      case AnatomyPackage.SHIPMENT: return createShipment();
      case AnatomyPackage.WORK_PACKAGE: return createWorkPackage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shipment createShipment()
  {
    ShipmentImpl shipment = new ShipmentImpl();
    return shipment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkPackage createWorkPackage()
  {
    WorkPackageImpl workPackage = new WorkPackageImpl();
    return workPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnatomyPackage getAnatomyPackage()
  {
    return (AnatomyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnatomyPackage getPackage()
  {
    return AnatomyPackage.eINSTANCE;
  }

} //AnatomyFactoryImpl
