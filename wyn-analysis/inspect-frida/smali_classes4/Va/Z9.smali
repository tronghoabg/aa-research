.class public final LVa/Z9;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"

# interfaces
.implements LVa/e0;
.implements LVa/Q6;


# static fields
.field public static final c:[C

.field public static final d:J

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final a:Landroid/webkit/WebChromeClient;

.field public final b:Landroid/webkit/WebChromeClient;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x48b

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const-string v2, "\u0000WWy\u00aeZ\u0005\u0017\\\u0018\u00b3\u00fe\n\u00c7a\u00a9\u00b8\u0085\u000f\u00bfgt\u00be]\u00155l\u0002\u00c3\u00fc\u001a\u00e0q\u00a5\u00c8\u00bf\u001f\u0097wf\u00ceQ%8|\u0007\u00d3\u00f6\u0001\u0014V?\u00af\u001b\u0004j]S\u00b2\u00fd\u000b\u0090`\u00fb\u00b9\u0091\u000e\u00c0f\u001d\u00bf\u0007\u0014MmT\u00c2\u00aa\u001b\u0081p\u00f4\u00c9\u00e3\u001e\u00ccv7\u00cfA$r}W\u00d2\u0085+\u0083\u0080\u0082\u00d9\u00ee.\u00d7\u0086$\u00df\u000e4j\u008dv\u00e2\u00b9;\u00ac\u0090\u0087\u00e9\u00e2>\u00c4\u00969\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d6*\u00c5\u0081\u00df\u00d8\u00bd/\u009d\u0087f\u00deI5,\u008c0\u00e3\u00e9:\u00e8\u0091\u00d4\u00e8\u00b1\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d6*\u00c5\u0081\u00df\u00d8\u00bd/\u009d\u0087f\u00deI5,\u008c-\u00e3\u00e3:\u00f3\u0091\u00d6\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d6*\u00c5\u0081\u00df\u00d8\u00bd/\u009d\u0087f\u00deI5,\u008c0\u00e3\u00ef:\u00e9\u0091\u00db\u00e8\u00bc?\u00b9\u0097o\u00eeGE*\u009c5\u00f3\u000eJ\u00f4;\u00fdl\u00d6\u0095\u00f2>\u0083g\u00ba\u0088\u00141yZ\u0012\u0083x4)\\\u00f4\u0085\u00ee.\u00a4W\u00bd\u00f8C!hJ\u001d\u00f3\n$%L\u00de\u00f5\u00a8\u001e\u009bG\u00be\u00e8o\u0011p\u00bak\u00e3\u0017\u0014\u000f\u00bc\u00dd\u00e5\u00e7\u000e\u0084\u00b7\u00b3\u00d8U\u0001r\u00aai\u00d3\t\u0004?\u00b1\u00bf\u00e6\u0094\u001f\u00b0\u00b4\u00c1\u00ed\u00f8\u0002V\u00bb;\u00d0P\t:\u00bek\u00d6\u00b6\u000f\u00ac\u00a4\u00e6\u00dd\u00ffr\u0001\u00ab*\u00c0_yH\u00aeg\u00c6\u009c\u007f\u00ea\u0094\u00d9\u00cd\u00fcb6\u009b30\"iG\u009eM6\u009fo\u00a5\u0084\u00c6=\u00f1R\u0017\u008b0 +YK\u008e}\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00c7*\u00d2\u0081\u00d9\u00d8\u00b9/\u0080\u0087u\u00de{5!\u008c\n\u00e3\u00e4:\u00f3\u0091\u00cf\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d6*\u00c5\u0081\u00cd\u00d8\u00ad/\u0091\u0087c\u00deX5\u000e\u008c\u000b\u00e3\u00e3:\u00e9\u0091\u00cb\u00a0\u00ad\u00f7\u0086\u000e\u00a2\u00a5\u00d3\u00fc\u00ea\u0013D\u00aa)\u00c1B\u0018(\u00afy\u00c7\u00a4\u001e\u00be\u00b5\u00f4\u00cc\u00edc\u0013\u00ba8\u00d1MhZ\u00bfu\u00d7\u008en\u00f8\u0085\u00cb\u00dc\u00ees/\u008a$!;xC\u008fy\'\u00af~\u00ad\u0095\u00ce,\u00e8C\u0007\u009a\u0003\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00ce*\u00d3\u0081\u00fd\u00d8\u00b4/\u0091\u0087b\u00deX\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00ce*\u00d3\u0081\u00ff\u00d8\u00b7/\u009a\u0087v\u00deE5:\u008c\t\u00dc\u00f8\u008b\u00d3r\u00f7\u00d9\u0086\u0080\u00bfo\u0011\u00d6|\u00bd\u0017d}\u00d3,\u00bb\u00f1b\u00eb\u00c9\u00a1\u00b0\u00b8\u001fF\u00c6m\u00ad\u0018\u0014\u000f\u00c3 \u00ab\u00db\u0012\u00ad\u00f9\u009e\u00a0\u00bb\u000fs\u00f6n]Q\u0004\u0017\u00f3&[\u00c0\u0002\u00e1\u00e9\u0081\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00ce*\u00d3\u0081\u00fe\u00d8\u00bd/\u0092\u0087\u007f\u00de^5-\u008c1\u00e3\u00ee:\u00f0\u0091\u00d7\u00e8\u00b5?\u0094C\u00fa\u0014\u00d1\u00ed\u00f5F\u0084\u001f\u00bd\u00f0\u0013I~\"\u0015\u00fb\u007fL.$\u00f3\u00fd\u00e9V\u00a3/\u00ba\u0080DYo2\u001a\u008b\r\\\"4\u00d9\u008d\u00aff\u009c?\u00b9\u0090~ig\u00c2`\u009b\u0002l.\u00c4\u00cb\u009d\u00f6v\u0093\u00cf\u009f\u00a0^yW\u00d2f\u00ab\t|.\u00d4\u00c0\u00ad\u00f2\u0006\u00aa\u00df\u00aa\u00b0\u00ac\tS\u00e2j<(k\u0003\u0092\'9V`o\u008f\u00c16\u00ac]\u00c7\u0084\u00ad3\u00fc[!\u0082;)qPh\u00ff\u0096&\u00bdM\u00c8\u00f4\u00df#\u00f0K\u000b\u00f2}\u0019N@k\u00ef\u00ae\u0016\u00a8\u00bd\u00be\u00e4\u00d9\u0013\u00f6\u00bb\u001e\u00e2 \tQ\u00b0`\u00df\u0082\u0006\u009f\u00ad\u0085\u00d4\u00dc\u0003\u00ef\u00ab\u000c\u00d2,yZ\u00a0~\u00cfxv\u009a\u009d\u00b7\u00c4\u00ces\u00d2\u009b\r\u00c2&iZ\u0090a?gf\u0096\u008d\u00b04\u00d1c\u00f1\u00fc\u0086\u00ab\u00adR\u0089\u00f9\u00f8\u00a0\u00c1Oo\u00f6\u0002\u009diD\u0003\u00f3R\u009b\u008fB\u0095\u00e9\u00df\u0090\u00c6?8\u00e6\u0013\u008df4q\u00e3^\u008b\u00a52\u00d3\u00d9\u00e0\u0080\u00c5/\u0000\u00d6\u0006}\u0010$w\u00d3X{\u00b0\"\u008e\u00c9\u00ffp\u00ce\u001f,\u00c61m+\u0014r\u00c3Ak\u00a2\u0012\u0082\u00b9\u00f4`\u00d0\u000f\u00d6\u00b64]\u0019\u0004`\u00b3g[\u00a2\u0002\u0083\u00a9\u00e6P\u00cf\u00ff\u00c9\u00a68M\u001e\u00f4\u007f\u00a3_\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d4*\u00c5\u0081\u00ce\u00d8\u00b5/\u009d\u0087c\u00de_5!\u008c\u000b\u00e3\u00ee:\u00ce\u0091\u00dd\u00e8\u00a5?\u0085\u0097i\u00ee[E0Vh\u0001C\u00f8gS\u0016\n/\u00e5\u0081\\\u00ec7\u0087\u00ee\u00edY\u00b21T\u00e8uC\u0011:(\u0095\u00cbL\u00ee\'\u00cd\u009e\u009eI\u00a7!P\u0098zs\u0008*+\u0085\u0089|\u00e2\u00d7\u00ff\u008e\u00a5y\u00bc\u00d1O\u0088lc\u000c\u00da:\u00b5\u00del\u00d8\u00c7\u00fa\u00be\u0097i\u008f\u00c1D\u00b8t\u0013\u001c\u00ca(\u00a5\"\u001c\u00c1\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00d4*\u00c5\u0081\u00ce\u00d8\u00b5/\u009d\u0087c\u00de_5!\u008c\u000b\u00e3\u00ee:\u00ce\u0091\u00dd\u00e8\u00a5?\u0085\u0097i\u00ee[E0\u009c#\u00f3\u001dJ\u00f6\u00a1\u00d7\u00f8\u00b5O\u0080\u00a7m\u00fe@\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u009fgy\u00beX\u0015<l\u0005\u00c3\u00e6\u001a\u00c3q\u00e0\u00c8\u00b3\u001f\u008aw}\u00ceW%%|\u0006\u00d3\u00a4*\u00cf\u0081\u00d2\u00d8\u0088/\u0091\u0087b\u00deA5!\u008c\u0017\u00e3\u00f3:\u00f5\u0091\u00d7\u00e8\u00ba?\u00a2\u0097i\u00eeYE1\u009c\u0005\u00f3\u000fJ\u00ec\u00a1\u00f7\u00f8\u00b1O\u0082\u00a7k\u00feAU,\u00ac9\u0003\u001c\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00ce*\u00d3\u0081\u00e8\u00d8\u00b1/\u0099\u0087u\u00deC5=\u008c\u0010\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%#|\u0006\u00d3\u00c7*\u00cf\u0081\u00d2\u00d8\u00ab/\u009b\u0087|\u00deI5\u0005\u008c\u0001\u00e3\u00f3:\u00ef\u0091\u00d9\u00e8\u00b3?\u0095fZ1q\u00c8Uc$:\u001d\u00d5\u00b3l\u00de\u0007\u00b5\u00de\u00dfi\u008e\u0001S\u00d8Is\u0003\n\u001a\u00a5\u00e4|\u00cf\u0017\u00ba\u00ae\u00ady\u0082\u0011y\u00a8\u000fC4\u001a\u0012\u00b5\u00efL\u00fb\u00e7\u00c6\u00be\u00a1I\u008a\u00e1z\u00b8_S#\u00ea-\u0085\u00f6\\\u00e7\u00f7\u00c2\u008e\u00a4Y\u00bf\u00f1|\u0088D#/\u00fa\u001a\u0095\u0011S\u00f4\u0004\u00df\u00fd\u00fbV\u008a\u000f\u00b3\u00e0\u001dYp2\u001b\u00ebq\\ 4\u00fd\u00ed\u00e7F\u00ad?\u00b4\u0090JIa\"\u0014\u009b\u0003L,$\u00d7\u009d\u00a1v\u009a/\u00bc\u0080AyG\u00d2d\u008b\r| \u00d4\u00ce\u008d\u00d1f\u0096\u00df\u00b4\u00b0UiD\u00c2g\u00bb\u0002l\u0011\u00c4\u00cf\u00bd\u00f6\u0016\u0092\u00cf\u00a3\u00a0\u00a8\u0019Z\u00f2v\u00ab7\u001c4\u00f4\u00dc\u00ad\u00e2\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00c1a\u00aa\u00b8\u00c0\u000f\u0091gL\u00beV\u0015\u001cl\u0005\u00c3\u00fb\u001a\u00d0q\u00a5\u00c8\u00b2\u001f\u009dwf\u00ce\u0010%+|\r\u00d3\u00f0*\u00f6\u0081\u00d5\u00d8\u00ab/\u009d\u0087d\u00deI5,\u008c,\u00e3\u00e9:\u00ef\u0091\u00cc\u00e8\u00bb?\u0082\u0097us\u009b$\u00b0\u00dd\u0094v\u00e5/\u00dc\u00c0ry\u001f\u0012t\u00cb\u001e|O\u0014\u0092\u00cd\u0088f\u00c2\u001f\u00db\u00b0%i\u000e\u0002{\u00bbllC\u0004\u00b8\u00bd\u00ceV\u00fd\u000f\u00d8\u00a0\tY\u0016\u00f2\r\u00abq\\l\u00f4\u00a7\u00ad\u009eF\u00f3\u00ff\u00f9\u00906I-\u00e2\t\u009byLK\u00e4\u00a0\u0005\u00e3R\u00fd\u00ab\u00c8\u0000\u0087Y\u0086\u00b6i\u000f\\d0\u00bd\u0001\n\u001cb\u00cb\u00bb\u00d5\u0010\u00b6i\u00ab\u00c6d\u001fRt+\u00cd5\u001a\u0019r\u00d3\u00cb\u00d8 \u00a1y\u0089\u00d6n/P\u0000gWy\u00aeL\u0005\u0000\\\u0012\u00b3\u00db\n\u00cda\u00a6\u00b8\u00a3\u000f\u0094gj\u00be[\u0015=l\t\u00c3\u00cb\u001a\u00c8q\u00a9\u00c8\u00b9\u001f\u0096w`\u0000EWn\u00aeJ\u0005;\\\u0002\u00b3\u00ac\n\u00dfa\u00ac\u00b8\u0089\u000f\u0090g}\u00be\u0014\u00155l\u0014\u00c3\u00ed\u001a\u00c7q\u00b5\u00c8\u00a8\u001f\u0091wz\u00ceW%l|?\u00d3\u00e1*\u00c2\u0081\u00ff\u00d8\u00b0/\u0086\u0087\u007f\u00deA5-\u008c\'\u00e3\u00ec:\u00f5\u0091\u00dd\u00e8\u00ba?\u0084\u0097H\u00eeME\'\u009c\u000f\u00f3\u000eJ\u00f9\u00a1\u00c0\u00f8\u00bfO\u009e\u00a7(\u00feJU!\u00ac(\u0003\u0011Z\u00e2\u00b1\u00d5\u0008\u00ec_\u0085\u00b7a\u000eTeT\u00bc7\u0013\u0010j\u00b0\u00c1\u008b/1"

    .line 6
    .line 7
    const-string v3, "ISO-8859-1"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v2, v3, v1, v4, v0}, LR8/v;->k(Ljava/lang/String;Ljava/lang/String;[CII)V

    .line 11
    .line 12
    .line 13
    sput-object v1, LVa/Z9;->c:[C

    .line 14
    .line 15
    const-wide v0, 0x728fb1d6b31571cL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    sput-wide v0, LVa/Z9;->d:J

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebChromeClient;Landroid/webkit/WebChromeClient;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 5
    .line 6
    iput-object p2, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 7
    .line 8
    return-void
.end method

.method public static b(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/Z9;->c:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    sget-wide v7, LVa/Z9;->d:J

    .line 22
    .line 23
    mul-long/2addr v5, v7

    .line 24
    xor-long/2addr v3, v5

    .line 25
    int-to-long v5, p2

    .line 26
    xor-long/2addr v3, v5

    .line 27
    long-to-int v3, v3

    .line 28
    int-to-char v3, v3

    .line 29
    aput-char v3, v1, v2

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    sput v2, LVa/Ab;->t:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 41
    .line 42
    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    return-object p0

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw p0
.end method


# virtual methods
.method public final a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 p4, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    const v2, 0x5332f755

    .line 9
    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    const/16 v5, 0x30

    .line 14
    .line 15
    const-string v6, ""

    .line 16
    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    const v2, 0x55f3a00a

    .line 20
    .line 21
    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_1
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit16 v1, v1, 0x584

    .line 30
    .line 31
    int-to-char v1, v1

    .line 32
    invoke-static {v6, v5, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit16 v2, v2, 0x420

    .line 37
    .line 38
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-byte v3, v3

    .line 43
    rsub-int/lit8 v3, v3, 0x18

    .line 44
    .line 45
    invoke-static {v2, v3, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    sget v1, LVa/Z9;->f:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x79

    .line 62
    .line 63
    rem-int/lit16 v1, v1, 0x80

    .line 64
    .line 65
    sput v1, LVa/Z9;->e:I

    .line 66
    .line 67
    move v1, v0

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception p5

    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_1
    :try_start_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    shr-int/lit8 v1, v1, 0x8

    .line 77
    .line 78
    int-to-char v1, v1

    .line 79
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    int-to-byte v2, v2

    .line 84
    add-int/lit16 v2, v2, 0x439

    .line 85
    .line 86
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    cmp-long v3, v7, v3

    .line 91
    .line 92
    rsub-int/lit8 v3, v3, 0x15

    .line 93
    .line 94
    invoke-static {v2, v3, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    move v1, p4

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    :goto_0
    const/4 v1, -0x1

    .line 111
    :goto_1
    if-eqz v1, :cond_5

    .line 112
    .line 113
    if-eq v1, p4, :cond_3

    .line 114
    .line 115
    new-instance v1, LVa/k8;

    .line 116
    .line 117
    invoke-static {v6, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    add-int/2addr v2, p4

    .line 122
    int-to-char v2, v2

    .line 123
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-static {v5}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    add-int/lit8 v4, v4, -0x18

    .line 132
    .line 133
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v1, p1, p5, v2, p2}, LVa/k8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, LVa/y7;->f()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p5

    .line 148
    invoke-virtual {v1, p5}, LVa/j8;->d(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object p3

    .line 152
    :cond_3
    sget p5, LVa/Z9;->f:I

    .line 153
    .line 154
    add-int/lit8 p5, p5, 0x61

    .line 155
    .line 156
    rem-int/lit16 v1, p5, 0x80

    .line 157
    .line 158
    sput v1, LVa/Z9;->e:I

    .line 159
    .line 160
    rem-int/lit8 p5, p5, 0x2

    .line 161
    .line 162
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 163
    .line 164
    if-eqz p5, :cond_4

    .line 165
    .line 166
    const/16 p5, 0x42

    .line 167
    .line 168
    div-int/2addr p5, v0

    .line 169
    :cond_4
    return-object v1

    .line 170
    :cond_5
    sget p5, LVa/Z9;->f:I

    .line 171
    .line 172
    add-int/lit8 v1, p5, 0x29

    .line 173
    .line 174
    rem-int/lit16 v2, v1, 0x80

    .line 175
    .line 176
    sput v2, LVa/Z9;->e:I

    .line 177
    .line 178
    rem-int/lit8 v1, v1, 0x2

    .line 179
    .line 180
    if-nez v1, :cond_7

    .line 181
    .line 182
    iget-object p1, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 183
    .line 184
    add-int/lit8 p5, p5, 0x6f

    .line 185
    .line 186
    rem-int/lit16 p2, p5, 0x80

    .line 187
    .line 188
    sput p2, LVa/Z9;->e:I

    .line 189
    .line 190
    rem-int/lit8 p5, p5, 0x2

    .line 191
    .line 192
    if-eqz p5, :cond_6

    .line 193
    .line 194
    const/16 p2, 0x50

    .line 195
    .line 196
    div-int/2addr p2, v0

    .line 197
    :cond_6
    return-object p1

    .line 198
    :cond_7
    :try_start_3
    throw p3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 199
    :goto_2
    invoke-virtual {p1}, LVa/y7;->f()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    new-instance v1, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    int-to-byte v2, v2

    .line 213
    add-int/2addr v2, p4

    .line 214
    int-to-char v2, v2

    .line 215
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    shr-int/lit8 v3, v3, 0x10

    .line 220
    .line 221
    add-int/lit16 v3, v3, 0x44c

    .line 222
    .line 223
    const v4, -0xffffc2

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    sub-int/2addr v4, v5

    .line 231
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    shr-int/lit8 p2, p2, 0x10

    .line 250
    .line 251
    rsub-int p2, p2, 0x2f16

    .line 252
    .line 253
    int-to-char p2, p2

    .line 254
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    rsub-int v2, v2, 0x48a

    .line 259
    .line 260
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    sub-int/2addr p4, v0

    .line 265
    invoke-static {v2, p4, p2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-static {p1, p2, p5}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 281
    .line 282
    .line 283
    return-object p3
.end method

.method public final getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v2}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-char v2, v2

    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    shr-int/lit8 v4, v4, 0x10

    .line 37
    .line 38
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/4 v6, 0x0

    .line 43
    cmpl-float v5, v5, v6

    .line 44
    .line 45
    const/16 v7, 0x19

    .line 46
    .line 47
    invoke-static {v7, v5, v2, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    rsub-int v4, v4, 0x661f

    .line 56
    .line 57
    int-to-char v4, v4

    .line 58
    const-string v5, ""

    .line 59
    .line 60
    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    add-int/lit16 v5, v5, 0x379

    .line 65
    .line 66
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    cmpl-float v6, v7, v6

    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x29

    .line 73
    .line 74
    invoke-static {v5, v6, v4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v2, v4, v0, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 83
    .line 84
    .line 85
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    sget v2, LVa/Z9;->e:I

    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x67

    .line 92
    .line 93
    rem-int/lit16 v3, v2, 0x80

    .line 94
    .line 95
    sput v3, LVa/Z9;->f:I

    .line 96
    .line 97
    rem-int/lit8 v2, v2, 0x2

    .line 98
    .line 99
    if-eqz v2, :cond_1

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0

    .line 106
    :cond_1
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :cond_2
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget v1, LVa/Z9;->f:I

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0xf

    .line 117
    .line 118
    rem-int/lit16 v2, v1, 0x80

    .line 119
    .line 120
    sput v2, LVa/Z9;->e:I

    .line 121
    .line 122
    rem-int/lit8 v1, v1, 0x2

    .line 123
    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    const/16 v1, 0x3d

    .line 127
    .line 128
    div-int/2addr v1, v3

    .line 129
    :cond_3
    return-object v0
.end method

.method public final getVideoLoadingProgressView()Landroid/view/View;
    .locals 7

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->getVideoLoadingProgressView()Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget v0, LVa/Z9;->e:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x3b

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/Z9;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    int-to-char v2, v2

    .line 30
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-string v4, ""

    .line 35
    .line 36
    const/16 v5, 0x30

    .line 37
    .line 38
    invoke-static {v4, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    add-int/lit8 v4, v4, 0x19

    .line 43
    .line 44
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const v3, -0xffac4f

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    sub-int/2addr v3, v4

    .line 60
    int-to-char v3, v3

    .line 61
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    add-int/lit16 v4, v4, 0x3a3

    .line 66
    .line 67
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    shr-int/lit8 v6, v6, 0x10

    .line 72
    .line 73
    invoke-static {v5, v6, v3, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 78
    .line 79
    .line 80
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 81
    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->getVideoLoadingProgressView()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_0
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->getVideoLoadingProgressView()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget v1, LVa/Z9;->e:I

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x29

    .line 96
    .line 97
    rem-int/lit16 v2, v1, 0x80

    .line 98
    .line 99
    sput v2, LVa/Z9;->f:I

    .line 100
    .line 101
    rem-int/lit8 v1, v1, 0x2

    .line 102
    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_1
    const/4 v0, 0x0

    .line 107
    throw v0
.end method

.method public final getVisitedHistory(Landroid/webkit/ValueCallback;)V
    .locals 7

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->getVisitedHistory(Landroid/webkit/ValueCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    shr-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    int-to-char v1, v1

    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    const-string v3, ""

    .line 30
    .line 31
    const/16 v4, 0x30

    .line 32
    .line 33
    invoke-static {v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    rsub-int/lit8 v3, v3, 0x17

    .line 38
    .line 39
    invoke-static {v2, v3, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-byte v2, v2

    .line 52
    rsub-int/lit8 v2, v2, -0x1

    .line 53
    .line 54
    int-to-char v2, v2

    .line 55
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    const/4 v4, 0x0

    .line 60
    cmpl-float v3, v3, v4

    .line 61
    .line 62
    rsub-int v3, v3, 0x3d4

    .line 63
    .line 64
    const/16 v4, 0x26

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-static {v4, v6, v2, v3}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v1, v2, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 76
    .line 77
    .line 78
    :goto_0
    const/4 v0, 0x0

    .line 79
    iget-object v1, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 80
    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroid/webkit/WebChromeClient;->getVisitedHistory(Landroid/webkit/ValueCallback;)V

    .line 84
    .line 85
    .line 86
    sget p1, LVa/Z9;->f:I

    .line 87
    .line 88
    add-int/lit8 p1, p1, 0x3d

    .line 89
    .line 90
    rem-int/lit16 v1, p1, 0x80

    .line 91
    .line 92
    sput v1, LVa/Z9;->e:I

    .line 93
    .line 94
    rem-int/lit8 p1, p1, 0x2

    .line 95
    .line 96
    if-nez p1, :cond_0

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    throw v0

    .line 100
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->getVisitedHistory(Landroid/webkit/ValueCallback;)V

    .line 101
    .line 102
    .line 103
    sget p1, LVa/Z9;->e:I

    .line 104
    .line 105
    add-int/lit8 p1, p1, 0x73

    .line 106
    .line 107
    rem-int/lit16 v1, p1, 0x80

    .line 108
    .line 109
    sput v1, LVa/Z9;->f:I

    .line 110
    .line 111
    rem-int/lit8 p1, p1, 0x2

    .line 112
    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    :goto_1
    return-void

    .line 116
    :cond_2
    throw v0
.end method

.method public final onCloseWindow(Landroid/webkit/WebView;)V
    .locals 9

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x67

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v2, v2

    .line 22
    const/16 v3, 0x30

    .line 23
    .line 24
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sub-int/2addr v3, v4

    .line 29
    const/16 v4, 0x18

    .line 30
    .line 31
    const-string v5, ""

    .line 32
    .line 33
    invoke-static {v5, v5, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v4, v6, v2, v3}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const v3, 0xa0e8

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sub-int/2addr v3, v4

    .line 49
    int-to-char v3, v3

    .line 50
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    rsub-int v4, v4, 0x140

    .line 55
    .line 56
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v5, v5, v7

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x23

    .line 65
    .line 66
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    sget v1, LVa/Z9;->e:I

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x5b

    .line 84
    .line 85
    rem-int/lit16 v2, v1, 0x80

    .line 86
    .line 87
    sput v2, LVa/Z9;->f:I

    .line 88
    .line 89
    rem-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 94
    .line 95
    .line 96
    sget p1, LVa/Z9;->e:I

    .line 97
    .line 98
    add-int/lit8 p1, p1, 0x4b

    .line 99
    .line 100
    rem-int/lit16 p1, p1, 0x80

    .line 101
    .line 102
    sput p1, LVa/Z9;->f:I

    .line 103
    .line 104
    return-void

    .line 105
    :cond_0
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    throw p1

    .line 110
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 7

    .line 1
    sget v0, LVa/Z9;->e:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v1, v0, 0x80

    sput v1, LVa/Z9;->f:I

    rem-int/lit8 v0, v0, 0x2

    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    const/16 v0, 0xc

    div-int/2addr v0, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    const/16 v1, 0x30

    .line 3
    const-string v3, ""

    invoke-static {v3, v1, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-char v1, v1

    invoke-static {v3, v3, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    const/16 v5, 0x19

    .line 4
    invoke-static {v5, v4, v1, v3}, LVa/M6;->E(IICI)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    int-to-char v3, v3

    const v4, -0xfffcac

    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    const/16 v6, 0x25

    .line 6
    invoke-static {v6, v5, v3, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 8
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    .line 10
    sget p1, LVa/Z9;->e:I

    add-int/lit8 p1, p1, 0x49

    rem-int/lit16 p2, p1, 0x80

    sput p2, LVa/Z9;->f:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/16 p1, 0x5a

    div-int/2addr p1, v2

    :cond_1
    return-void

    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 6

    .line 13
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 14
    const-string v1, ""

    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v2

    int-to-char v2, v2

    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    const/16 v4, 0x18

    .line 15
    invoke-static {v4, v3, v2, v1}, LVa/M6;->E(IICI)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-char v2, v2

    const/4 v3, 0x0

    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v4

    rsub-int v4, v4, 0x354

    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v5

    add-int/lit8 v5, v5, 0x25

    invoke-static {v4, v5, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 17
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    if-eqz v0, :cond_1

    .line 18
    sget v1, LVa/Z9;->f:I

    add-int/lit8 v1, v1, 0x7

    rem-int/lit16 v2, v1, 0x80

    sput v2, LVa/Z9;->e:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    .line 19
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    const/4 p1, 0x0

    throw p1

    .line 20
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    .line 21
    sget v0, LVa/Z9;->e:I

    add-int/lit8 v0, v0, 0x59

    rem-int/lit16 v0, v0, 0x80

    sput v0, LVa/Z9;->f:I

    return p1
.end method

.method public final onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 6

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    shr-int/lit8 v1, v1, 0x16

    .line 21
    .line 22
    int-to-char v1, v1

    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    shr-int/lit8 v3, v3, 0x10

    .line 34
    .line 35
    const/16 v4, 0x18

    .line 36
    .line 37
    invoke-static {v4, v3, v1, v2}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    int-to-char v3, v3

    .line 47
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    cmpl-float v4, v4, v5

    .line 53
    .line 54
    add-int/lit16 v4, v4, 0xf9

    .line 55
    .line 56
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/lit8 v5, v5, 0x23

    .line 61
    .line 62
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    sget v1, LVa/Z9;->e:I

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x4f

    .line 80
    .line 81
    rem-int/lit16 v2, v1, 0x80

    .line 82
    .line 83
    sput v2, LVa/Z9;->f:I

    .line 84
    .line 85
    rem-int/lit8 v1, v1, 0x2

    .line 86
    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    return p1

    .line 94
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    throw p1

    .line 99
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1
.end method

.method public final onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 12

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-wide v4, p3

    .line 14
    move-wide/from16 v6, p5

    .line 15
    .line 16
    move-wide/from16 v8, p7

    .line 17
    .line 18
    move-object/from16 v10, p9

    .line 19
    .line 20
    invoke-virtual/range {v1 .. v10}, Landroid/webkit/WebChromeClient;->onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    shr-int/lit8 v1, v1, 0x8

    .line 30
    .line 31
    int-to-char v1, v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    shr-int/lit8 v4, v4, 0x10

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x18

    .line 44
    .line 45
    invoke-static {v3, v4, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    rsub-int v3, v3, 0x43bf

    .line 58
    .line 59
    int-to-char v3, v3

    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    shr-int/lit8 v4, v4, 0x10

    .line 65
    .line 66
    rsub-int v4, v4, 0x1e4

    .line 67
    .line 68
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    add-int/lit8 v5, v5, 0x2c

    .line 73
    .line 74
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v2, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    move-object v3, p1

    .line 90
    move-object v4, p2

    .line 91
    move-wide v5, p3

    .line 92
    move-wide/from16 v7, p5

    .line 93
    .line 94
    move-wide/from16 v9, p7

    .line 95
    .line 96
    move-object/from16 v11, p9

    .line 97
    .line 98
    invoke-virtual/range {v2 .. v11}, Landroid/webkit/WebChromeClient;->onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_0
    invoke-super/range {p0 .. p9}, Landroid/webkit/WebChromeClient;->onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V

    .line 103
    .line 104
    .line 105
    sget p1, LVa/Z9;->e:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x53

    .line 108
    .line 109
    rem-int/lit16 p2, p1, 0x80

    .line 110
    .line 111
    sput p2, LVa/Z9;->f:I

    .line 112
    .line 113
    rem-int/lit8 p1, p1, 0x2

    .line 114
    .line 115
    if-eqz p1, :cond_1

    .line 116
    .line 117
    return-void

    .line 118
    :cond_1
    const/4 p1, 0x0

    .line 119
    throw p1
.end method

.method public final onGeolocationPermissionsHidePrompt()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsHidePrompt()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/Z9;->e:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/Z9;->f:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v2, v2

    .line 22
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    shr-int/lit8 v3, v3, 0x10

    .line 27
    .line 28
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/lit8 v4, v4, 0x18

    .line 33
    .line 34
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const v3, 0xfcc3

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    sub-int/2addr v3, v4

    .line 50
    int-to-char v3, v3

    .line 51
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v5, 0x0

    .line 56
    cmpl-float v4, v4, v5

    .line 57
    .line 58
    rsub-int v4, v4, 0x247

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    shr-int/lit8 v5, v5, 0x16

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x37

    .line 67
    .line 68
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    sget v1, LVa/Z9;->f:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x27

    .line 86
    .line 87
    rem-int/lit16 v1, v1, 0x80

    .line 88
    .line 89
    sput v1, LVa/Z9;->e:I

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsHidePrompt()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsHidePrompt()V

    .line 96
    .line 97
    .line 98
    sget v0, LVa/Z9;->f:I

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x47

    .line 101
    .line 102
    rem-int/lit16 v1, v0, 0x80

    .line 103
    .line 104
    sput v1, LVa/Z9;->e:I

    .line 105
    .line 106
    rem-int/lit8 v0, v0, 0x2

    .line 107
    .line 108
    if-nez v0, :cond_1

    .line 109
    .line 110
    :goto_1
    return-void

    .line 111
    :cond_1
    const/4 v0, 0x0

    .line 112
    throw v0
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 7

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget v0, LVa/Z9;->e:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x4d

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/Z9;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    const-string v1, ""

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v1, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-char v3, v3

    .line 32
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    int-to-byte v4, v4

    .line 37
    rsub-int/lit8 v4, v4, -0x1

    .line 38
    .line 39
    const/16 v5, 0x18

    .line 40
    .line 41
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v5, v6, v3, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    rsub-int v4, v4, 0x3c6d

    .line 54
    .line 55
    int-to-char v4, v4

    .line 56
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    rsub-int v1, v1, 0x20f

    .line 61
    .line 62
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    add-int/lit8 v5, v5, 0x38

    .line 69
    .line 70
    invoke-static {v1, v5, v4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v3, v1, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 79
    .line 80
    .line 81
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 82
    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    sget v1, LVa/Z9;->f:I

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x2f

    .line 88
    .line 89
    rem-int/lit16 v1, v1, 0x80

    .line 90
    .line 91
    sput v1, LVa/Z9;->e:I

    .line 92
    .line 93
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 94
    .line 95
    .line 96
    sget p1, LVa/Z9;->e:I

    .line 97
    .line 98
    add-int/lit8 p1, p1, 0x75

    .line 99
    .line 100
    rem-int/lit16 p2, p1, 0x80

    .line 101
    .line 102
    sput p2, LVa/Z9;->f:I

    .line 103
    .line 104
    rem-int/lit8 p1, p1, 0x2

    .line 105
    .line 106
    if-eqz p1, :cond_0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_0
    const/4 p1, 0x0

    .line 110
    throw p1

    .line 111
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    return-void
.end method

.method public final onHideCustomView()V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/Z9;->e:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x63

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/Z9;->f:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const-string v1, ""

    .line 17
    .line 18
    const/16 v2, 0x30

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v1, v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    rsub-int/lit8 v4, v4, -0x1

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    shr-int/lit8 v5, v5, 0x10

    .line 33
    .line 34
    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    rsub-int/lit8 v6, v6, 0x18

    .line 39
    .line 40
    invoke-static {v5, v6, v4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    shr-int/lit8 v5, v5, 0x8

    .line 53
    .line 54
    const v6, 0xb1fa

    .line 55
    .line 56
    .line 57
    add-int/2addr v5, v6

    .line 58
    int-to-char v5, v5

    .line 59
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    rsub-int v6, v6, 0xd5

    .line 64
    .line 65
    const/16 v7, 0x24

    .line 66
    .line 67
    invoke-static {v1, v2, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v7, v1, v5, v6}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v4, v1, v0, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    sget v1, LVa/Z9;->e:I

    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x77

    .line 85
    .line 86
    rem-int/lit16 v2, v1, 0x80

    .line 87
    .line 88
    sput v2, LVa/Z9;->f:I

    .line 89
    .line 90
    rem-int/lit8 v1, v1, 0x2

    .line 91
    .line 92
    if-eqz v1, :cond_0

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    throw v0

    .line 103
    :cond_1
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    int-to-char v2, v2

    .line 16
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x19

    .line 29
    .line 30
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-char v3, v3

    .line 43
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    cmp-long v4, v4, v6

    .line 48
    .line 49
    add-int/lit16 v4, v4, 0x163

    .line 50
    .line 51
    const/16 v5, 0x1e

    .line 52
    .line 53
    const-string v6, ""

    .line 54
    .line 55
    invoke-static {v6, v6, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-static {v5, v6, v3, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 64
    .line 65
    .line 66
    :goto_0
    const/4 v0, 0x0

    .line 67
    iget-object v1, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    sget v2, LVa/Z9;->f:I

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0xf

    .line 74
    .line 75
    rem-int/lit16 v3, v2, 0x80

    .line 76
    .line 77
    sput v3, LVa/Z9;->e:I

    .line 78
    .line 79
    rem-int/lit8 v2, v2, 0x2

    .line 80
    .line 81
    if-nez v2, :cond_0

    .line 82
    .line 83
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    sget p2, LVa/Z9;->f:I

    .line 88
    .line 89
    add-int/lit8 p2, p2, 0x15

    .line 90
    .line 91
    rem-int/lit16 p2, p2, 0x80

    .line 92
    .line 93
    sput p2, LVa/Z9;->e:I

    .line 94
    .line 95
    return p1

    .line 96
    :cond_0
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    sget p2, LVa/Z9;->f:I

    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x17

    .line 107
    .line 108
    rem-int/lit16 p3, p2, 0x80

    .line 109
    .line 110
    sput p3, LVa/Z9;->e:I

    .line 111
    .line 112
    rem-int/lit8 p2, p2, 0x2

    .line 113
    .line 114
    if-nez p2, :cond_2

    .line 115
    .line 116
    return p1

    .line 117
    :cond_2
    throw v0
.end method

.method public final onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 8

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-static {v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-char v1, v1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    rsub-int/lit8 v4, v4, 0x18

    .line 33
    .line 34
    invoke-static {v3, v4, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    int-to-char v3, v3

    .line 49
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    cmp-long v4, v4, v6

    .line 56
    .line 57
    rsub-int v4, v4, 0x1bf

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    cmpl-float v5, v6, v5

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x25

    .line 67
    .line 68
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    sget p2, LVa/Z9;->e:I

    .line 88
    .line 89
    add-int/lit8 p2, p2, 0x61

    .line 90
    .line 91
    rem-int/lit16 p2, p2, 0x80

    .line 92
    .line 93
    sput p2, LVa/Z9;->f:I

    .line 94
    .line 95
    return p1

    .line 96
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    shr-int/lit8 v1, v1, 0x10

    .line 13
    .line 14
    int-to-char v1, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    add-int/lit8 v4, v4, 0x18

    .line 27
    .line 28
    invoke-static {v3, v4, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-char v3, v3

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    add-int/lit16 v6, v6, 0x180

    .line 48
    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 50
    .line 51
    .line 52
    move-result-wide v7

    .line 53
    cmp-long v4, v7, v4

    .line 54
    .line 55
    const/16 v5, 0x21

    .line 56
    .line 57
    invoke-static {v5, v4, v3, v6}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    sget v1, LVa/Z9;->f:I

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x3b

    .line 71
    .line 72
    rem-int/lit16 v2, v1, 0x80

    .line 73
    .line 74
    sput v2, LVa/Z9;->e:I

    .line 75
    .line 76
    rem-int/lit8 v1, v1, 0x2

    .line 77
    .line 78
    if-nez v1, :cond_0

    .line 79
    .line 80
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1

    .line 85
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    throw p1

    .line 90
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    sget p2, LVa/Z9;->f:I

    .line 95
    .line 96
    add-int/lit8 p2, p2, 0x71

    .line 97
    .line 98
    rem-int/lit16 p2, p2, 0x80

    .line 99
    .line 100
    sput p2, LVa/Z9;->e:I

    .line 101
    .line 102
    return p1
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 8

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p4

    .line 15
    move-object v6, p5

    .line 16
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    move-object v7, v6

    .line 20
    move-object v6, v5

    .line 21
    move-object v5, v4

    .line 22
    move-object v4, v3

    .line 23
    move-object v3, v2

    .line 24
    goto :goto_2

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object v7, v6

    .line 27
    move-object v6, v5

    .line 28
    move-object v5, v4

    .line 29
    move-object v4, v3

    .line 30
    move-object v3, v2

    .line 31
    :goto_0
    move-object p1, v0

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    move-object v3, p1

    .line 35
    move-object v4, p2

    .line 36
    move-object v5, p3

    .line 37
    move-object v6, p4

    .line 38
    move-object v7, p5

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    const/4 p2, 0x0

    .line 41
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    int-to-char p3, p3

    .line 46
    invoke-static {p2, p2}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 51
    .line 52
    .line 53
    move-result p5

    .line 54
    shr-int/lit8 p5, p5, 0x16

    .line 55
    .line 56
    add-int/lit8 p5, p5, 0x18

    .line 57
    .line 58
    invoke-static {p4, p5, p3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    shr-int/lit8 p4, p4, 0x10

    .line 71
    .line 72
    const p5, 0xdcbd

    .line 73
    .line 74
    .line 75
    sub-int/2addr p5, p4

    .line 76
    int-to-char p4, p5

    .line 77
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 78
    .line 79
    .line 80
    move-result p5

    .line 81
    rsub-int p5, p5, 0x1a0

    .line 82
    .line 83
    const-string v0, ""

    .line 84
    .line 85
    invoke-static {v0, p2, p2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    add-int/lit8 v0, v0, 0x1f

    .line 90
    .line 91
    invoke-static {p5, v0, p4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    invoke-static {p3, p4, p1, p2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget-object v2, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 103
    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    sget p1, LVa/Z9;->e:I

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x2f

    .line 109
    .line 110
    rem-int/lit16 p2, p1, 0x80

    .line 111
    .line 112
    sput p2, LVa/Z9;->f:I

    .line 113
    .line 114
    rem-int/lit8 p1, p1, 0x2

    .line 115
    .line 116
    if-eqz p1, :cond_0

    .line 117
    .line 118
    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    return p1

    .line 123
    :cond_0
    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    throw p1

    .line 128
    :cond_1
    move-object p1, v3

    .line 129
    move-object p2, v4

    .line 130
    move-object p3, v5

    .line 131
    move-object p4, v6

    .line 132
    move-object p5, v7

    .line 133
    invoke-super/range {p0 .. p5}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    return p1
.end method

.method public final onJsTimeout()Z
    .locals 9

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onJsTimeout()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    shr-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    int-to-char v1, v1

    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    const/16 v3, 0x30

    .line 30
    .line 31
    const-string v4, ""

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-static {v4, v3, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/16 v6, 0x17

    .line 39
    .line 40
    invoke-static {v6, v3, v1, v2}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    int-to-char v6, v6

    .line 51
    invoke-static {v4, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    rsub-int v4, v4, 0x334

    .line 56
    .line 57
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    cmp-long v2, v7, v2

    .line 62
    .line 63
    const/16 v3, 0x21

    .line 64
    .line 65
    invoke-static {v3, v2, v6, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v1, v2, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 70
    .line 71
    .line 72
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 73
    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    sget v1, LVa/Z9;->f:I

    .line 77
    .line 78
    add-int/lit8 v1, v1, 0x5

    .line 79
    .line 80
    rem-int/lit16 v1, v1, 0x80

    .line 81
    .line 82
    sput v1, LVa/Z9;->e:I

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onJsTimeout()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    return v0

    .line 89
    :cond_0
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onJsTimeout()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    sget v1, LVa/Z9;->f:I

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1f

    .line 96
    .line 97
    rem-int/lit16 v1, v1, 0x80

    .line 98
    .line 99
    sput v1, LVa/Z9;->e:I

    .line 100
    .line 101
    return v0
.end method

.method public final onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 11

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iget-object v3, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 14
    .line 15
    const/16 v4, 0x18

    .line 16
    .line 17
    const-string v5, ""

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v3, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    sget v0, LVa/Z9;->f:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x45

    .line 28
    .line 29
    rem-int/lit16 v0, v0, 0x80

    .line 30
    .line 31
    sput v0, LVa/Z9;->e:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    :try_start_1
    invoke-virtual {v3, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_0
    invoke-static {v6, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    int-to-char v3, v3

    .line 46
    const/16 v7, 0x30

    .line 47
    .line 48
    invoke-static {v5, v7, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    rsub-int/lit8 v7, v7, -0x1

    .line 53
    .line 54
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    shr-int/lit8 v8, v8, 0x8

    .line 59
    .line 60
    add-int/2addr v8, v4

    .line 61
    invoke-static {v7, v8, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    shr-int/lit8 v7, v7, 0x10

    .line 74
    .line 75
    int-to-char v7, v7

    .line 76
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    shr-int/lit8 v8, v8, 0x10

    .line 81
    .line 82
    rsub-int v8, v8, 0x27e

    .line 83
    .line 84
    invoke-static {v6, v6}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    cmp-long v9, v9, v1

    .line 89
    .line 90
    add-int/lit8 v9, v9, 0x29

    .line 91
    .line 92
    invoke-static {v8, v9, v7}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-static {v3, v7, v0, v6}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 101
    .line 102
    .line 103
    :goto_1
    :try_start_2
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    sget v3, LVa/Z9;->f:I

    .line 108
    .line 109
    add-int/lit8 v3, v3, 0x1d

    .line 110
    .line 111
    rem-int/lit16 v7, v3, 0x80

    .line 112
    .line 113
    sput v7, LVa/Z9;->e:I

    .line 114
    .line 115
    rem-int/lit8 v3, v3, 0x2

    .line 116
    .line 117
    if-eqz v3, :cond_1

    .line 118
    .line 119
    :try_start_3
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 120
    .line 121
    const/16 v7, 0x53

    .line 122
    .line 123
    if-lt v3, v7, :cond_3

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    goto :goto_4

    .line 128
    :cond_1
    :goto_2
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_2
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_3
    return-void

    .line 136
    :goto_4
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    rsub-int/lit8 v0, v0, -0x1

    .line 141
    .line 142
    int-to-char v0, v0

    .line 143
    invoke-static {v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    shr-int/lit8 v2, v2, 0x8

    .line 152
    .line 153
    invoke-static {v4, v2, v0, v1}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    shr-int/2addr v1, v4

    .line 162
    add-int/lit16 v1, v1, 0x562d

    .line 163
    .line 164
    int-to-char v1, v1

    .line 165
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const/4 v3, 0x0

    .line 170
    cmpl-float v2, v2, v3

    .line 171
    .line 172
    rsub-int v2, v2, 0x2a7

    .line 173
    .line 174
    const v3, 0x100002b

    .line 175
    .line 176
    .line 177
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    add-int/2addr v4, v3

    .line 182
    invoke-static {v2, v4, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v0, v1, p1, v6}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V
    .locals 10

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x65

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v5, 0x3a

    .line 20
    .line 21
    if-lt v0, v5, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :goto_1
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    cmp-long v5, v5, v1

    .line 37
    .line 38
    rsub-int/lit8 v5, v5, -0x1

    .line 39
    .line 40
    int-to-char v5, v5

    .line 41
    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    cmpl-float v7, v7, v3

    .line 50
    .line 51
    const/16 v8, 0x19

    .line 52
    .line 53
    invoke-static {v8, v7, v5, v6}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    shr-int/lit8 v6, v6, 0x10

    .line 62
    .line 63
    int-to-char v6, v6

    .line 64
    const-string v7, ""

    .line 65
    .line 66
    const/16 v8, 0x30

    .line 67
    .line 68
    invoke-static {v7, v8, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    add-int/lit16 v7, v7, 0x2d2

    .line 73
    .line 74
    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    cmpl-float v9, v9, v3

    .line 79
    .line 80
    add-int/2addr v9, v8

    .line 81
    invoke-static {v7, v9, v6}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v5, v6, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_2
    :try_start_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    sget v5, LVa/Z9;->e:I

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x47

    .line 99
    .line 100
    rem-int/lit16 v6, v5, 0x80

    .line 101
    .line 102
    sput v6, LVa/Z9;->f:I

    .line 103
    .line 104
    rem-int/lit8 v5, v5, 0x2

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    :try_start_2
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 110
    .line 111
    .line 112
    sget p1, LVa/Z9;->f:I

    .line 113
    .line 114
    add-int/lit8 p1, p1, 0x59

    .line 115
    .line 116
    rem-int/lit16 v0, p1, 0x80

    .line 117
    .line 118
    sput v0, LVa/Z9;->e:I

    .line 119
    .line 120
    rem-int/lit8 p1, p1, 0x2

    .line 121
    .line 122
    if-nez p1, :cond_2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    throw v6

    .line 126
    :catchall_1
    move-exception p1

    .line 127
    goto :goto_4

    .line 128
    :cond_3
    :try_start_3
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V

    .line 129
    .line 130
    .line 131
    throw v6

    .line 132
    :cond_4
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequestCanceled(Landroid/webkit/PermissionRequest;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 133
    .line 134
    .line 135
    :goto_3
    return-void

    .line 136
    :goto_4
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    cmp-long v0, v5, v1

    .line 141
    .line 142
    rsub-int/lit8 v0, v0, -0x1

    .line 143
    .line 144
    int-to-char v0, v0

    .line 145
    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    cmpl-float v2, v2, v3

    .line 154
    .line 155
    const/16 v5, 0x18

    .line 156
    .line 157
    invoke-static {v5, v2, v0, v1}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    int-to-byte v1, v1

    .line 166
    add-int/lit8 v1, v1, 0x1

    .line 167
    .line 168
    int-to-char v1, v1

    .line 169
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    add-int/lit16 v2, v2, 0x301

    .line 174
    .line 175
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    cmpl-float v3, v5, v3

    .line 180
    .line 181
    add-int/lit8 v3, v3, 0x32

    .line 182
    .line 183
    invoke-static {v2, v3, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v0, v1, p1, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 8

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v2, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 23
    .line 24
    .line 25
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :goto_0
    const-string v2, ""

    .line 27
    .line 28
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-char v3, v3

    .line 33
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    shr-int/lit8 v4, v4, 0x8

    .line 38
    .line 39
    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    rsub-int/lit8 v2, v2, 0x17

    .line 44
    .line 45
    invoke-static {v4, v2, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/16 v3, 0x30

    .line 54
    .line 55
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    add-int/lit16 v3, v3, 0x121

    .line 60
    .line 61
    int-to-char v3, v3

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    add-int/lit8 v5, v5, 0x18

    .line 68
    .line 69
    invoke-static {v4}, Landroid/os/Process;->getThreadPriority(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    add-int/lit8 v6, v6, 0x14

    .line 74
    .line 75
    shr-int/lit8 v6, v6, 0x6

    .line 76
    .line 77
    const/16 v7, 0x26

    .line 78
    .line 79
    invoke-static {v7, v6, v3, v5}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v2, v3, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    sget v2, LVa/Z9;->e:I

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x41

    .line 93
    .line 94
    rem-int/lit16 v2, v2, 0x80

    .line 95
    .line 96
    sput v2, LVa/Z9;->f:I

    .line 97
    .line 98
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 99
    .line 100
    .line 101
    sget p1, LVa/Z9;->e:I

    .line 102
    .line 103
    add-int/lit8 p1, p1, 0x2d

    .line 104
    .line 105
    rem-int/lit16 p2, p1, 0x80

    .line 106
    .line 107
    sput p2, LVa/Z9;->f:I

    .line 108
    .line 109
    rem-int/lit8 p1, p1, 0x2

    .line 110
    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    return-void

    .line 114
    :cond_1
    throw v1

    .line 115
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V
    .locals 9

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v2, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V

    .line 23
    .line 24
    .line 25
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :goto_0
    const/4 v2, 0x0

    .line 27
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-char v3, v3

    .line 32
    const-string v4, ""

    .line 33
    .line 34
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    add-int/lit8 v5, v5, 0x18

    .line 45
    .line 46
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    int-to-char v4, v4

    .line 59
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    const-wide/16 v7, 0x0

    .line 64
    .line 65
    cmp-long v5, v5, v7

    .line 66
    .line 67
    rsub-int/lit8 v5, v5, 0x62

    .line 68
    .line 69
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    add-int/lit8 v6, v6, 0x23

    .line 74
    .line 75
    invoke-static {v5, v6, v4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v3, v4, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    sget v1, LVa/Z9;->f:I

    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x4f

    .line 93
    .line 94
    rem-int/lit16 v1, v1, 0x80

    .line 95
    .line 96
    sput v1, LVa/Z9;->e:I

    .line 97
    .line 98
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedIcon(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V

    .line 103
    .line 104
    .line 105
    sget p1, LVa/Z9;->e:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x17

    .line 108
    .line 109
    rem-int/lit16 p2, p1, 0x80

    .line 110
    .line 111
    sput p2, LVa/Z9;->f:I

    .line 112
    .line 113
    rem-int/lit8 p1, p1, 0x2

    .line 114
    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    return-void

    .line 118
    :cond_2
    throw v1
.end method

.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 9

    .line 1
    sget v0, LVa/Z9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-char v1, v1

    .line 32
    const-string v3, ""

    .line 33
    .line 34
    const/16 v4, 0x30

    .line 35
    .line 36
    invoke-static {v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    rsub-int/lit8 v5, v5, -0x1

    .line 41
    .line 42
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    rsub-int/lit8 v6, v6, 0x18

    .line 47
    .line 48
    invoke-static {v5, v6, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v5, v5, v7

    .line 63
    .line 64
    rsub-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    int-to-char v5, v5

    .line 67
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x0

    .line 72
    cmpl-float v6, v6, v7

    .line 73
    .line 74
    add-int/lit8 v6, v6, 0x3e

    .line 75
    .line 76
    invoke-static {v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    add-int/lit8 v3, v3, 0x25

    .line 81
    .line 82
    invoke-static {v6, v3, v5}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    sget v1, LVa/Z9;->e:I

    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x4d

    .line 100
    .line 101
    rem-int/lit16 v3, v1, 0x80

    .line 102
    .line 103
    sput v3, LVa/Z9;->f:I

    .line 104
    .line 105
    rem-int/lit8 v1, v1, 0x2

    .line 106
    .line 107
    if-nez v1, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/16 p1, 0x2c

    .line 113
    .line 114
    div-int/2addr p1, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_2
    return-void

    .line 120
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v2, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :goto_0
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    rsub-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    int-to-char v2, v2

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    add-int/lit8 v4, v4, 0x14

    .line 41
    .line 42
    shr-int/lit8 v4, v4, 0x6

    .line 43
    .line 44
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    shr-int/lit8 v5, v5, 0x8

    .line 49
    .line 50
    const/16 v6, 0x18

    .line 51
    .line 52
    invoke-static {v6, v5, v2, v4}, LVa/M6;->E(IICI)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    shr-int/lit8 v4, v4, 0x10

    .line 61
    .line 62
    int-to-char v4, v4

    .line 63
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    shr-int/lit8 v5, v5, 0x8

    .line 68
    .line 69
    rsub-int v5, v5, 0x85

    .line 70
    .line 71
    const-string v6, ""

    .line 72
    .line 73
    invoke-static {v6, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    add-int/lit8 v6, v6, 0x2b

    .line 78
    .line 79
    invoke-static {v5, v6, v4}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v2, v4, v0, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 88
    .line 89
    .line 90
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    sget p1, LVa/Z9;->f:I

    .line 98
    .line 99
    add-int/lit8 p1, p1, 0x1b

    .line 100
    .line 101
    rem-int/lit16 p2, p1, 0x80

    .line 102
    .line 103
    sput p2, LVa/Z9;->e:I

    .line 104
    .line 105
    rem-int/lit8 p1, p1, 0x2

    .line 106
    .line 107
    if-nez p1, :cond_1

    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    throw v1

    .line 111
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final onRequestFocus(Landroid/webkit/WebView;)V
    .locals 7

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/webkit/WebChromeClient;->onRequestFocus(Landroid/webkit/WebView;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    sget v0, LVa/Z9;->f:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x77

    .line 21
    .line 22
    rem-int/lit16 v0, v0, 0x80

    .line 23
    .line 24
    sput v0, LVa/Z9;->e:I

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {v1, p1}, Landroid/webkit/WebChromeClient;->onRequestFocus(Landroid/webkit/WebView;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_0
    const/4 v1, 0x0

    .line 35
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-char v2, v2

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    cmp-long v3, v3, v5

    .line 47
    .line 48
    add-int/lit8 v3, v3, -0x1

    .line 49
    .line 50
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    rsub-int/lit8 v4, v4, 0x18

    .line 55
    .line 56
    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, ""

    .line 65
    .line 66
    const/16 v4, 0x30

    .line 67
    .line 68
    invoke-static {v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    rsub-int/lit8 v3, v3, -0x1

    .line 73
    .line 74
    int-to-char v3, v3

    .line 75
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/lit16 v4, v4, 0x11d

    .line 80
    .line 81
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    shr-int/lit8 v5, v5, 0x16

    .line 86
    .line 87
    add-int/lit8 v5, v5, 0x23

    .line 88
    .line 89
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 98
    .line 99
    .line 100
    :goto_1
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    sget v1, LVa/Z9;->e:I

    .line 105
    .line 106
    add-int/lit8 v1, v1, 0xd

    .line 107
    .line 108
    rem-int/lit16 v1, v1, 0x80

    .line 109
    .line 110
    sput v1, LVa/Z9;->f:I

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroid/webkit/WebChromeClient;->onRequestFocus(Landroid/webkit/WebView;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onRequestFocus(Landroid/webkit/WebView;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 9

    .line 7
    :try_start_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x8

    int-to-char v1, v1

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v4

    shr-int/lit8 v4, v4, 0x8

    const/16 v5, 0x18

    .line 9
    invoke-static {v5, v4, v1, v3}, LVa/M6;->E(IICI)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    add-int/lit16 v3, v3, 0x3bb7

    int-to-char v3, v3

    const-string v4, ""

    invoke-static {v4, v2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/lit16 v4, v4, 0xb0

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    add-int/lit8 v5, v5, 0x24

    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 11
    :goto_0
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    if-eqz v0, :cond_0

    .line 12
    sget v1, LVa/Z9;->f:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v1, v1, 0x80

    sput v1, LVa/Z9;->e:I

    .line 13
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V

    goto :goto_1

    .line 14
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V

    sget p1, LVa/Z9;->e:I

    add-int/lit8 p1, p1, 0x21

    rem-int/lit16 p2, p1, 0x80

    sput p2, LVa/Z9;->f:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    :goto_1
    return-void

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 6

    .line 1
    sget v0, LVa/Z9;->e:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v0, v0, 0x80

    sput v0, LVa/Z9;->f:I

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v2

    shr-int/lit8 v2, v2, 0x8

    int-to-char v2, v2

    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    move-result v3

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x18

    invoke-static {v3, v4, v2}, LVa/Z9;->b(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    add-int/lit16 v3, v3, 0x3bb8

    int-to-char v3, v3

    const-string v4, ""

    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    move-result v4

    add-int/lit16 v4, v4, 0xb1

    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x25

    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 4
    :goto_0
    iget-object v1, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 6
    sget p1, LVa/Z9;->f:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p2, p1, 0x80

    sput p2, LVa/Z9;->e:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    const/16 p1, 0xa

    div-int/2addr p1, v0

    goto :goto_1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public final onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 6

    .line 1
    sget v0, LVa/Z9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x68

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, LVa/Z9;->b:Landroid/webkit/WebChromeClient;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :goto_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    const-wide/16 v3, 0x0

    .line 33
    .line 34
    cmp-long v1, v1, v3

    .line 35
    .line 36
    rsub-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    int-to-char v1, v1

    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/lit8 v3, v3, 0x14

    .line 45
    .line 46
    shr-int/lit8 v3, v3, 0x6

    .line 47
    .line 48
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    shr-int/lit8 v4, v4, 0x10

    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x18

    .line 55
    .line 56
    invoke-static {v3, v4, v1}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/lit16 v3, v3, 0x73de

    .line 69
    .line 70
    int-to-char v3, v3

    .line 71
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    add-int/lit16 v4, v4, 0x3f9

    .line 76
    .line 77
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    add-int/lit8 v5, v5, 0x26

    .line 82
    .line 83
    invoke-static {v4, v5, v3}, LVa/Z9;->b(IIC)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 92
    .line 93
    .line 94
    :cond_1
    :goto_2
    iget-object v0, p0, LVa/Z9;->a:Landroid/webkit/WebChromeClient;

    .line 95
    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    sget v1, LVa/Z9;->f:I

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x9

    .line 101
    .line 102
    rem-int/lit16 v1, v1, 0x80

    .line 103
    .line 104
    sput v1, LVa/Z9;->e:I

    .line 105
    .line 106
    sget v1, LVa/Z9;->f:I

    .line 107
    .line 108
    add-int/lit8 v1, v1, 0x77

    .line 109
    .line 110
    rem-int/lit16 v1, v1, 0x80

    .line 111
    .line 112
    sput v1, LVa/Z9;->e:I

    .line 113
    .line 114
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    return p1

    .line 119
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    sget p2, LVa/Z9;->f:I

    .line 124
    .line 125
    add-int/lit8 p2, p2, 0x1b

    .line 126
    .line 127
    rem-int/lit16 p2, p2, 0x80

    .line 128
    .line 129
    sput p2, LVa/Z9;->e:I

    .line 130
    .line 131
    return p1
.end method
