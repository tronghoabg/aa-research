package Va;

/* loaded from: classes4.dex */
public final class Z7 implements Q6 {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f13895e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f13896f;

    /* renamed from: g, reason: collision with root package name */
    public static int f13897g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13898h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final E7 f13899a = new E7(1);

    /* renamed from: b, reason: collision with root package name */
    public final E7 f13900b = new E7(2);

    /* renamed from: c, reason: collision with root package name */
    public final E7 f13901c = new E7(4);

    /* renamed from: d, reason: collision with root package name */
    public final E7 f13902d = new E7(0);

    static {
        char[] cArr = new char[2104];
        R8.v.k("\u0000c4\u0098i\u009e\u009e\u009cÓ\u0096\b =¥r¯§ýÜÁ\u0011ÒFï{ý°îåñ\u0000c4\u0098i\u009e\u009e\u009cÓ\u0096\b =¥r¯§÷ÜÍ\u0011ÌFø{÷°ÿ\u0000g4\u0092i\u009a\u009e¦Ó©\b¡=¸r¤§ÖÜÛ\u0011ìFî{û°å[\u0095ot2|Å@\u0088OSGf^)Bü0\u0087=J\n\u001d\b \u001dë\u0003Eªq_,WÛi\u0096uMIxb7nâ#\u0099\u000bT\u000e\u0003'>\u001fõ4  _Ù\nüÁÉüç«ñf÷\u001dçÈ\u0083\u0087\u0085¤\u0010\u0090ýÍÁ:õwÀ¬Ý\u0099åÖÑ\u0003²x¿µ½â\u0088ß\u0088ý¢ÉW\u0094_cv.põsÀx\u0085\u009a±oìg\u001b[VN\u008d@¸C÷Y\"+Y&\u0094\rÃ\tþ\f5\u0001\u0000g4\u0092i\u009a\u009e£Óµ\b¶=¦r¥\u0000g4\u0092i\u009a\u009e£Óµ\b¶=¦r¥§Ë\u0000g4\u0092i\u009a\u009e£Óµ\b¡=¹rµ§þÜÆ\u0011ÃFñ{ð°Äåä\u001a-O\t\u0084\u0017¹;\u0000g4\u0092i\u009a\u009e£Óµ\b¡=¹rµ§þÜÆ\u0011ÃFñ{ð°Üåë\u001a\rO\u0018\u00847¹,î0#*X*\u008dB\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u008cr¨§ÝÜÃ\u0011ÂFÙ{ñ°íåÀ\u001a\fO\u0019\u0084\u000b¹:î0#>\u0000g4\u0092i\u009a\u009e¨Ó¹\b§=¢r®§Ü»\u0084\u008fqÒy%KhZ³D\u0086AÉM\u001c?g?\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0087r¤§ÌÜÇ\u0011ÉFù{Ð°îåä\u001a;O\u0005\u0084\u000e¹2î1#)X1\u0000g4\u0092i\u009a\u009e£Óµ\b¡=¹rµ§ëÜÛ\u0011ÔFô{ú°ì\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0099r¤§ÙÜÝ\u0011ÅFõ{Ð°îåä\u001a;O\u0005\u0084\u000e¹2î1#)X1\u001d\u0093)ftn\u0083^ÎJ\u0015M [oVº8\u0000g4\u0092i\u009a\u009eªÓ¾\b¹=¯r¢§ÌÜÜ%\u0015\u0011àLè»ØöÌ-Ë\u0018ÝWÐ\u0082¾ù\u009b4½c\u008a^\u008a\u0095\u009d7Ù\u0003,^$©\u0014ä\u0000?\u0007\n\u0011E\u001c\u0090rëG&yqOL_\u0087P¦?\u0092ÊÏÂ8òuæ®á\u009b÷Ôú\u0001\u0094z±·\u0097à Ý \u0016·C©\u009b\u001e¯ëòã\u0005ÓHÇ\u0093À¦ÖéÛ<µG\u0080\u008a¾Ý\u0088à\u0098+\u0097~\u0088n=ZÈ\u0007ÚðÚ½ôfèSä\u001cþÉ¦²\u0090\u007f\u009e(²\u0015©Þ\u0082\u008b¬tQ!CêS×c7\u0085\u0003a^o©eäF?O\nWEq\u0090$ë1&%q\u000fL\u0015\u0087\u001d\u0000g4\u0092i\u009a\u009e¤Ó°\b¿=\u0099rµ§ÊÜÆ\u0011ÈFú{ç\u0000g4\u0092i\u009a\u009e¤Ó°\b¿=\u0098r¤§ßÜÊ\u0011ÞFÐ{õ°ÿåá\u001a\u0011O\u0015\u0084\u0014\u0000g4\u0092i\u009a\u009e£Óµ\b¡=¹rµ§êÜÊ\u0011ÁFø{ì°Æåã\u001a\rO\u0013\u0084\u000f;3\u000fÞRó¥åèï3ù\u0006ÓIô\u009c\u008fç\u0085*\u008e}¢@½\u008b¢Þ½!Gty¿I\u0082vÕf\u0018xc~³#\u0087ÕÚÊ-Í`ö»ä\u008eÿÁã\u0014\u008co\u009b¢¦õ\u0080Èº\u0003¼V\u0096©JüE7I\nw]u?8\u000bÞVÐ¡ßìó7í\u0002×Mè\u0098\u0082ã\u0099.\u0098y\u008aD¦\u008f£Ú\u00ad%GpE»Y\u0086w¹Ü\u008d=Ð5'?j\u0003±:\u0084\u0017Ë\u000f\u001ezee¨Eÿ[ÂH\tP\\H£¸öº=º\u0000r4\u0092i\u0083\u009e\u008aÓª\b¶=\u008cr³§ÙÜÂ\u0011ÃFÑ{ý°øåö\u001a\u001cO\u001e\u0084\u0002¹,\u0017j#\u008a~\u0086\u0089\u0091Ä¥\u001f¨*·e\u0096°ÎËô\u0006ÒQìlï§øòÖ\r\bX\u001b\u0093\u000b®#ù#41O)\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u009cr¨§ÝÜØ\u0011éFó{×°çåë\u001a\u001aO\u001b\u0084+¹7î&#8X&\u008dTÂT÷ZGTs´.¸Ù¯\u0094\u009bO\u0096z\u00895¨àð\u009bÝVï\u0001Î<Ñ÷Å¢è]6\b%Ã5þ\u001d©\u001dd\u000f\u001f\u0017\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u009cr¨§ÝÜØ\u0011éFó{À°äå÷\u001a\u001aO\u0018\u0084+¹7î&#8X&\u008dTÂT÷Z\u0000g4\u0092i\u009a\u009eªÓ²\b\u0090=¦r¨§ÛÜÄ\u0011êFô{ç°ÿåç\u001a\u0017O\u0015\u0084\u0015\u0000g4\u0092i\u009a\u009eªÓ²\b\u0087=¥r´§ÛÜÇ\u0011êFô{ç°ÿåç\u001a\u0017O\u0015\u0084\u0015\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0087r¤§ÜÜÆ\u0011ÇFÍ{ø°êåû\u001a\u001cO\u0002\u0084(¹0î\u0005#>X&\u008dJÂP÷Z,zar\u0096AËmÿ\u00884\u0086i\u008c\u009e\u008eÓ²\b¼\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0087r¤§ÜÜÆ\u0011ÇFÍ{ø°êåû\u001a\u001cO\u0002\u0084(¹0î\u001c#\"X%\u008dUÂ}÷A,lab\u0096hËjÿ\u009e4\u0080\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0087r¤§ÜÜÆ\u0011ÇFÍ{ø°êåû\u001a\u001cO\u0002\u0084(¹0î\u0016##X.\u008dJÂ]÷M,ka\u007f\u0096bËjÿ·4\u009bi\u009a\u009e\u0094Ó²\b = rÎ³#\u0087ÅÚË-Ä`è»ö\u008eÇÁä\u0014\u009co\u0086¢\u0087õ\u008dÈ¸\u0003ªV»©\\üB7h\np]F\u0090iëf>\u0011q2D\u0007\u009f2Ò&%!x!LÏ\u0087×Úå-É`ä»ú\u008eàÁ\u0092\u0014\u0096o\u0098\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0085r¯§ôÜÎ\u0011ßFò{á°ÿåÁ\u001a\u0011O\u0011\u0084\t¹9î0#\u0000X*\u008dIÂE÷M,qas\u0096\u007f\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0085r¯§ùÜÛ\u0011ÒFü{÷°ãåÑ\u001a\rO\u0011\u0084\u0013¹;î\u0016#$X\"\u008dTÂV÷M,Sa\u007f\u0096~Ëpÿ\u009e4\u009ci\u008c\u009e\u0092j:^Ú\u0003ÖôÁ¹õbøWç\u0018ÆÍ\u009e¶´{\u008b,°\u0011·Ú\u0080\u008f¥p\\%HîCÓs\u0084iIa2Gç\u001b¨\n\u009d\u0014F2\u000b0ü ¡>é\u009dÝ}\u0080qwf:Rá_Ô@\u009baN95\rø,¯\u0016\u0092\u0012Y\u0005\f=óä¦úmøPÐ\u0007ÈÊÆ±Èd\u0099+·\u001e´Å\u0084\u0088\u009c\u007f\u008c\"\u008e\u0016f\u0000r4\u0092i\u009e\u009e\u0089Ó½\b°=¯r\u008e§ÖÜâ\u0011ÃFù{ý°êåË\u001a\u0017O\u0016\u0084\b¹\u0012î<#?X7\u008d_Â_÷M,m<X\b¸U´¢£ï\u00974\u009a\u0001\u0085N¤\u009büàÈ-ézÓG×\u008cÀÙë&<s7¸=\u0085\u0018Ò\u001a\u001f\u0012d\u0000±\u007fþuËN\u0010\\]OªS÷KÃ¿\b½U±U¸aM<EË~\u0086f]ohz'lò\u0006\u0089\u0004D\u001c\u0013&.\bå5°1OÊ\u001aÍÑÙìâ»á©z\u009d\u009cÀ\u00927\u009dz±¡¯\u0094\u0091Ûª\u000eÎu×¸ÛïçÒì\u0019áLï³2æ\f-\u001d\u0010\"G%\u008a#ñ?$Q\b%<ÃaÍ\u0096ÂÛî\u0000ð5ØzÅ¯²Ô\u0080\u0019\u0093N¯s·¸£í¡\u0012M\u0000i4\u0084i¯\u009e\u0081Ó\u008d\b¦=«r\u00ad§ÑÜÛ\u0011ßFÍ{æ°äåú\u001a\u0000O<\u0084\u000e¹-î!#)X-\u008d_ÂC\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u009dr¤§ÚÜù\u0011ÏFø{ã°Çåë\u001a\nO\u0004\u0084\u0002¹0î0#>ûúÏ\u001b\u0092\u0013e;(0ó8Æ\u0015\u0089!\\T'Qêl½x\u0080tKg\u001eeá\u0084l\u0092Xs\u0005{òS¿XdPQh\u001eHË+°!}**\u0019\u00176Ü\u0006\u0089\nvý#ÿèò\u0000g4\u0092i\u009a\u009e²Ó¹\b±=\u009cr¨§ÝÜØ\u0011åFñ{ý°îåì\u001a\r\u00adI\u0099¼Ä´3\u009c~\u0097¥\u009f\u0090§ß\u0087\näqî¼åëÖÖù\u001dÉHÅ·2â0)=\u0000s4\u0092i\u0080\u009e\u0081Ó\u0099\b¡=¸r®§Ê¼\r\u0088ìÕþ\"ÿoè´Þ\u0081ÛÎÑ\u001b\u0083`§\u00ad½ú\u008dÇ\u009e.\u009e\u001alGu°_ýU&I\u0013[\\J\u0089\u0002ò(?)h\u0003U\u0005\u009e\u0010Ë\u00184ô\u0000g4\u0092i\u009a\u009e¦Ó³\b½=¤r¤§ÛÜÛ\u0011ÉFï\u0000g4\u0092i\u009a\u009e¦Ó³\b½=¾r¤§ÀÜÛõ¿ÁJ\u009cBki&mýfÈwr;FÎ\u001bÆìõ¡ázüOâ\u0000ÉÕ\u008b®\u0086c\u00994©\u0000g4\u0092i\u009a\u009e©Ó½\b =¾r\u0095§×ÜÚ\u0011ÅFõ{À°âåï\u001a\u001c\u0000g4\u0092i\u009a\u009e¦Ó©\b¡=¸r¤§ÖÜÛ\u0011çFþ{à°âåô\u001a\u0010O\u0004\u0084\u001e\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0089r³§ÝÜÎ\u0011ÒFô{â°îåË\u001a\u0017O\u0016\u0084\b\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u008br¥§ÎÜÊ\u0011ÔFé{ý°øåç\u001a\u000bO9\u0084\t¹8î:e´QR\f\\ûS¶\u007fmaX^\u0017dÂ\n¹\u0019t\u0005##\u001e5Õ9\u0080\u001c\u007fÊ*Ô\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0087r¤§ÜÜÆ\u0011ÇFé{ý°äåì\u001a=O\u0011\u0084\u0013¹?w>CË\u001eÃéï¤á\u007fáJÅ\u0005ýÐ\u0093«\u0085f\u00961«\f£Þ?êÊ·Â@û\rñÖçãþ¬Êy\u0084\u0002\u009cÏ¨\u0098 ¥¾n ;³ÄN\u0091F\u0000g4\u0092i\u009a\u009e¶Ó³\b¼=§r\u00ad§ÙÜü\u0011ÂFö{Â°îåð\u001a\nO\u0019\u0084\b¹0÷ÞÃ+\u009e#i\u001d$\u0002ÿ\u000fÊ\u001d\u0085\fPS+sær±K\u008cYGW\u0012xí¯¸§s¸N\u008e\u0019\u008bÓ°çVºXMW\u0000{Ûeî]¡wt\r\u000f\u001dÂ\u0000\u0095\"¨3c\u001d6'ÉÏ\u009cÍWÀjÇ=õðð\u008bþ\u0084Ä°1í9\u001a\u0005W\u0010\u008c\u001e¹\u0007ö\u0007#xXx\u0095jÂLÿa4MaS\u009e©Ëº\u0000«=\u0093\u0000l4\u0098i\u0089\u009e Óª\b¶=¤rµþ\u0019Êô\u0097Í`ñ-ÇöêÃÔ\u008cåY\u00ad\"¬ï¢¸ \u0085\u008bN\u009f\u001b\u0097·±\u0083DÞL)rdn¿Q\u008aeÅg\u0010\u000bk=¦\u0015ñ8Ì!\u0007/R=\u00adßøÒ3Ø\u000eçYí\u0002R6§k¯\u009c\u0093Ñ\u009c\n\u0094?\u008dp\u0091¥ãÞî\u0013ÐDÇyÏ²ÐçÒ\u0018/M1\u0086=»\u0019ì.!\u0018Z\u001b\u008fjÐÔä!¹)N\u0015\u0003\u001aØ\u0012í\u000b¢\u0017we\fhÁY\u0096G«T`L5TÊ¤\u009f¦T¦i£>\u0087ó\u0092\u0088\u0095\u0000i4\u0084i\u00ad\u009e\u008aÓ²\bµ=£r¦§þÜÀ\u0011ÔFþ{ñ°Øåç\u001a\u0017O\u0014\u0084\"¹0î4#.X/\u008d_ÂU\u0000g4\u0092i\u009a\u009e¦Ó³\b½=¬r¨§ßÜá\u0011ÉFÔ{ù°ûåÇ\u001a\u0001O\u0004\u0084\u0015¹?î\u0010#:X&\u008dTÂE÷x,zad\u0096nËaÿ\u00954\u0086\u0000b4\u0085i\u0081\u009e\u0084Ó¸\b°=«r²§ÌÜê\u0011ÐFø{ú°ÿ¡\u0093\u0095fÈn?TrP©W\u009c[ÓG\u0006%}6°7ç\u0007Ú\u0014\u0011<D\u0019»ãîâ%ú\u0018Í\u0000g4\u0092i\u009a\u009e Ó¤\b£=¯r³§ÑÜÂ\u0011ÃFó{à°Þåñ\u001a\u001cO\u0002\u00843¹1î>#)X-\u0000g4\u0092i\u009a\u009e Ó¤\b£=¯r³§ÑÜÂ\u0011ÃFó{à°ßåð\u001a\u0018O\u0019\u0084\u0013¹-\u0087º³OîG\u0019}Ty\u008f~ºrõn \f[\u001f\u0096\u001eÁ.ü=7\u0002b-\u009dÅÈÄ\u0003Î\u0000g4\u0092i\u009a\u009e¶Ó¹\b =¹r¨§×ÜÁ\u0011òFò{ÿ°îåì\u009aV®£ó«\u0004\u0099I\u0088\u0092\u0096§\u009aè´=èFê\u008bö\u0000n4\u0092i\u0099\u0000c4\u009fi\u008f\u009e\u0097Gjs\u008e.\u0097Ù\u008f\u0094®O\u008cz¸5ºàÖ\u0000o4\u0095i\u0084\u009e\u0080Ó¿\b§=\u0082r §ËÜâ\u0011ÃFé{ü°äåæ\u0000c4\u0085i\u008b\u009e\u0084Ó¨\b¶=\u0098r´§ÖÜÁ\u0011ÇFÿ{ø°î\u0000r4\u0082i\u0080\u009eªÓ²\b\u009e=«r¨§ÖÜû\u0011ÎFï{ñ°êåæ\u0000p4\u0098i\u009d\u009e\u0091Ó\u0093\b½=\u0087r §ÑÜÁ\u0011òFõ{æ°îåã\u001a\u001d\u0000p4\u0098i\u009d\u009e\u0091Ó\u0098\b¶=¦r §ÁÜÊ\u0011ÂFÒ{ú°Æåã\u001a\u0010O\u001e\u00843¹6î'#)X\"\u008d^ùºÍJ\u0090Hgb*zñXÄm\u008bg^\u001e%\u0002è\r¿!\u00823I1\u001c\u001eãÙ¶Ê}Ê@÷\u0017ùöÚÂ2\u009f7h;%9þ\u0017Ë#\u0084\u0004Q|*kçi°T\u008dJFN\u0013Zì\u0087¹²r¿O\u0091\u0018\u009eÕ\u0082\u0000p4\u0098i\u009d\u009e\u0091Ó\u0098\b¶=¦r §ÁÜÊ\u0011ÂFÒ{ú°Èåí\u001a\u0017O\u001e\u0084\u0002¹=î!##X1\u008dnÂY÷Z,zaw\u0096i\u0000g4\u0092i\u009a\u009e©Ó³\b°=«r\u00ad§úÜÝ\u0011ÉFü{ð°èåã\u001a\nO\u0004\u0084*¹?î;#-X$\u008d_ÂC÷a,qae\u0096yËeÿ\u00954\u0091i\u008c\u001fß+?v$\u0081!Ì\u0002\u0017\n\"\u0002m\u001e¸WÃp\u000edYQd]¯EúN\u0005§P©\u009b\u0098¦\u0096ñ\u009b<\u0084G\u0087\u0092áÝùè÷\u0000u4\u0099i\u009c\u009e\u0080Ó»\bº=¹rµ§ÝÜÝ\u0011äFï{û°êåæ\u001a\u001aO\u0011\u0084\u0014¹*î\u0007#)X \u008d_ÂX÷^,zad\u0007 3ÕnÝ\u0099òÔú\u000fý:ÿuÀ \u0096Û\u009a\u0016\u0092A®|\u009c·®â¯\u001d[HT\u0083T\u0000g4\u0092i\u009a\u009eµÓ½\bº=¸r\u0092§ÝÜÌ\u0011ÉFó{ð°Äåà\u001a\u0013O\u0015\u0084\u0004¹*à\u0099Ôl\u0089d~V3GèIÝ]\u0092^G\u0016<=ñ9¦\u001a\u009b\u000fP\u0007\u0094á \u0014ý\u001c\n'G?\u009c#©%æ$3[H|\u0085PÒOï{$`qa\u008e¶Û\u0098\u0010¬-±z¿·£Ì¶\u0000m4\u0096i\u009e±»\u0085EØA/}b`¹m\u008c\u007fÖ\u0085â}¿aHr\u0005ZÞB\u0000S4\u0098i\u0081\u009e\u0088Ó°\b²=\u0088r³§ÑÜË\u0011ÁFø\u001eº*zwc\u0080uÍQ\u0016\f#BlV¹.Â<\u000f<XBe\u000e®\fû\u0018\u0004åQú\u009aì§ÈðÄ=ÔF\u009c\u0093\u0096Ü¡é¸2\u008d\u007f\u0085\u0088\u0093Õ¹áv*dwr\u0080xÍM\u0016\u0011#Wl&¹8Â=\u000f1X\u0003eP", "ISO-8859-1", cArr, 0, 2104);
        f13895e = cArr;
        f13896f = 6260365751228445943L;
    }

    public static String b(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13895e[i5 + i11] ^ (i11 * f13896f)) ^ c10);
                        Ab.f13217t = i11 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x126e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0361  */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r48, java.lang.String r49, java.util.ArrayList r50, Va.Ra r51, Va.C1203x8 r52) {
        /*
            Method dump skipped, instructions count: 6098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z7.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }
}
