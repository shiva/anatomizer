/**
 */
package me.shiv.dsl.anatomy.impl;

import me.shiv.dsl.anatomy.AnatomyPackage;
import me.shiv.dsl.anatomy.WorkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link me.shiv.dsl.anatomy.impl.WorkPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link me.shiv.dsl.anatomy.impl.WorkPackageImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link me.shiv.dsl.anatomy.impl.WorkPackageImpl#getDep <em>Dep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkPackageImpl extends MinimalEObjectImpl.Container implements WorkPackage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getDep() <em>Dep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDep()
   * @generated
   * @ordered
   */
  protected static final String DEP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDep() <em>Dep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDep()
   * @generated
   * @ordered
   */
  protected String dep = DEP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkPackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AnatomyPackage.Literals.WORK_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.WORK_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.WORK_PACKAGE__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDep()
  {
    return dep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDep(String newDep)
  {
    String oldDep = dep;
    dep = newDep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnatomyPackage.WORK_PACKAGE__DEP, oldDep, dep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AnatomyPackage.WORK_PACKAGE__NAME:
        return getName();
      case AnatomyPackage.WORK_PACKAGE__DESC:
        return getDesc();
      case AnatomyPackage.WORK_PACKAGE__DEP:
        return getDep();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnatomyPackage.WORK_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case AnatomyPackage.WORK_PACKAGE__DESC:
        setDesc((String)newValue);
        return;
      case AnatomyPackage.WORK_PACKAGE__DEP:
        setDep((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AnatomyPackage.WORK_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AnatomyPackage.WORK_PACKAGE__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case AnatomyPackage.WORK_PACKAGE__DEP:
        setDep(DEP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AnatomyPackage.WORK_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AnatomyPackage.WORK_PACKAGE__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case AnatomyPackage.WORK_PACKAGE__DEP:
        return DEP_EDEFAULT == null ? dep != null : !DEP_EDEFAULT.equals(dep);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", desc: ");
    result.append(desc);
    result.append(", dep: ");
    result.append(dep);
    result.append(')');
    return result.toString();
  }

} //WorkPackageImpl
