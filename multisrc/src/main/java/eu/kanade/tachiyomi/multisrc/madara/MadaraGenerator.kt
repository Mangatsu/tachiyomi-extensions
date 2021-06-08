package eu.kanade.tachiyomi.multisrc.madara

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MadaraGenerator : ThemeSourceGenerator {

    override val themePkg = "madara"

    override val themeClass = "Madara"

    override val baseVersionCode: Int = 5

    override val sources = listOf(
            SingleLang("247Manga", "https://247manga.com", "en", className = "Manga247"),
            SingleLang("24hRomance", "https://24hromance.com", "en", className = "Romance24h"),
            SingleLang("Adonis Fansub", "https://manga.adonisfansub.com", "tr", overrideVersionCode = 1),
            SingleLang("AkuManga", "https://akumanga.com", "ar"),
            SingleLang("AllPornComic", "https://allporncomic.com", "en", isNsfw = true),
            SingleLang("Aloalivn", "https://aloalivn.com", "en", overrideVersionCode = 2),
            SingleLang("AniMangaEs", "https://animangaes.com", "en", overrideVersionCode = 1),
            SingleLang("Anisa Manga", "https://anisamanga.com", "tr"),
            SingleLang("Agent of Change Translations", "https://aoc.moe", "en", overrideVersionCode = 1),
            SingleLang("ApollComics", "https://apollcomics.xyz", "es", overrideVersionCode = 1),
            SingleLang("Arang Scans", "https://arangscans.com", "en", overrideVersionCode = 3), // removed override
            SingleLang("ArazNovel", "https://www.araznovel.com", "tr", overrideVersionCode = 1),
            SingleLang("Argos Scan", "https://argosscan.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("Asgard Team", "https://www.asgard1team.com", "ar", overrideVersionCode = 1),
            SingleLang("Arthur Scan", "https://arthurscan.xyz", "pt-BR", overrideVersionCode = 1),
            SingleLang("Astral Library", "https://www.astrallibrary.net", "en", overrideVersionCode = 2),
            SingleLang("Atikrost", "https://atikrost.com", "tr", overrideVersionCode = 1),
            SingleLang("AYATOON", "https://ayatoon.com", "tr", overrideVersionCode = 1),
            SingleLang("Azora", "https://azoramanga.com", "ar", overrideVersionCode = 1),
            SingleLang("BL Manhwa Club", "https://blmanhwa.club", "pt-BR", isNsfw = true, className = "BlManhwaClub", overrideVersionCode = 1),
            SingleLang("Banana Mecânica", "https://leitorbm.com", "pt-BR", isNsfw = true, pkgName = "bananamecanica", className = "BananaMecanica", overrideVersionCode = 1),
            SingleLang("Bakaman", "https://bakaman.net", "th", overrideVersionCode = 1),
            SingleLang("BestManga", "https://bestmanga.club", "ru"),
            SingleLang("BestManhua", "https://bestmanhua.com", "en", overrideVersionCode = 2),
            SingleLang("BoysLove", "https://boyslove.me", "en", overrideVersionCode = 1),
            SingleLang("Bread Factory", "https://www.breadfactory.site", "en"),
            SingleLang("Café com Yaoi", "http://cafecomyaoi.com.br", "pt-BR", pkgName = "cafecomyaoi", className = "CafeComYaoi", isNsfw = true),
            SingleLang("CatOnHeadTranslations", "https://catonhead.com", "en", overrideVersionCode = 1),
            SingleLang("CAT-translator", "https://cat-translator.com", "th", className = "CatTranslator"),
            SingleLang("Cerise Scans", "https://cerisescans.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Chibi Manga", "https://www.cmreader.info", "en", overrideVersionCode = 1),
            SingleLang("Clover Manga", "https://clover-manga.com", "tr", overrideVersionCode = 2),
            SingleLang("ComicKiba", "https://comickiba.com", "en", overrideVersionCode = 1),
            SingleLang("Comicdom", "https://comicdom.org", "en", overrideVersionCode = 1),
            SingleLang("Comics Valley", "https://comicsvalley.com", "hi", isNsfw = true),
            SingleLang("CopyPasteScan", "https://copypastescan.xyz", "es", overrideVersionCode = 1),
            SingleLang("Cutie Pie", "https://cutiepie.moe", "tr", overrideVersionCode = 1),
            SingleLang("DarkYue Realm", "https://darkyuerealm.site/web", "pt-BR", pkgName = "darkyurealm", overrideVersionCode = 3),
            SingleLang("Decadence Scans", "https://reader.decadencescans.com", "en", overrideVersionCode = 1),
            SingleLang("شبكة كونان العربية", "https://www.manga.detectiveconanar.com", "ar", className = "DetectiveConanAr", overrideVersionCode = 1),
            SingleLang("DiamondFansub", "https://diamondfansub.com", "tr"),
            SingleLang("Disaster Scans", "https://disasterscans.com", "en", overrideVersionCode = 1),
            SingleLang("DoujinHentai", "https://doujinhentai.net", "es", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Dream Manga", "https://en.ruyamanga.com", "en", overrideVersionCode = 2),
            SingleLang("Drope Scan", "https://dropescan.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("FDM Scan", "https://fdmscan.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("1st Kiss", "https://1stkissmanga.com", "en", className = "FirstKissManga", overrideVersionCode = 2),
            SingleLang("1st Kiss Manhua", "https://1stkissmanhua.com", "en", className = "FirstKissManhua", overrideVersionCode = 1),
            SingleLang("Fênix Scanlator", "https://fenixscanlator.xyz", "pt-BR", pkgName = "fenixscanlator", className = "FenixScanlator", overrideVersionCode = 1),
            SingleLang("FreeWebtoonCoins", "https://freewebtooncoins.com", "en", overrideVersionCode = 1),
            SingleLang("TheFluffyHangoutGroup", "https://www.fluffyhangout.club", "en", overrideVersionCode = 1),
            SingleLang("Furio Scans", "https://furioscans.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("موقع لترجمة المانجا", "https://golden-manga.com", "ar", className = "GoldenManga"),
        	SingleLang("GalaxyDegenScans", "https://gdegenscans.xyz/", "en", overrideVersionCode = 1),
            SingleLang("Glory Scans", "https://gloryscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Graze Scans", "https://grazescans.com/", "en", overrideVersionCode = 1),
            SingleLang("GuncelManga", "https://guncelmanga.com", "tr"),
            SingleLang("Hero Manhua", "https://heromanhua.com", "en"),
            SingleLang("Heroz Scanlation", "https://herozscans.com", "en", overrideVersionCode = 1),
            SingleLang("Himera Fansub", "https://himera-fansub.com", "tr"),
            SingleLang("Hiperdex", "https://hiperdex.com", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Hscans", "https://hscans.com", "en", overrideVersionCode = 1),
            SingleLang("Hunter Fansub", "https://hunterfansub.com", "es", overrideVersionCode = 1),
            SingleLang("Ichirin No Hana Yuri", "https://ichirinnohanayuri.com.br", "pt-BR", overrideVersionCode = 3),
            SingleLang("Immortal Updates", "https://immortalupdates.com", "en", overrideVersionCode = 1),
            SingleLang("Império dos Otakus", "https://imperiodosotakus.tk", "pt-BR", className = "ImperioDosOtakus", overrideVersionCode = 1),
            SingleLang("IsekaiScan.com", "https://isekaiscan.com", "en", className = "IsekaiScanCom", overrideVersionCode = 2),
            SingleLang("IsekaiScanManga (unoriginal)", "https://isekaiscanmanga.com", "en", className = "IsekaiScanManga", overrideVersionCode = 1),
            SingleLang("Its Your Right Manhua", "https://itsyourightmanhua.com/", "en", overrideVersionCode = 1),
            SingleLang("JJutsuScans", "https://jjutsuscans.com", "en", overrideVersionCode = 1),
            SingleLang("KisekiManga", "https://kisekimanga.com", "en", overrideVersionCode = 1),
            SingleLang("Kissmanga.in", "https://kissmanga.in", "en", className= "KissmangaIn", overrideVersionCode = 1),
            SingleLang("KlikManga", "https://klikmanga.com", "id", overrideVersionCode = 1),
            SingleLang("Kombatch", "https://kombatch.com", "id"),
            SingleLang("Kun Manga", "https://kunmanga.com", "en", overrideVersionCode = 1),
            SingleLang("Levelerscans", "https://levelerscans.xyz", "en", overrideVersionCode = 1),
            SingleLang("Lily Manga", "https://lilymanga.com", "en"),
            SingleLang("LovableSubs", "https://lovablesubs.com", "tr"),
            SingleLang("Manga18 Fx", "https://manga18fx.com", "en", overrideVersionCode = 1),
            SingleLang("Manga347", "https://manga347.com", "en", overrideVersionCode = 3),
            SingleLang("مانجا العاشق", "https://3asq.org", "ar", className = "Manga3asq"),
            SingleLang("Manga3S", "https://manga3s.com", "en", overrideVersionCode = 1),
            SingleLang("Manga68", "https://manga68.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Action", "https://manga-action.com", "ar", overrideVersionCode = 1),
            SingleLang("مانجا عرب تيم Manga Arab Team", "https://mangaarabteam.com", "ar", className = "MangaArabTeam"),
            SingleLang("MangaBaz", "https://mangabaz.com", "tr"),
            SingleLang("Manga Bin", "https://mangabin.com/", "en", overrideVersionCode = 1),
            SingleLang("MangaBob", "https://mangabob.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Chill", "https://mangachill.com/", "en", overrideVersionCode = 1),
            SingleLang("Manga Clash", "https://mangaclash.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Crab", "https://mangacrab.com", "es"),
            SingleLang("MangaCultivator", "https://mangacultivator.com", "en", overrideVersionCode = 1),
            SingleLang("MangaDods", "https://www.mangadods.com", "en", overrideVersionCode = 2),
            SingleLang("Manga Drop Out", "https://www.mangadropout.xyz", "id", isNsfw = true, overrideVersionCode = 1),
            SingleLang("MangaEffect", "https://mangaeffect.com", "en", overrideVersionCode = 1),
            SingleLang("MangaGreat", "https://mangagreat.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Hentai", "https://mangahentai.me", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Mangakik", "https://mangakik.com", "en"),
            SingleLang("Manga Kiss", "https://mangakiss.org", "en", overrideVersionCode = 1),
            SingleLang("MangaKitsune", "https://mangakitsune.com", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("MangaKomi", "https://mangakomi.com", "en", overrideVersionCode = 2),
            SingleLang("Manga Land Arabic", "https://mangalandarabic.com", "ar"),
            SingleLang("مانجا ليك", "https://mangalek.com", "ar", className = "Mangalek"),
            SingleLang("MangaLazy", "https://mangalazy.com", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("MangaLionz", "https://mangalionz.com", "ar"),
            SingleLang("مانجا لينك", "https://mangalink.io", "ar", className = "MangaLinkio", overrideVersionCode = 1),
            SingleLang("Manga Lord", "https://mangalord.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Nine", "https://manganine.com", "en", overrideVersionCode = 1),
            SingleLang("Manga-Online.co", "https://www.manga-online.co", "th", className = "MangaOnlineCo"),
            SingleLang("Mangas Origines", "https://mangas-origines.fr", "fr" , true, overrideVersionCode = 1),
            SingleLang("Manga Diyari", "https://manga-diyari.com", "tr", overrideVersionCode = 1),
            SingleLang("MangaRave", "https://www.mangarave.com", "en", overrideVersionCode = 2),
            SingleLang("ManhwaLive", "https://manhwa.live", "en", overrideVersionCode = 1),
            SingleLang("Manga Read", "https://mangaread.co", "en", overrideVersionCode = 1),
            SingleLang("MangaRead.org", "https://www.mangaread.org", "en", className = "MangaReadOrg", overrideVersionCode = 1),
            SingleLang("Mangareceh", "https://mangareceh.id", "id"),
            SingleLang("Manga Rock Team", "https://mangarockteam.com", "en", overrideVersionCode = 1),
            SingleLang("Manga Rocky", "https://mangarocky.com", "en", overrideVersionCode = 1),
            SingleLang("MangaRoma", "https://mangaroma.com", "en"),
            SingleLang("Manga-Scantrad", "https://manga-scantrad.net", "fr", className = "MangaScantrad", overrideVersionCode = 1),
            SingleLang("MangaSco", "https://mangasco.com", "en", overrideVersionCode = 1),
            SingleLang("MangaSpark", "https://mangaspark.com", "ar"),
            SingleLang("Manga Starz", "https://mangastarz.com", "ar"),
            SingleLang("MangaStein", "https://mangastein.com", "tr"),
            SingleLang("Mangasushi", "https://mangasushi.net", "en", overrideVersionCode = 1),
            SingleLang("Manga SY", "https://www.mangasy.com", "en", overrideVersionCode = 1),
            SingleLang("MangaTeca", "https://www.mangateca.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("Manga Too", "https://mangatoo.com/", "en", overrideVersionCode = 1),
            SingleLang("Manga Turf", "https://mangaturf.com", "en"),
            SingleLang("MangaTX", "https://mangatx.com", "en", overrideVersionCode = 1),
            SingleLang("Mangauptocats", "https://mangauptocats.online", "th"),
            SingleLang("MangaUS", "https://mangaus.xyz", "en", overrideVersionCode = 2),
            SingleLang("Manga Weebs", "https://mangaweebs.in", "en", overrideVersionCode = 1),
            SingleLang("MangaWT", "https://mangawt.com", "tr"),
            SingleLang("MangaYaku", "https://mangayaku.com", "id", overrideVersionCode = 1),
            SingleLang("MangaYosh", "https://mangayosh.xyz", "id"),
            SingleLang("Mangazuki.me", "https://mangazuki.me", "en", className = "MangazukiMe", overrideVersionCode = 1),
            SingleLang("Mangceh", "https://mangceh.com", "id", isNsfw = true, overrideVersionCode = 1),
            SingleLang("ManhuaBox", "https://manhuabox.net", "en", overrideVersionCode = 1),
            SingleLang("Manhua ES", "https://manhuaes.com", "en", overrideVersionCode = 4),
            SingleLang("ManhuaFast", "https://manhuafast.com", "en", overrideVersionCode = 1),
            SingleLang("Manhuaga", "https://manhuaga.com", "en", overrideVersionCode = 1),
            SingleLang("Manhualo", "https://manhualo.com", "en", overrideVersionCode = 1),
            SingleLang("Manhua Plus", "https://manhuaplus.com", "en", overrideVersionCode = 3),
            SingleLang("Manhuas.net", "https://manhuas.net", "en", className = "Manhuasnet", overrideVersionCode = 1),
            SingleLang("Manhuas World", "https://manhuasworld.com", "en"),
            SingleLang("Manhua SY", "https://www.manhuasy.com", "en", overrideVersionCode = 1),
            SingleLang("ManhuaUS", "https://manhuaus.com", "en", overrideVersionCode = 2),
            SingleLang("Manhwa Raw", "https://manhwaraw.com", "ko"),
            SingleLang("Manhwa18.org", "https://manhwa18.org", "en", isNsfw = true, className = "Manhwa18Org", overrideVersionCode = 1),
            SingleLang("مانجا العرب", "https://www.manhwa.ae", "ar", className = "ManhwaAe"),
            SingleLang("Manhwatop", "https://manhwatop.com", "en", overrideVersionCode = 1),
            SingleLang("Manwahentai.me", "https://manhwahentai.me", "en", className = "ManwahentaiMe", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Manhwa.club", "https://manhwa.club", "en", className="ManwhaClub", overrideVersionCode = 2), // wrong class name for backward compatibility
            SingleLang("ManyToon", "https://manytoon.com", "en", overrideVersionCode = 1),
            SingleLang("ManyToonClub", "https://manytoon.club", "ko"),
            SingleLang("ManyToon.me", "https://manytoon.me", "en", className = "ManyToonMe", overrideVersionCode = 1),
            SingleLang("Mark Scans", "https://markscans.online", "pt-BR", overrideVersionCode = 2),
            SingleLang("MG Komik", "https://mgkomik.my.id", "id", overrideVersionCode = 1),
            SingleLang("Midnight Mess Scans", "https://midnightmess.org", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Milftoon", "https://milftoon.xxx", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Mixed Manga", "https://mixedmanga.com", "en", overrideVersionCode = 1),
            SingleLang("MMScans", "https://mm-scans.com/", "en", overrideVersionCode = 1),
            SingleLang("Mode Scanlator", "https://modescanlator.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Mundo Wuxia", "https://mundowuxia.com", "es"),
            SingleLang("Mystical Merries", "https://mysticalmerries.com", "en", overrideVersionCode = 1),
            SingleLang("NeatManga", "https://neatmanga.com", "en", overrideVersionCode = 1),
            SingleLang("NekoScan", "https://nekoscan.com", "en", overrideVersionCode = 1),
            SingleLang("Neox Scanlator", "https://neoxscans.net", "pt-BR", overrideVersionCode = 5),
            SingleLang("Night Comic", "https://www.nightcomic.com", "en", overrideVersionCode = 1),
            SingleLang("Niji Translations", "https://niji-translations.com", "ar"),
            SingleLang("Ninjavi", "https://ninjavi.com", "ar", overrideVersionCode = 1),
            SingleLang("Nitro Scans", "https://nitroscans.com", "en"),
            SingleLang("NovelMic", "https://novelmic.com", "en", overrideVersionCode = 1),
            SingleLang("Off Scan", "https://offscan.top", "pt-BR", overrideVersionCode = 2),
            SingleLang("OnManga", "https://onmanga.com", "en", overrideVersionCode = 1),
            SingleLang("Origami Orpheans", "https://origami-orpheans.com.br", "pt-BR", overrideVersionCode = 2),
            SingleLang("Paean Scans", "https://paeanscans.com", "en", overrideVersionCode = 1),
            SingleLang("Painful Nightz Scan", "https://painfulnightzscan.com", "en"),
            SingleLang("Platinum Crown", "https://platinumscans.com", "en", overrideVersionCode = 1),
            SingleLang("Pojok Manga", "https://pojokmanga.com", "id", overrideVersionCode = 1),
            SingleLang("PornComix", "https://www.porncomixonline.net", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Projeto Scanlator", "https://projetoscanlator.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("QueensManga ملكات المانجا", "https://queensmanga.com", "ar", className = "QueensManga"),
            SingleLang("Random Translations", "https://randomtranslations.com", "en", overrideVersionCode = 1),
            SingleLang("RawDEX", "https://rawdex.net", "ko", isNsfw = true),
            SingleLang("Raw Mangas", "https://rawmangas.net", "ja", isNsfw = true, overrideVersionCode = 1),
            SingleLang("ReadManhua", "https://readmanhua.net", "en", overrideVersionCode = 2),
            SingleLang("Renascence Scans (Renascans)", "https://new.renascans.com", "en", className = "RenaScans", overrideVersionCode = 1),
            SingleLang("Rüya Manga", "https://www.ruyamanga.com", "tr", className = "RuyaManga"),
            SingleLang("S2Manga", "https://s2manga.com", "en", overrideVersionCode = 1),
            SingleLang("SamuraiScan", "https://samuraiscan.com", "es"),
            SingleLang("Setsu Scans", "https://setsuscans.com", "en"),
            SingleLang("Shield Manga", "https://shieldmanga.club", "en", overrideVersionCode = 2),
            SingleLang("Shinzoo Scan", "https://shinzooscan.xyz", "pt-BR", overrideVersionCode = 2),
            SingleLang("Shooting Star Scans", "https://shootingstarscans.xyz", "en", overrideVersionCode = 1),
            SingleLang("ShoujoHearts", "https://shoujohearts.com", "en", overrideVersionCode = 2),
            SingleLang("SISI GELAP", "https://sisigelap.club/", "id", overrideVersionCode = 1),
            SingleLang("SiXiang Scans", "http://www.sixiangscans.com", "en", overrideVersionCode = 1),
            SingleLang("Siyahmelek", "https://siyahmelek.com", "tr", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Skymanga", "https://skymanga.co", "en", overrideVersionCode = 1),
            SingleLang("Sleepy Translations", "https://sleepytranslations.com/", "en", overrideVersionCode = 1),
            SingleLang("SocialWeebs", "https://socialweebs.in/", "en"),
            SingleLang("SoloScanlation", "https://soloscanlation.site", "en"),
            SingleLang("StageComics", "https://stagecomics.com", "pt-BR", overrideVersionCode = 2),
            SingleLang("Sugar Babies", "https://sugarbscan.com", "en", overrideVersionCode = 1),
            SingleLang("Sweet Time Scan", "https://sweetscan.net", "pt-BR", overrideVersionCode = 1),
            SingleLang("TheTopComic", "https://thetopcomic.com", "en"),
            SingleLang("365Manga", "https://365manga.com", "en", className = "ThreeSixtyFiveManga", overrideVersionCode = 1),
            SingleLang("ToonGod", "https://www.toongod.com", "en", overrideVersionCode = 1),
            SingleLang("Toonily", "https://toonily.com", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Toonily.net", "https://toonily.net", "en", isNsfw = true, className = "ToonilyNet", overrideVersionCode = 1),
            SingleLang("Top Manhua", "https://topmanhua.com", "en", overrideVersionCode = 1),
            SingleLang("TritiniaScans", "https://tritinia.com", "en", overrideVersionCode = 1),
            SingleLang("TruyenTranhAudio.com", "https://truyentranhaudio.com", "vi", className = "TruyenTranhAudioCom"),
            SingleLang("TruyenTranhAudio.online", "https://truyentranhaudio.online", "vi", className = "TruyenTranhAudioOnline"),
            SingleLang("Tsundoku Traduções", "https://tsundokutraducoes.com.br", "pt-BR", pkgName = "tsundokutraducoes", className = "TsundokuTraducoes", overrideVersionCode = 2),
            SingleLang("Türkçe Manga", "https://turkcemanga.com", "tr", className = "TurkceManga"),
            SingleLang("Twilight Scans", "https://twilightscans.com", "en", overrideVersionCode = 1),
            SingleLang("Unemployed Scans", "https://unemployedscans.com", "en", overrideVersionCode = 1),
            SingleLang("Uyuyan Balik", "https://uyuyanbalik.com/", "tr"),
            SingleLang("Vanguard Bun", "https://vanguardbun.com/", "en", overrideVersionCode = 1),
            SingleLang("Volkan Scans", "https://volkanscans.com", "en", overrideVersionCode = 1),
            SingleLang("Wakascan", "https://wakascan.com", "fr", overrideVersionCode = 1),
            SingleLang("War Queen Scan", "https://wqscan.com.br", "pt-BR", overrideVersionCode = 3),
            SingleLang("WebNovel", "https://webnovel.live", "en", className = "WebNovelLive", overrideVersionCode = 3),
            SingleLang("Webtoon Hatti", "https://webtoonhatti.com/", "tr"),
            SingleLang("WebToonily", "https://webtoonily.com", "en"),
            SingleLang("WebtoonUK", "https://webtoon.uk", "en", overrideVersionCode = 1),
            SingleLang("WebtoonXYZ", "https://www.webtoon.xyz", "en", overrideVersionCode = 1),
            SingleLang("WoopRead", "https://woopread.com", "en", overrideVersionCode = 1),
            SingleLang("WuxiaWorld", "https://wuxiaworld.site", "en", overrideVersionCode = 1),
            SingleLang("Yaoi Fan Clube", "https://yaoifanclube.com.br", "pt-BR", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Yaoi Toshokan", "https://yaoitoshokan.net", "pt-BR", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Yokai Jump", "https://yokaijump.fr", "fr"),
            SingleLang("Yuri Verso", "https://yuri.live", "pt-BR", overrideVersionCode = 2),
            SingleLang("Zin Translator", "https://zinmanga.com", "en", overrideVersionCode = 1),
            SingleLang("Sleeping Knight Scans", "https://skscans.com", "en", overrideVersionCode = 2),
            MultiLang("Leviatan Scans", "https://leviatanscans.com", listOf("en", "es"),
                className = "LeviatanScansFactory", overrideVersionCode = 4),
            SingleLang("Leviatan Scans X", "https://xxx.leviatanscans.com", "en", isNsfw = true),
            SingleLang("Manga1st", "https://manga1st.com", "en", overrideVersionCode = 1),
            SingleLang("Manga1st.online", "https://manga1st.online", "en", className = "MangaFirstOnline", overrideVersionCode = 1),
            SingleLang("Imperfect Comics", "https://imperfectcomic.com", "en"),
            SingleLang("Ookamii Manga", "https://manga.ookamii.xyz/", "en"),
            SingleLang("Mortals Groove", "https://mortalsgroove.com", "en"),
            SingleLang("Cervo Scanlator", "https://cervoscan.xyz", "pt-BR", overrideVersionCode = 2),
            SingleLang("Comic Star", "https://comicstar.org", "en"),
            SingleLang("Reset Scans", "https://reset-scans.com", "en", overrideVersionCode = 3),
            SingleLang("XuN Scans", "https://reader.xunscans.xyz", "en", overrideVersionCode = 1),
            SingleLang("Sani-Go", "https://sani-go.net", "ar", className = "SaniGo"),
            SingleLang("Random Scan", "https://randomscan.online", "pt-BR", overrideVersionCode = 3),
            SingleLang("Fukushuu no Yuusha", "https://fny-scantrad.com", "fr", overrideVersionCode = 1),
            SingleLang("Three Queens Scanlator", "https://tqscan.com.br", "pt-BR", overrideVersionCode = 2),
            SingleLang("Winter Scan", "https://winterscan.com.br", "pt-BR", overrideVersionCode = 2),
            SingleLang("Little Monster Scan", "https://littlemonsterscan.com.br", "pt-BR", overrideVersionCode = 2),
            SingleLang("Wonderland", "https://landwebtoons.site", "pt-BR", overrideVersionCode = 2),
            SingleLang("Pornwha", "https://pornwha.com", "en", isNsfw = true),
            SingleLang("Wakamics", "https://wakamics.net", "en"),
            SingleLang("Traducciones Amistosas", "https://nartag.com", "es", overrideVersionCode = 1),
            SingleLang("MangaYami", "https://www.mangayami.club", "en", overrideVersionCode = 2),
            SingleLang("Manga Fenix", "https://manga-fenix.com", "es", overrideVersionCode = 1),
            SingleLang("Manga Mitsu", "https://mangamitsu.com", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Fudido Scanlator", "https://fudidoscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Yaoi Manga", "https://yaoi.mobi", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Free Manga", "https://freemanga.me", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("MangaTuli", "https://mangatuli.com", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("ManhuaPro", "https://manhuapro.com", "en", overrideVersionCode = 1),
            SingleLang("Hentaidexy", "https://hentaidexy.com", "en", isNsfw = true),
            SingleLang("MangaPL", "https://mangapl.com", "en", isNsfw = true)
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MadaraGenerator().createAll()
        }
    }
}
