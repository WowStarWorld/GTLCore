package org.gtlcore.gtlcore.common.data;

import org.gtlcore.gtlcore.common.data.material.MaterialAdd;
import org.gtlcore.gtlcore.common.data.material.MaterialBuilder;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import com.lowdragmc.lowdraglib.Platform;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import committee.nova.mods.avaritia.init.registry.ModBlocks;
import committee.nova.mods.avaritia.init.registry.ModItems;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class GTLMaterials {

    public static Material Fluix;
    public static Material MutatedLivingSolder;
    public static Material SuperMutatedLivingSolder;
    public static Material PotassiumPyrosulfate;
    public static Material SodiumSulfate;
    public static Material RhodiumNitrate;
    public static Material RoughlyRhodiumMetal;
    public static Material RhodiumFilterCakeSolution;
    public static Material RhodiumSaltSolution;
    public static Material ZincSulfate;
    public static Material ReprecipitatedRhodium;
    public static Material SodiumNitrate;
    public static Material RhodiumSalt;
    public static Material RhodiumFilterCake;
    public static Material SodiumRutheniate;
    public static Material IridiumDioxide;
    public static Material RutheniumTetroxideLQ;
    public static Material SodiumFormate;
    public static Material RhodiumSulfateGas;
    public static Material AcidicIridium;
    public static Material PlatinumSlag;
    public static Material LeachResidue;
    public static Material RutheniumTetroxideHot;
    public static Material HexafluorideEnrichedNaquadahSolution;
    public static Material XenonHexafluoroEnrichedNaquadate;
    public static Material GoldTrifluoride;
    public static Material XenoauricFluoroantimonicAcid;
    public static Material GoldChloride;
    public static Material BromineTrifluoride;
    public static Material HexafluorideNaquadriaSolution;
    public static Material RadonDifluoride;
    public static Material RadonNaquadriaOctafluoride;
    public static Material CaesiumFluoride;
    public static Material XenonTrioxide;
    public static Material CaesiumXenontrioxideFluoride;
    public static Material NaquadriaCaesiumXenonnonfluoride;
    public static Material RadonTrioxide;
    public static Material NaquadriaCaesiumfluoride;
    public static Material NitrosoniumOctafluoroxenate;
    public static Material NitrylFluoride;
    public static Material AcidicNaquadriaCaesiumfluoride;
    public static Material SupercriticalSteam;
    public static Material WaterAgarMix;
    public static Material TungstenTrioxide;
    public static Material SpaceTime;
    public static Material Infinity;

    public static Material CompoundTriniite;
    public static Material FumingNitricAcid;
    public static Material CrystallineNitricAcid;
    public static Material SodiumChlorate;
    public static Material SodiumPerchlorate;
    public static Material NitratedTriniiteCompoundSolution;
    public static Material ResidualTriniiteSolution;
    public static Material ActiniumTriniumHydroxides;
    public static Material ActiniumRadiumHydroxideSolution;
    public static Material ActiniumRadiumNitrateSolution;
    public static Material SeleniumOxide;
    public static Material HeavilyFluorinatedTriniumSolution;
    public static Material Perfluorobenzene;
    public static Material TriniumTetrafluoride;
    public static Material Trimethylsilane;
    public static Material Trimethylchlorosilane;
    public static Material Fluorocarborane;
    public static Material CaesiumNitrate;
    public static Material CesiumCarborane;
    public static Material SilverIodide;
    public static Material SilverNitrate;
    public static Material TrifluoroaceticPhosphateEster;
    public static Material EthyleneSulfide;
    public static Material EthylTrifluoroacetate;
    public static Material AcetylChloride;
    public static Material RadiumNitrate;
    public static Material ActiniumNitrate;
    public static Material KryptonDifluoride;
    public static Material Fluorite;
    public static Material MoltenCalciumSalts;
    public static Material PotassiumFluoride;
    public static Material SodiumHydride;
    public static Material Trimethylamine;
    public static Material BoraneDimethylSulfide;
    public static Material Tetrahydrofuran;
    public static Material CesiumCarboranePrecursor;
    public static Material Diborane;
    public static Material LithiumAluminiumHydride;
    public static Material LithiumAluminiumFluoride;
    public static Material AluminiumTrifluoride;
    public static Material SodiumAluminiumHydride;
    public static Material AluminiumHydride;
    public static Material Alumina;
    public static Material CaesiumHydroxide;
    public static Material Decaborane;
    public static Material SodiumTetrafluoroborate;
    public static Material DiethylEther;
    public static Material SodiumBorohydride;
    public static Material BoronTrifluorideAcetate;
    public static Material SodiumHexafluoroaluminate;
    public static Material PhosphorusPentasulfide;

    public static Material DirtyHexafluorosilicicAcid;
    public static Material DiluteHexafluorosilicicAcid;
    public static Material StoneDustResidue;
    public static Material FluorosilicicAcid;
    public static Material AmmoniumFluoride;
    public static Material AmmoniumBifluoride;
    public static Material AmmoniumBifluorideSolution;
    public static Material SodiumHydroxideSolution;
    public static Material UncommonResidues;
    public static Material RedMud;
    public static Material NeutralisedRedMud;
    public static Material RedSlurry;
    public static Material FerricReeChloride;
    public static Material TitanylSulfate;
    public static Material DioxygenDifluoride;
    public static Material PartiallyOxidizedResidues;
    public static Material OxidizedResidualSolution;
    public static Material InertResidues;
    public static Material OxidizedResidues;
    public static Material HeavyOxidizedResidues;
    public static Material CleanInertResidues;
    public static Material HeliumIIIHydride;
    public static Material UltraacidicResidueSolution;
    public static Material XenicAcid;
    public static Material DiluteHydrofluoricAcid;
    public static Material MetallicResidues;
    public static Material HeavyMetallicResidues;
    public static Material DiamagneticResidues;
    public static Material ParamagneticResidues;
    public static Material FerromagneticResidues;
    public static Material HeavyDiamagneticResidues;
    public static Material HeavyParamagneticResidues;
    public static Material HeavyFerromagneticResidues;
    public static Material ExoticHeavyResidues;
    public static Material TritiumHydride;
    public static Material DustyLiquidHeliumIII;
    public static Material Ozone;
    public static Material HydrogenPeroxide;
    public static Material RareEarthChlorides;

    public static Material PentlanditeFront;
    public static Material EnrichedNaquadahFront;
    public static Material CarbonDisulfide;
    public static Material SpecialCeramics;
    public static Material HydroiodicAcid;
    public static Material BarnardaAir;
    public static Material AlienAlgae;
    public static Material Bloodstone;
    public static Material PerditioCrystal;
    public static Material EarthCrystal;
    public static Material IgnisCrystal;
    public static Material InfusedGold;
    public static Material Thaumium;
    public static Material AstralSilver;
    public static Material HighEnergyMixture;
    public static Material Luminessence;
    public static Material Sunnarium;
    public static Material PulsatingAlloy;
    public static Material ConductiveAlloy;
    public static Material EnergeticAlloy;
    public static Material VibrantAlloy;
    public static Material UuAmplifier;
    public static Material Celestine;
    public static Material Zircon;
    public static Material Jasper;
    public static Material BismuthTellurite;
    public static Material Prasiolite;
    public static Material CubicZirconia;
    public static Material MagnetoResonatic;
    public static Material Adamantium;
    public static Material Quantanium;
    public static Material Vibranium;
    public static Material Indalloy140;
    public static Material ArtheriumSn;
    public static Material Tairitsu;
    public static Material Draconium;
    public static Material Chaos;
    public static Material Cosmic;
    public static Material Hypogen;
    public static Material Shirabon;
    public static Material Mithril;
    public static Material Taranium;
    public static Material Crystalmatrix;
    public static Material CosmicNeutronium;
    public static Material Echoite;
    public static Material Legendarium;
    public static Material DraconiumAwakened;
    public static Material Adamantine;
    public static Material Starmetal;
    public static Material Orichalcum;
    public static Material Infuscolium;
    public static Material Enderium;
    public static Material Eternity;
    public static Material Magmatter;
    public static Material DegenerateRhenium;
    public static Material HeavyQuarkDegenerateMatter;
    public static Material Titanium50;
    public static Material MetastableHassium;
    public static Material Inconel625;
    public static Material HastelloyN75;
    public static Material MetastableOganesson;
    public static Material QuantumChromodynamicallyConfinedMatter;
    public static Material TranscendentMetal;
    public static Material Uruium;
    public static Material MagnetohydrodynamicallyConstrainedStarMatter;
    public static Material WhiteDwarfMatter;
    public static Material BlackDwarfMatter;
    public static Material AstralTitanium;
    public static Material CelestialTungsten;
    public static Material Enderite;
    public static Material NaquadriaticTaranium;
    public static Material AbyssalAlloy;
    public static Material TitanSteel;
    public static Material Highurabilityompoundteel;
    public static Material GermaniumTungstenNitride;
    public static Material BlackTitanium;
    public static Material TriniumTitanium;
    public static Material Cinobite;
    public static Material HastelloyX78;
    public static Material HastelloyK243;
    public static Material Vibramantium;
    public static Material EglinSteel;
    public static Material Inconel792;
    public static Material Pikyonium;
    public static Material HastelloyN;
    public static Material AluminiumBronze;
    public static Material Lafium;
    public static Material Grisium;
    public static Material Stellite;
    public static Material SiliconCarbide;
    public static Material Quantum;
    public static Material FluxedElectrum;
    public static Material Tanmolyium;
    public static Material Dalisenite;
    public static Material ArceusAlloy2B;
    public static Material TitanPrecisionSteel;
    public static Material Lumiium;
    public static Material Hikarium;
    public static Material SuperheavyLAlloy;
    public static Material SuperheavyHAlloy;
    public static Material ZirconiumCarbide;
    public static Material MarM200Steel;
    public static Material Tantalloy61;
    public static Material ReactorSteel;
    public static Material Lanthanoids1;
    public static Material Lanthanoids2;
    public static Material RAREEARTH;
    public static Material Actinoids1;
    public static Material Actinoids2;
    public static Material Actinoids;
    public static Material Alkaline;
    public static Material AlkalineEarth;
    public static Material Transition1;
    public static Material Transition2;
    public static Material Transition3;
    public static Material Transition;
    public static Material Poor;
    public static Material Metalloid;
    public static Material NotFound;
    public static Material NobleGas;
    public static Material Periodicium;
    public static Material FallKing;
    public static Material WoodsGlass;
    public static Material Polyetheretherketone;
    public static Material CarbonNanotubes;
    public static Material FullerenePolymerMatrixPulp;
    public static Material Zylon;
    public static Material Kevlar;
    public static Material Radox;
    public static Material AdamantineCompounds;
    public static Material RawTengam;
    public static Material CleanRawTengam;
    public static Material PurifiedTengam;
    public static Material AttunedTengam;
    public static Material PreZylon;
    public static Material Terephthalaldehyde;
    public static Material SodiumOxide;
    public static Material Bedrock;
    public static Material CompressedStone;
    public static Material GermaniumContainingPrecipitate;
    public static Material GermaniumAsh;
    public static Material GermaniumDioxide;
    public static Material Durene;
    public static Material PyromelliticDianhydride;
    public static Material CoAcAbCatalyst;
    public static Material ZnFeAlClCatalyst;
    public static Material CalciumCarbide;
    public static Material Difluorobenzophenone;
    public static Material SodiumFluoride;
    public static Material SodiumSeaborgate;
    public static Material GoldDepletedMolybdenite;
    public static Material MolybdenumTrioxide;
    public static Material Dichlorocyclooctadieneplatinum;
    public static Material Diiodobiphenyl;
    public static Material MolybdenumConcentrate;
    public static Material BoronTrioxide;
    public static Material LithiumNiobateNanoparticles;
    public static Material Hexanitrohexaaxaisowurtzitane;
    public static Material SilicaGel;
    public static Material CrudeHexanitrohexaaxaisowurtzitane;
    public static Material Tetraacetyldinitrosohexaazaisowurtzitane;
    public static Material NitroniumTetrafluoroborate;
    public static Material NitrosoniumTetrafluoroborate;
    public static Material Dibenzyltetraacetylhexaazaisowurtzitane;
    public static Material SuccinamidylAcetate;
    public static Material Hexabenzylhexaazaisowurtzitane;
    public static Material NHydroxysuccinimide;
    public static Material SuccinicAnhydride;
    public static Material SuccinicAcid;
    public static Material Acetonitrile;
    public static Material Hexamethylenetetramine;
    public static Material RareEarthOxide;
    public static Material RareEarthMetal;
    public static Material NaquadahContainRareEarth;
    public static Material NaquadahContainRareEarthFluoride;
    public static Material MetalResidue;
    public static Material PalladiumFullereneMatrix;
    public static Material Fullerene;
    public static Material UnfoldedFullerene;
    public static Material Methylbenzophenanthrene;
    public static Material Sarcosine;
    public static Material DiphenylmethaneDiisocyanate;
    public static Material Pentaerythritol;
    public static Material KelpSlurry;
    public static Material Quasifissioning;
    public static Material ExcitedDtec;
    public static Material ExcitedDtsc;
    public static Material DimensionallyTranscendentResplendentCatalyst;
    public static Material DimensionallyTranscendentProsaicCatalyst;
    public static Material DimensionallyTranscendentExoticCatalyst;
    public static Material DimensionallyTranscendentStellarCatalyst;
    public static Material DimensionallyTranscendentCrudeCatalyst;
    public static Material Ytterbium178;
    public static Material Flyb;
    public static Material EnrichedPotassiumIodideSlurry;
    public static Material IodineContainingSlurry;
    public static Material AshLeachingSolution;
    public static Material Tannic;
    public static Material GermaniumTetrachlorideSolution;
    public static Material Polyimide;
    public static Material Aniline;
    public static Material Oxydianiline;
    public static Material BoricAcid;
    public static Material FluoroboricAcid;
    public static Material BenzenediazoniumTetrafluoroborate;
    public static Material FluoroBenzene;
    public static Material Fluorotoluene;
    public static Material Hydroquinone;
    public static Material Resorcinol;
    public static Material SodiumNitrateSolution;
    public static Material Acetylene;
    public static Material SodiumCyanide;
    public static Material GoldCyanide;
    public static Material MolybdenumFlue;
    public static Material RheniumSulfuricSolution;
    public static Material AmmoniumPerrhenate;
    public static Material Cycloparaphenylene;
    public static Material TrimethylTinChloride;
    public static Material SilverTetrafluoroborate;
    public static Material BoronFluoride;
    public static Material OneOctene;
    public static Material Pyridine;
    public static Material Acetaldehyde;
    public static Material Cyclooctadiene;
    public static Material SeaborgiumDopedNanotubes;
    public static Material Ethylenediamine;
    public static Material Ethanolamine;
    public static Material EthyleneOxide;
    public static Material Benzaldehyde;
    public static Material HydroxylamineHydrochloride;
    public static Material MaleicAnhydride;
    public static Material Benzylamine;
    public static Material Glyoxal;
    public static Material BenzylChloride;
    public static Material Mana;
    public static Material RareEarthHydroxides;
    public static Material QuantumDots;
    public static Material StearicAcid;
    public static Material Soap;
    public static Material Tricotylphosphine;
    public static Material IridiumTrichlorideSolution;
    public static Material LiquidHydrogen;
    public static Material BedrockSmoke;
    public static Material BedrockSootSolution;
    public static Material CleanBedrockSolution;
    public static Material BedrockGas;
    public static Material VibraniumUnstable;
    public static Material TaraniumEnrichedLiquidHelium3;
    public static Material TaraniumRichLiquidHelium4;
    public static Material FreeElectronGas;
    public static Material FreeAlphaGas;
    public static Material FreeProtonGas;
    public static Material QuarkGluon;
    public static Material HeavyQuarks;
    public static Material LightQuarks;
    public static Material Gluons;
    public static Material OganessonBreedingBase;
    public static Material TitaniumTetrafluoride;
    public static Material Titanium50Tetrafluoride;
    public static Material Titanium50Tetrachloride;
    public static Material HotOganesson;
    public static Material Ferrocene;
    public static Material ScandiumTitanium50Mixture;
    public static Material DragonBreath;
    public static Material EnrichedDragonBreath;
    public static Material DragonBlood;
    public static Material TurbidDragonBlood;
    public static Material DragonElement;
    public static Material HeavyLeptonMixture;
    public static Material HeavyQuarkEnrichedMixture;
    public static Material CosmicComputingMixture;
    public static Material LiquidStarlight;
    public static Material Starlight;
    public static Material DenseNeutron;
    public static Material HighEnergyQuarkGluon;
    public static Material NeutroniumDopedNanotubes;
    public static Material AmmoniumNitrateSolution;
    public static Material NaquadahSolution;
    public static Material FluorineCrackedAquadah;
    public static Material RadonCrackedEnrichedAquadah;
    public static Material NaquadahFuel;
    public static Material EnrichedNaquadahFuel;
    public static Material HyperFuel1;
    public static Material HyperFuel2;
    public static Material HyperFuel3;
    public static Material HyperFuel4;
    public static Material ConcentrationMixingHyperFuel1;
    public static Material ConcentrationMixingHyperFuel2;
    public static Material CosmicElement;
    public static Material DimensionallyTranscendentResidue;
    public static Material PrimordialMatter;
    public static Material SpatialFluid;
    public static Material TemporalFluid;
    public static Material Isochloropropane;
    public static Material Dinitrodipropanyloxybenzene;
    public static Material RadoxGas;
    public static Material CrackedRadox;
    public static Material SuperLightRadox;
    public static Material LightRadox;
    public static Material SuperHeavyRadox;
    public static Material HeavyRadox;
    public static Material RawRadox;
    public static Material Xenoxene;
    public static Material XenoxeneCrystal;
    public static Material XenoxeneMixture;
    public static Material EnrichedXenoxene;
    public static Material PurifiedXenoxene;
    public static Material DilutedXenoxene;
    public static Material Dibromomethylbenzene;
    public static Material RawStarMatter;
    public static Material XpJuice;
    public static Material BiomediumRaw;
    public static Material BiohmediumSterilized;
    public static Material UnknowWater;
    public static Material UnknownNutrientAgar;
    public static Material SeaweedBroth;
    public static Material LiquidCrystalKevlar;
    public static Material PolyurethaneResin;
    public static Material DiphenylmethanediisocyanateMixture;
    public static Material Phosgene;
    public static Material DiaminodiphenylmethanMixture;
    public static Material SiliconOil;
    public static Material EthyleneGlycol;
    public static Material PCBs;
    public static Material DMAP;
    public static Material PhenylPentanoicAcid;
    public static Material Dichloromethane;
    public static Material DimethylSulfide;
    public static Material CosmicMesh;
    public static Material HydrobromicAcid;
    public static Material BenzophenanthrenylAcetonitrile;
    public static Material BromoSuccinamide;
    public static Material PotassiumBromide;
    public static Material Succinimide;
    public static Material FissionedUranium235;
    public static Material FranciumCaesiumCadmiumBromide;
    public static Material StrontiumEuropiumAluminate;
    public static Material UraniumSulfateWasteSolution;
    public static Material DibismuthHydroborate;
    public static Material CircuitCompound;
    public static Material CaesiumIodide;
    public static Material ThalliumThuliumDopedCaesiumIodide;
    public static Material Photoresist;
    public static Material EuvPhotoresist;
    public static Material GammaRaysPhotoresist;
    public static Material AcrylicAcid;
    public static Material EthylAcrylate;
    public static Material Trichloroflerane;
    public static Material BisethylenedithiotetraselenafulvalenePerrhenate;
    public static Material Bisethylenedithiotetraselenafulvalene;
    public static Material LithiumThiinediselenide;
    public static Material CyclopentadienylTitaniumTrichloride;
    public static Material ButylLithium;
    public static Material Bromodihydrothiine;
    public static Material Dibromoacrolein;
    public static Material SodiumThiosulfate;
    public static Material LithiumFluoride;
    public static Material HighPurityCalciumCarbonate;
    public static Material Bromobutane;
    public static Material Propadiene;
    public static Material AstatideSolution;
    public static Material MixedAstatideSalts;
    public static Material BoronFranciumCarbide;
    public static Material Borocarbide;
    public static Material FranciumCarbide;
    public static Material BoronCarbide;
    public static Material LanthanumEmbeddedFullerene;
    public static Material LanthanumFullereneMix;
    public static Material CaliforniumTrichloride;
    public static Material FullereneDopedNanotubes;
    public static Material CaliforniumCyclopentadienide;
    public static Material Cyclopentadiene;
    public static Material LithiumCyclopentadienide;
    public static Material Dimethylether;
    public static Material Dimethoxyethane;
    public static Material Photopolymer;
    public static Material SilverPerchlorate;
    public static Material SilverChloride;
    public static Material SodiumBromide;
    public static Material SilverOxide;
    public static Material PhthalicAnhydride;
    public static Material SodiumHypochlorite;
    public static Material Ethylanthraquinone;
    public static Material Ethylanthrahydroquinone;
    public static Material Anthracene;
    public static Material Phenylsodium;
    public static Material NDifluorophenylpyrrole;
    public static Material Difluoroaniline;
    public static Material Succinaldehyde;
    public static Material TetraethylammoniumBromide;
    public static Material RhodiumRheniumNaquadahCatalyst;
    public static Material IodineMonochloride;
    public static Material Dimethylnaphthalene;
    public static Material Dihydroiodotetracene;
    public static Material AcetylatingReagent;
    public static Material MagnesiumChlorideBromide;
    public static Material IsopropylAlcohol;
    public static Material Dichlorodicyanobenzoquinone;
    public static Material Dichlorodicyanohydroquinone;
    public static Material Tetracene;
    public static Material PolycyclicAromaticMixture;
    public static Material RheniumHassiumThalliumIsophtaloylbisdiethylthioureaHexaf;
    public static Material ThalliumChloride;
    public static Material HassiumChloride;
    public static Material RheniumChloride;
    public static Material IsophthaloylBis;
    public static Material HexafluorophosphoricAcid;
    public static Material Diethylthiourea;
    public static Material ThionylChloride;
    public static Material PhenylenedioxydiaceticAcid;
    public static Material SodiumThiocyanate;
    public static Material PhosphorusTrichloride;
    public static Material AntimonyPentafluoride;
    public static Material AntimonyTrichloride;
    public static Material ChargedCaesiumCeriumCobaltIndium;
    public static Material ActiniumSuperhydride;
    public static Material CosmicSuperconductor;
    public static Material Ethylamine;
    public static Material TolueneDiisocyanate;
    public static Material Polyurethane;
    public static Material ViscoelasticPolyurethane;
    public static Material ViscoelasticPolyurethaneFoam;
    public static Material Glucose;
    public static Material GlucoseIronSolution;
    public static Material GrapheneOxide;
    public static Material GrapheneGelSuspension;
    public static Material DryGrapheneGel;
    public static Material SupercriticalCarbonDioxide;
    public static Material PotassiumBisulfite;
    public static Material PotassiumHydroxylaminedisulfonate;
    public static Material HydroxylammoniumSulfate;
    public static Material BariumChloride;
    public static Material NitrousAcid;
    public static Material ActiniumHydride;
    public static Material GradePurifiedWater1;
    public static Material GradePurifiedWater2;
    public static Material GradePurifiedWater3;
    public static Material GradePurifiedWater4;
    public static Material GradePurifiedWater5;
    public static Material GradePurifiedWater6;
    public static Material GradePurifiedWater7;
    public static Material GradePurifiedWater8;
    public static Material GradePurifiedWater9;
    public static Material GradePurifiedWater10;
    public static Material GradePurifiedWater11;
    public static Material GradePurifiedWater12;
    public static Material GradePurifiedWater13;
    public static Material GradePurifiedWater14;
    public static Material GradePurifiedWater15;
    public static Material GradePurifiedWater16;
    public static Material Antimatter;
    public static Material PositiveElectron;
    public static Material Antiproton;
    public static Material Antineutron;
    public static Material Antihydrogen;
    public static Material Kerosene;
    public static Material Rp1;
    public static Material RocketFuelRp1;
    public static Material Hydrazine;
    public static Material DenseHydrazineFuelMixture;
    public static Material Monomethylhydrazine;
    public static Material RocketFuelCn3h7o3;
    public static Material RocketFuelH8n4c2o4;
    public static Material StellarEnergyRocketFuel;
    public static Material ExplosiveHydrazine;
    public static Material HmxExplosive;
    public static Material Desh;
    public static Material Ostrum;
    public static Material Calorite;
    public static Material LaNdOxidesSolution;
    public static Material SmGdOxidesSolution;
    public static Material TbHoOxidesSolution;
    public static Material ErLuOxidesSolution;
    public static Material LanthanumOxide;
    public static Material PraseodymiumOxide;
    public static Material NeodymiumOxide;
    public static Material CeriumOxide;
    public static Material EuropiumOxide;
    public static Material GadoliniumOxide;
    public static Material SamariumOxide;
    public static Material TerbiumOxide;
    public static Material DysprosiumOxide;
    public static Material HolmiumOxide;
    public static Material ErbiumOxide;
    public static Material ThuliumOxide;
    public static Material YtterbiumOxide;
    public static Material LutetiumOxide;
    public static Material ScandiumOxide;
    public static Material YttriumOxide;
    public static Material ZirconChlorinatingResidue;
    public static Material ZirconiumHafniumChloride;
    public static Material ZirconiumHafniumOxychloride;
    public static Material HafniumOxide;
    public static Material ZirconiumOxide;
    public static Material HafniumChloride;
    public static Material TelluriumOxide;
    public static Material SodiumEthylate;
    public static Material SodiumEthylxanthate;
    public static Material PotassiumEthylxanthate;
    public static Material PotassiumEthylate;
    public static Material NMPyrolidone;
    public static Material GammaButyrolactone;
    public static Material Butane14Diol;
    public static Material Methylamine;
    public static Material PPhenylenediamine;
    public static Material PNitroaniline;
    public static Material TerephthalicAcid;
    public static Material DimethylTerephthalate;
    public static Material TerephthaloylChloride;
    public static Material Rhugnor;
    public static Material Force;
    public static Material Tartarite;
    public static Material HotSodiumPotassium;
    public static Material SupercriticalSodiumPotassium;
    public static Material Copper76;
    public static Material CadmiumSulfide;
    public static Material CadmiumTungstate;
    public static Material BismuthGermanate;
    public static Material BismuthNitrateSolution;
    public static Material Paa;
    public static Material SilicaGelBase;
    public static Material DeglyceratedSoap;
    public static Material Turpentine;
    public static Material SteamCrackedTurpentine;
    public static Material LeachedTurpentine;
    public static Material AlmandineFront;
    public static Material ChalcopyriteFront;
    public static Material GrossularFront;
    public static Material MonaziteFront;
    public static Material NickelFront;
    public static Material PlatinumFront;
    public static Material PyropeFront;
    public static Material RedstoneFront;
    public static Material SpessartineFront;
    public static Material SphaleriteFront;
    public static Material Acrylonitrile;
    public static Material LithiumIodide;
    public static Material SilicaAluminaGel;
    public static Material ZeoliteSievingPellets;
    public static Material WetZeoliteSievingPellets;
    public static Material TertButanol;
    public static Material DitertbutylDicarbonate;
    public static Material Tertbuthylcarbonylazide;
    public static Material SodiumToluenesulfonate;
    public static Material SodiumAzide;
    public static Material SodiumAzanide;
    public static Material NitrogenPentoxide;
    public static Material AminatedFullerene;
    public static Material Azafullerene;
    public static Material AbsoluteEthanol;
    public static Material PiranhaSolution;

    public static Material SamariumRefinedPowder;
    public static Material SamariumRrareEearthTurbidLiquid;
    public static Material MonaziteRareEarthTurbidLiquid;
    public static Material ThoritePowder;
    public static Material DilutedMonaziteSlurry;
    public static Material RedZirconPowder;
    public static Material MonaziteSulfatePowder;
    public static Material DilutedMonaziteSulfateSolution;
    public static Material AcidicMonazitePowder;
    public static Material ThoriumPhosphateFilterCakePowder;
    public static Material ThoriumPhosphateRefinedPowder;
    public static Material MonaziteRareEarthFilterResiduePowder;
    public static Material NeutralizedMonaziteRareEarthFilterResiduePowder;
    public static Material UraniumFilterResiduePowder;
    public static Material NeutralizedUraniumFilterResiduePowder;
    public static Material ConcentratedMonaziteRareEarthHydroxidePowder;
    public static Material DriedConcentratedNitricMonaziteRareEarthPowder;
    public static Material ConcentratedNitrideMonaziteRareEarthSolution;
    public static Material CeriumRichMixturePowder;
    public static Material CeriumChloridePowder;
    public static Material OxalicAcid;
    public static Material VanadiumPentoxidePowder;
    public static Material CeriumOxalatePowder;
    public static Material ConcentratedCeriumChlorideSolution;
    public static Material NitricLeachateFromMonazite;
    public static Material ConcentratedNitricLeachateFromMonazite;
    public static Material CoolingConcentratedNitricMonaziteRareEarthPowder;
    public static Material MonaziteRareEarthPrecipitatePowder;
    public static Material HeterogeneousHalideMonaziteRareEarthMixturePowder;
    public static Material SaturatedMonaziteRareEarthPowder;
    public static Material SamariumPrecipitatePowder;
    public static Material ConcentratedRareEarthChlorideSolution;
    public static Material EnrichedRareEarthChlorideSolution;
    public static Material DilutedRareEarthChlorideSolution;
    public static Material SamariumRareEarthSlurry;
    public static Material NeodymiumRareEarthConcentratePowder;
    public static Material SamariumRareEarthDilutedSolution;
    public static Material SamariumOxalateWithImpurities;
    public static Material SamariumChlorideWithImpurities;
    public static Material SamariumChlorideSodiumChlorideMixturePowder;
    public static Material PhosphorusFreeSamariumConcentratePowder;
    public static Material SamariumChlorideConcentrateSolution;
    public static Material LanthanumChloride;
    public static Material LanthanumChlorideWithImpurities;
    public static Material FluoroCarbonLanthanideCeriumSolution;
    public static Material SteamCrackedFluoroCarbonLanthanideSlurry;
    public static Material ModulatedFluoroCarbonLanthanideSlurry;
    public static Material SodiumFluorosilicate;
    public static Material DilutedFluoroCarbonLanthanideSlurry;
    public static Material FilteredFluoroCarbonLanthanideSlurry;
    public static Material FluoroCarbonLanthanideCeriumOxidePowder;
    public static Material AcidLeachedFluoroCarbonLanthanideCeriumOxidePowder;
    public static Material CalcinedRareEarthOxidePowder;
    public static Material WetRareEarthOxidePowder;
    public static Material CeriumOxideRareEarthOxidePowder;
    public static Material FluoroCarbonLanthanideCeriumRareEarthOxidePowder;
    public static Material NitridedFluoroCarbonLanthanideCeriumRareEarthOxideSolution;
    public static Material FluoroCarbonLanthanideCeriumRareEarthSuspension;
    public static Material SamariumRareEarthConcentratePowder;
    public static Material FluorinatedSamariumConcentratePowder;
    public static Material SamariumTerbiumMixturePowder;
    public static Material NitridedSamariumTerbiumMixturePowder;
    public static Material TerbiumNitratePowder;
    public static Material PromethiumOxide;
    public static Material CarbonTetrachloride;
    public static Material ActiniumOxalate;
    public static Material EthylHexanol;
    public static Material P507;
    public static Material LanthanumExtractionNanoResin;
    public static Material CeriumExtractionNanoResin;
    public static Material PraseodymiumExtractionNanoResin;
    public static Material NeodymiumExtractionNanoResin;
    public static Material PromethiumExtractionNanoResin;
    public static Material SamariumExtractionNanoResin;
    public static Material EuropiumExtractionNanoResin;
    public static Material GadoliniumExtractionNanoResin;
    public static Material TerbiumExtractionNanoResin;
    public static Material DysprosiumExtractionNanoResin;
    public static Material HolmiumExtractionNanoResin;
    public static Material ErbiumExtractionNanoResin;
    public static Material ThuliumExtractionNanoResin;
    public static Material YtterbiumExtractionNanoResin;
    public static Material LutetiumExtractionNanoResin;
    public static Material ScandiumExtractionNanoResin;
    public static Material YttriumExtractionNanoResin;
    public static Material LanthanumExtractedNanoResin;
    public static Material CeriumExtractedNanoResin;
    public static Material PraseodymiumExtractedNanoResin;
    public static Material NeodymiumExtractedNanoResin;
    public static Material PromethiumExtractedNanoResin;
    public static Material SamariumExtractedNanoResin;
    public static Material EuropiumExtractedNanoResin;
    public static Material GadoliniumExtractedNanoResin;
    public static Material TerbiumExtractedNanoResin;
    public static Material DysprosiumExtractedNanoResin;
    public static Material HolmiumExtractedNanoResin;
    public static Material ErbiumExtractedNanoResin;
    public static Material ThuliumExtractedNanoResin;
    public static Material YtterbiumExtractedNanoResin;
    public static Material LutetiumExtractedNanoResin;
    public static Material ScandiumExtractedNanoResin;
    public static Material YttriumExtractedNanoResin;

    public static void init() {
        MaterialAdd.init();
        MaterialBuilder.init();

        OreProperty oreProp = Bastnasite.getProperty(PropertyKey.ORE);
        oreProp.getOreByProducts().clear();
        oreProp.setOreByProducts(Neodymium, Monazite);

        oreProp = Redstone.getProperty(PropertyKey.ORE);
        oreProp.getOreByProducts().clear();
        oreProp.setOreByProducts(Cinnabar, Ruby, Glowstone);

        oreProp = Neodymium.getProperty(PropertyKey.ORE);
        oreProp.getOreByProducts().clear();
        oreProp.setOreByProducts(SamariumRefinedPowder);

        oreProp = Monazite.getProperty(PropertyKey.ORE);
        oreProp.getOreByProducts().clear();
        oreProp.setOreByProducts(Thorium, Neodymium, Bastnasite);

        TagPrefix.gem.setIgnored(Fluix, AEItems.FLUIX_CRYSTAL);
        TagPrefix.block.setIgnoredBlock(Fluix, AEBlocks.FLUIX_BLOCK.block());
        TagPrefix.dust.setIgnored(Fluix, AEItems.FLUIX_DUST);

        TagPrefix.gem.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);
        TagPrefix.block.setIgnoredBlock(CertusQuartz, AEBlocks.QUARTZ_BLOCK.block());
        TagPrefix.dust.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
        TagPrefix.dust.setIgnored(EnderPearl, AEItems.ENDER_DUST);

        if (!Platform.isDevEnv()) {
            TagPrefix.ingot.setIgnored(Crystalmatrix, ModItems.crystal_matrix_ingot);
            TagPrefix.ingot.setIgnored(Infinity, ModItems.infinity_ingot);
            TagPrefix.nugget.setIgnored(Infinity, ModItems.infinity_nugget);
            TagPrefix.block.setIgnored(Infinity, ModBlocks.infinity);
        }
    }
}
