package viseven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import viseven.Activity.ActivityAdd;
import viseven.Activity.ActivityDel;
import viseven.Activity.ActivityEdit;
import viseven.CategoryOfContact.CategoryOfContactAdd;
import viseven.CategoryOfContact.CategoryOfContactDel;
import viseven.CategoryOfContact.CategoryOfContactEdit;
import viseven.CategoryOfOrganization.CategoryOfOrganizationAdd;
import viseven.CategoryOfOrganization.CategoryOfOrganizationDel;
import viseven.CategoryOfOrganization.CategoryOfOrganizationEdit;
import viseven.Contact.ContactAdd;
import viseven.Contact.ContactDel;
import viseven.Contact.ContactEdit;
import viseven.Division.DivisionAdd;
import viseven.Division.DivisionDel;
import viseven.Division.DivisionEdit;
import viseven.Event.EventAdd;
import viseven.Event.EventDel;
import viseven.Event.EventEdit;
import viseven.FormOfAddress.FormOfAddressAdd;
import viseven.FormOfAddress.FormOfAddressDel;
import viseven.FormOfAddress.FormOfAddressEdit;
import viseven.MarketingCycle.MarketingCycleAdd;
import viseven.MarketingCycle.MarketingCycleClone;
import viseven.MarketingCycle.MarketingCycleDel;
import viseven.MarketingCycle.MarketingCycleDelClone;
import viseven.MarketingCycle.MarketingCycleEdit;
import viseven.MarketingCycle.MarketingCycleProductAssign;
import viseven.MarketingCycle.MarketingCycleProductScenarioAdd;
import viseven.MarketingCycle.MarketingCycleProductScenarioDel;
import viseven.MarketingCycle.MarketingCycleProductUnassign;
import viseven.MaterialType.MaterialTypeAdd;
import viseven.MaterialType.MaterialTypeDel;
import viseven.MaterialType.MaterialTypeEdit;
import viseven.Organization.OrganizationAdd;
import viseven.Organization.OrganizationContactsAdd;
import viseven.Organization.OrganizationDel;
import viseven.Organization.OrganizationEdit;
import viseven.OrganizationType.OrganizationTypeAdd;
import viseven.OrganizationType.OrganizationTypeDel;
import viseven.OrganizationType.OrganizationTypeEdit;
import viseven.Product.ProductAdd;
import viseven.Product.ProductDel;
import viseven.Product.ProductEdit;
import viseven.RetailChain.RetailChainAdd;
import viseven.RetailChain.RetailChainDel;
import viseven.RetailChain.RetailChainEdit;
import viseven.Series.SeriesAdd;
import viseven.Series.SeriesDel;
import viseven.Series.SeriesEdit;
import viseven.Speciality.SpecialityAdd;
import viseven.Speciality.SpecialityDel;
import viseven.Speciality.SpecialityEdit;
import viseven.Temporary.TempContactAdd;
import viseven.Temporary.TempContactDel;
import viseven.Temporary.TempOrganizationAdd;
import viseven.Temporary.TempOrganizationDel;
import viseven.Temporary.TempProductAdd;
import viseven.Temporary.TempProductDel;
import viseven.Temporary.TemporaryEventAdd;
import viseven.Temporary.TemporaryEventDel;
import viseven.Temporary.TemporaryUserAdd;
import viseven.Temporary.TemporaryUserDel;
import viseven.Territory.TerritoryABAdd;
import viseven.Territory.TerritoryABDel;
import viseven.Territory.TerritoryAssigne;
import viseven.Territory.TerritoryOrganizationAssigne;
import viseven.Territory.TerritoryOrganizationUnassigne;
import viseven.Territory.TerritoryUnassigne;
import viseven.Territory.TerritoryUserAssigne;
import viseven.Territory.TerritoryUserUnassigne;
import viseven.Title.TitleAdd;
import viseven.Title.TitleDel;
import viseven.Title.TitleEdit;
import viseven.User.UserAdd;
import viseven.User.UserDel;
import viseven.User.UserEdit;
import viseven.UserEvents.UserEventContactAssigne;
import viseven.UserEvents.UserEventContactUnassigne;
import viseven.UserEvents.UserEventsAdd;
import viseven.UserEvents.UserEventsDel;
import viseven.UserEvents.UserEventsEdit;
import viseven.Workplaces.WorkPlaceDel;
import viseven.Workplaces.WorkplaceAdd;
import viseven.Workplaces.WorkplaceEdit;

@RunWith(Suite.class)
@Suite.SuiteClasses({SeriesAdd.class, SeriesEdit.class, SeriesDel.class, OrganizationTypeAdd.class, OrganizationTypeEdit.class, OrganizationTypeDel.class, 
	RetailChainAdd.class, RetailChainEdit.class, RetailChainDel.class, SpecialityAdd.class, SpecialityEdit.class, SpecialityDel.class, 
	DivisionAdd.class, DivisionEdit.class, DivisionDel.class, MaterialTypeAdd.class, MaterialTypeEdit.class, MaterialTypeDel.class, 
	TitleAdd.class, TitleEdit.class,TitleDel.class, FormOfAddressAdd.class, FormOfAddressEdit.class, FormOfAddressDel.class, 
	CategoryOfContactAdd.class, CategoryOfContactEdit.class, CategoryOfContactDel.class, UserAdd.class, UserEdit.class, UserDel.class, 
	ProductAdd.class, ProductEdit.class, ProductDel.class, 
	OrganizationAdd.class, TempContactAdd.class,OrganizationContactsAdd.class, OrganizationEdit.class, OrganizationDel.class, TempContactDel.class,
	ContactAdd.class, ContactEdit.class, ContactDel.class,TempContactAdd.class, TempOrganizationAdd.class, WorkplaceAdd.class,
	WorkplaceEdit.class, WorkPlaceDel.class, TempContactDel.class, TempOrganizationDel.class, 
	CategoryOfOrganizationAdd.class, CategoryOfOrganizationEdit.class, CategoryOfOrganizationDel.class, 
	ActivityAdd.class, ActivityEdit.class, ActivityDel.class, 
	MarketingCycleAdd.class, TempProductAdd.class, MarketingCycleClone.class, MarketingCycleDelClone.class, MarketingCycleProductAssign.class, 
	MarketingCycleProductScenarioAdd.class, MarketingCycleProductScenarioDel.class, MarketingCycleProductUnassign.class, 
	MarketingCycleEdit.class, MarketingCycleDel.class, TempProductDel.class,
	TerritoryABAdd.class, TerritoryAssigne.class, TerritoryUnassigne.class, TempOrganizationAdd.class, TerritoryOrganizationAssigne.class,
	TerritoryOrganizationUnassigne.class, TempOrganizationDel.class, TemporaryUserAdd.class, TerritoryUserAssigne.class, TerritoryUserUnassigne.class,
	TemporaryUserDel.class, TerritoryABDel.class, EventAdd.class, EventEdit.class, EventDel.class, 
	TemporaryEventAdd.class, TempContactAdd.class, UserEventsAdd.class, UserEventContactAssigne.class, UserEventContactUnassigne.class,
	UserEventsEdit.class, UserEventsDel.class, TemporaryEventDel.class, TempContactDel.class
	})
public class Launcher {

}
