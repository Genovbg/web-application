/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Stefan
 */
@ManagedBean
@RequestScoped
public class SightBean {
    private  List<Sight> south;
    private  List<Sight> north;
    
    

    /**
     * Creates a new instance of SightBean
     */
    public SightBean() {
        south = new ArrayList<Sight>();
        north = new ArrayList<Sight>();
        
        south.add(new Sight("/images/2.jpg","Света Богородица","Монументът „Света Богородица“ в Хасково представлява издигаща се над града от височината на Младежкия хълм, статуя от полимер-бетон на считаната за покровителка на града Света Богородица с Младенеца.\n"+
                "Скулптурата, висока 14 метра и тежаща 80 тона, стои върху 17-метров постамент, който отвътре представлява параклис. С тази статуя през 2004 г. градът влиза в раздел “Религия” на Книгата на Гинес като най-високата статуя на Богородица с Младенеца"));
        south.add(new Sight("/images/7.jpg","Перперикон","Перперикон се намира на 15 km североизточно от днешния гр. Кърджали, в долина, дълга 10 km и широка 3 – 4 km (ок. 300 – 370 m над м.р.), през която тече златоносната Перперишка река (Perperischka).\n" +
                "Перперикон се намира на десния бряг на реката, над село Горна крепост. Площта му е около 12 km². Мегалитният комплекс, най-големият на Балканския полуостров, има площ от 5 km². Светилището на траките е разположено на 470 m над морското равнище,\n" +
                "на скала, на върха на хълм.\n" +
                "Перперикон е един от стоте национални туристически обекта в България."));
        south.add(new Sight("/images/8.jpg","Траянови врата","Съвременното наименование Траянови врата идва от некоректното приписване на римската крепост в прохода на император Траян (53 – 117). В действителност става дума за по-късно съоръжение – реставрираните руини\n"+
                 " в прохода, известни в момента като „Крепост Траянови врата“ са останки от крепостния комплекс Стенос, изграден през V век. проф. Петър Мутафчиев извежда тезата, че топонимът „Траянови врата“ е използван за първи път чак в XV век в летописа „Унгарското кралство“ \n"+
                 "на Антонио Бонфини, където се описва кръстоносния поход на крал Владислав Варненчик срещу Османската империя през 1443 – 1444 г ."));
        south.add(new Sight("/images/9.jpg","Дяволски мост","Намира се в живописен пролом на около 10 километра северозападно от град Ардино, близо до село Дядовци и недалеч от село Латинка. Мостът е построен в началото на 16 век по заповед на султан Селим I като част от път,\n"+
                "свързващ Горнотракийската низина с Беломорска Тракия и Егейско море. На мястото на днешния мост някога е имало римски мост, част от значимия античен път Виа Игнация, свързващ Бяло море и Тракия през прохода Маказа. По нареждане на султан Селим I мостът е възстановен,\n"+
                "за да продължат търговските връзки между двата географски района. Той е бил известен с името Шейтан кюприя."));
        south.add(new Sight("/images/11.jpg","Рилският манастир","Рилският манастир е един от най-значимите културни паметници в България, символ на България, включен в списъка за световното наследство на ЮНЕСКО.Манастирът „Свети Иван Рилски“ е построен на мястото на стара постница през 927 – 941 г. от Иван Рилски\n"+
                 " (според някои автори – от неговите ученици) в Рила планина. В двора на днешния манастир през 1335 г. е издигната отбранителна кула и малка еднокорабна черква от местния феодален владетел протосеваст Хрельо. Кулата е най-старата запазена сграда в манастирския комплекс и по стил принадлежи към архитектурата\n"+
                 " на Търновската художествена школа. На върха на кулата се намира параклисът „Св. Преображение“ с ценни фрески от 30-те години на 14 век."));
        south.add(new Sight("/images/12.jpg","Асенова крепост","Намира се в планината Родопи на 2 км от Асеновград, България.\n" +
"Крепостта е съществувала още по времето на траките, преустроена е от Византия през IX век, за да охранява вратата на Беломорския проход и да осигури византийската граница в този край. Първите писмени сведения за крепостта са от XI век и са получени от устава на тогава построения Бачковски манастир. От тези сведения се вижда, че Асеновата крепост\n"+
                " е притежавала собствена охрана и администрация. Превземана е от кръстоносците по времето на Четвъртия кръстоносен поход. Крепостта съществува до 1410 г., разрушена е от нахлуващите османски войски."));
        
                
        north.add(new Sight("/images/1.jpg","Царевец","Крепостта Царевец е разположена край самия център на град Велико Търново. Тя е била главната българска крепост по време на Второто българско царство (1185 – 1393), когато Търново е столица на царството. През Средновековието хълмът, на който е ситуирана, е изцяло застроен с жилищни и административни постройки.\n" +
                 "Царевец е сред Стоте национални туристически обекта, има печат на БТС.Царевец, Момина крепост и Трапезица се намират в град Велико Търново.\n" +
                 "Легенда разказва, че там в римско време имало укрепления, които охранявали пътя за великолепния Никополис. Когато варварите нахлули, обсадили и разрушили великия град.\n" +
                 "Тогава римляните се настанили в калетата. Под тях имало големи подземия свързани с тунел. В галериите римляните пренесли съкровищата на Никополис. Крепостите римляните укрепили и задържали известно време. Когато се наложило да отстъпят, те направили смъртоносни механизми в галериите и ги намазали с отрова. Тайните входове маскирали. Входът на подземието под Царевец се намирал в южната част. По галерия се стигало до подземно езеро. Само човек, знаещ тайната на съкровището можел да продължи. Скрит механизъм източвал водата и по стъпала се стигала друга галерия."));
        north.add(new Sight("/images/3.jpg","Преображенски манастир","Преображенският манастир е най-големия от манастирите разположени около Велико Търново и 4-ти по големина в България.\n" +
                 "Основан е по времето на Втората българска държава през 13-14в. Първоначално манастира е бил метох на Ватопедския манастир от Света Гора, но през 1360г. се сдобива с автономност. Възникването на Преображенския манастир се свързава с личността на втората жена на българския цар Иван-Александър – Сара и сина им цар Иван Шишман, които дараяват много средства за неговата реконструкция и ремонт. Поради това манастирът е известен и като Сарин или Шишманов. Той играе и важна роля в духовния живот на българаската столица през 14в.в."));
        north.add(new Sight("/images/10.jpg","Белоградчишки скали","Белоградчишките скали са скални фигури, високи до 200 m,\n" +
                 "разположени в Западния Предбалкан, близо до град Белоградчик. Скалите варират в цветове от чисто червено до жълто. Много от скалите имат фантастични форми и са включени в интересни легенди. Те често са наричани на хора или предмети, на които приличат или напомнят. Белоградчишките скали са вписани като природни забележителности от българското правителство и са главната туристическа атракция в региона.\n" +
                 "Образуват ивица с дължина 30 km и ширина до 3 km. Включени са в списъка на Стоте национални туристически обекта."));
        north.add(new Sight("/images/5.jpg","Панорама Плевенска епопея - 1877 г.","Панорамата „Плевенска епопея 1877 г.“ е художествен музей в Плевен, построен в чест на 100-годишнината от Освобождението на Плевен от османско иго.\n" +
                 "В първите 3 години след нейното откриване панорамата е посетена от 2,5 милиона души. Тя е сред почти 200-те паметници, построени от плевенчани в памет на загиналите руснаци, румънци и българи. Включена е в Стоте национални туристически обекта.\n" +
                 "Изградена е в района на „Скобелевия парк“, непосредствено до редута „Кованлък“, където по време на 3-та атака от Обсадата на Плевен се водят едни от най-тежките сражения. Автори на проекта са архитектите Иво Петров и Пламена Цачева, заедно с проектантски екип от 14 души."));
        north.add(new Sight("/images/4.jpg","Манастир Св. Троица","Основан през 1070г. и основание за това предположение дава надпис намерен при строежа на новата църква през 1847г. Според друга версия, обителта е основана по време на царуването на Иван Александър от Теодосий Търновски и Патриарх Евтимий. През 1375г. монах Евтимий бил избран за патриарх в Търново и от тогава обителта се назовава Патриаршеска. Манастирът Св. Троица\n"
                + " става център на прочута книжовна школа \"Търновско училище\". Нейно дело е голямата правописна реформа и създадените езикови норми. В книжовната школа получават образованието си известни писатели, като Григорий Цамблак и Константин Костенечки."));
        north.add(new Sight("/images/6.jpg","Бабини Видини кули","Баба Вида е разположена на големия завой на река Дунав при град Видин.\n" +
                "Значително е разширена и укрепена по времето на цар Иван Срацимир. Голяма част от сградите, построени по онова време, са останали неразрушени. "
                + "Тя е най-укрепената част от Видинската градска крепост – наричана от турците Девствената крепост поради това, че никога не е била завземана със сила.\n" +
                "В днешния си вид крепостта разполага с двор с площ над 5 декара. Състои се от 2 основни стени (в 2 концентрични четириъгълника) и 4 кули. Външните стени са опасани с ров с вода, "
                + "над който е имало повдиган мост (сега е каменен) към входа на крепостта."));
        
        
    }
    
    public List<Sight> getSouth(){
        return south;
    }
    
     public List<Sight> getNorth(){
        return north;
    }
    
    }
    

