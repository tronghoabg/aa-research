.class public final LVa/q8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/HashMap;

.field public static final e:Ljava/util/HashMap;

.field public static final f:[C

.field public static final g:J

.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public a:I

.field public b:I

.field public c:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x4e8

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const-string v2, "\u0000{\u0000m\u00f7\u00a1\u00ef\u00fc\u00e7$\u00df\u007f\u00d6\u00b0\u00ce\u00b8\u00c6>\u00beO\u00b5\u0080\u00ad\u00d1\u00a5L\u009dC\u0094\u009c\u008c\u00d7\u0084\t|,t`k\u00e8c\u00ee[5S4J\u00b9B\u00bc:\u00032K)\u0085!\u00dc\u0019\u001f\u0011A\u0008\u0096\u0000\u00d8\u00f8\u00a0\u00f07\u00e8|\u00df\u00ad\u00d7\u00e4\u00cf1\u00c7u\u00be\u00b9\u00b6\u00ce\u00ae\u0010SQ\u00f0\u00db\u0007\u0010:\u00db\u00cd\u0016\u00d5G\u0089\u00fd~&fkn\u00aaV\u00ff\u00a4\u00d0S\u0003K^C\u009b{\u00c0r\u0018\u00e5\u00a2\u0012v\n-\u0002\u00ed:\u00bb\u0000c\u00f7\u00ab\u00ef\u00e6\u00e78\u00dfy\u00d6\u00ba\u00ce\u00ed\u00c69\u0000t\u00f7\u00b6\u00ef\u00f1\u0000v\u00f7\u00a5\u00ef\u00fa\u0000m\u00f7\u00ad\u00ef\u00fb\u00e7?\u00dfy\u00d6\u00ba\u00ce\u00ff\u00c6|\u00be\u0007\u00b5\u00df\u00ad\u008f\u00a5L\u009dQ\u0094\u0080\u008c\u0098\u0084\u0019|.t`k\u00e8c\u00e3[6S4J\u00abB\u00e8:\u00012P)\u008d!\u00c1\u0019\u0015\u0011Z\u0008\u008c\u0000(\u0000i\u00f7\u00a2\u00ef\u00a8\u00e7?\u00dfd\u00d6\u00b5\u00ce\u00ec\u00c69\u00beM\u00b5\u0081\u00ad\u00c6\u00a5\u0018\u009d\u0010\u0094\u0087\u008c\u00d0\u0084\u0013|5thk\u00acc\u00ac[2SqJ\u00f8B\u00fa:\u000f2H)\u0084!\u00c3\u0019\u0007\u0011Q\u0008\u009c\u0000\u009c\u00f8\u00e2\u00f0=\u00e8(\u00df\u00ad\u00d7\u00b0\u00cfs\u00c70\u00be\u00fb\u0000)$\u0008\u00d3\u00c3\u00cb\u00c9\u00c3^\u00fb\u0005\u00f2\u00d4\u00ea\u008d\u00e2X\u009a,\u0091\u00e0\u0089\u00a7\u0081y\u00b9q\u00b0\u00f6\u00a8\u00b6\u00a0sXEP\u000cO\u00ddG\u0084\u007f^w\u001bn\u0099f\u008e\u001ei\u0016*\r\u00fc\u0005\u00a1=u5u,\u00fb$\u00b8\u00dc\u00c1\u00d4L\u00cc\u0007\u00fb\u00de\u00f3\u0098\u00ebQ\u00e3\u001c\u009a\u009d\u0092\u00e6\u008a-\u0082`\u00b9\u00aa3\u0002\u00c4\u00cf\u00dc\u009c\u00d4N\u0000f\u00f7\u00ab\u00ef\u00fa\u00e7l\u00dfc\u00d6\u00a0\u00ce\u00f9\u00c6(\u00beE\u00b5\u0089\u00ad\u00cd\u00a5\u0002\u009dD\u0094\u00d4\u008c\u00cb\u0084\u0014|/tqk\u00a4c\u00e8[pSvJ\u00bdB\u00bc:\u00062K)\u0084!\u00c0\u0019\u001f\u0011C\u0008\u009d\u0000\u00d8\u00f8\u00a0\u00f0&\u00e8q\u00df\u00ec\u00d7\u00f1\u00cft\u00c7?\u00be\u00f4\u00b6\u0087\u00c9l>\u00a1&\u00f0.f\u0016y\u001f\u00b1\u0007\u00fc\u000f2wC|\u009ad\u00cbl\tTT]\u00deE\u00c1M\u001e\u00b5%\u00bd{\u00a2\u00ae\u00aa\u00e2\u0092z\u009a{\u0083\u00bc\u008b\u00f2\u00f3J\u00fbY\u00e0\u008b\u00e8\u00d2\u00d0\u0012\u00d8\u001e\u00c1\u00d5\u00c9\u008d1\u00adqL\u0086\u0097\u009e\u00df\u0096\u0006\u00ae\\\u00a7\u0099\u00bf\u00da\u00b7\u0013\u00cf#\u00c4\u00a2\u00dc\u00f3\u00d4?\u00eca\u00e5\u00b2\u00fd\u00e8\u00f5,\r\n\u0005H\u001a\u0085\u0012\u008f*\u0000\"_;\u00943\u00caK/CcX\u00ebP\u00eah=`sy\u00fbq\u00e8\u0089\u00ca\u0081\u0013\u0099C\u00ae\u00cf`\u009c\u0097G\u008f\n\u0087\u00cb\u00bf\u009e\u00b6\u001f\u00ae\u0000\u00a6\u00c3\u00de\u00aa\u00d5{\u00cd&\u00c5\u00ea\u00fd\u00be\u00f4q\u00ec\'\u00e4\u00b7\u001c\u00d8\u0014\u0087\u000bL\u0003\u0012;\u00d73\u009b*\u0013\"\u0015Z\u00eeR\u00efIeA(y\u00f7q\u00b3h|` \u0098\u000e\u0090\u00cb\u0088\u00c3\u00bfE\u00b7\u0002\u00af\u009f\u00a7\u0092\u00de\u0017\u00d6l\u00ce\u00a7\u00c6\u00e4\u0000w\u00f7\u00ac\u00ef\u00e1\u00e7 \u00dfu\u00d6\u00f4\u00ce\u00eb\u00c6(\u00beA\u00b5\u0090\u00ad\u00cd\u00a5\u0001\u009dU\u0094\u009a\u008c\u00cc\u0084\\|#tkk\u00a6c\u00e8[9S`J\u00b1B\u00f3:\u000e2\u0004)\u009b!\u00c4\u0019\u001f\u0011A\u0008\u0094\u0000\u00d8\u00f8\u00a0\u00f0&\u00e8m\u00df\u00ec\u00d7\u00f9\u00cf:\u00c7k\u00be\u00b5\u00b6\u00c4\u00ae\u0001\u00a6\u0008\u009d\u00cb\u0095\u0098\u008d]\u0085\u001f\u0014\'\u00e3\u00e5\u00fb\u00a2\u00f3?\u00cb0\u00c2\u00f3\u00da\u00aa\u00d2{\u00aa\u0016\u00a1\u00da\u00b9\u009e\u00b1Q\u0089\u0017\u0080\u0087\u0098\u0086\u0090Zh``#\u007f\u00bbw\u00bdOfGg^\u00e8V\u00a0.^&\u0007=\u00d45\u008a\rM\u0005\u0003\u001c\u008b\u0014\u00c7\u00ec\u00ba\u00e4y\u00fc(\u00cb\u00f6\u00c3\u00a7\u00dbb\u00d3k\u00aa\u00a8\u00a2\u0088\u00baJ\u00b2\\\u0089\u0096\u00a9\u00d2^\u0014FMN\u009ev\u00c9\u0000t\u00f7\u00b6\u00ef\u00f1\u00e7l\u00dfc\u00d6\u00a0\u00ce\u00f9\u00c6(\u00beE\u00b5\u0089\u00ad\u00cd\u00a5\u0002\u009dD\u0094\u00d4\u008c\u00cb\u0084\u0014|/tqk\u00a4c\u00e8[pSvJ\u00bdB\u00bc:\u00062K)\u0084!\u00c0\u0019\u001f\u0011C\u0008\u009d\u0000\u00d8\u00f8\u00a0\u00f0&\u00e8q\u00df\u00ec\u00d7\u00f1\u00cft\u00c7{\u00be\u00bd\u00b6\u00d4\u00ae\u0007\u00a6@\u009d\u00cc\u0095\u00c3\u008d\u0000\u0085Y|\u0088t\u00a5l\u00e9d-\\bS\u00a4zm\u008d\u00ab\u0095\u00f2\u009d!\u00a5v\u00ac\u00fa\u00b4\u00fd\u00bc7\u00c4W\u00cf\u009d\u00d7\u00c9\u00df\u0010\u00e7Z\u00ee\u00da\u00f6\u00c5\u00fe\u001a\u0006!\u000e\u007f\u0011\u00aa\u0019\u00e6!~)x0\u00b38\u00b2@\u0008HES\u008a[\u00cec\u0011kMr\u0093z\u00d6\u0082\u00ae\u008a(\u0092\u007f\u00a5\u00e2\u00ad\u00ff\u00b5z\u00bd1\u00c4\u00fa\u00cc\u0089\u0000m\u00f7\u00ad\u00ef\u00fb\u00e7?\u00dfy\u00d6\u00ba\u00ce\u00ff\u00c6|\u00beC\u00b5\u0085\u00ad\u00dc\u00a5\u000f\u009dX\u0094\u00d4\u008c\u00ce\u0084\u001d|2tmk\u00a9c\u00ee[<SqJ\u00f8B\u00f2:\u00012I)\u008d\u00bc\u00b1KwS.[\u00fdc\u00aaj&r:z\u00ef\u0002\u0080\tW\u0011\u0017\u0019\u009e!\u0091(N0\u00058\u00db\u00c0\u00fe\u00c8\u00b2\u00d7:\u00df<\u00e7\u00e7\u00ef\u00e6\u00f6l\u00fe!\u0086\u00de\u008e\u009a\u0095U\u009d\t\u00a5\u00c7\u00ad\u0082\u00b4\n\u00bc\u000cD+L\u00b6T\u00bbc>kes\u00af{\u00ed/u\u00d8\u00b3\u00c0\u00ea\u00c89\u00f0n\u00f9\u00e2\u00e1\u00fd\u00e9>\u0091W\u009a\u0086\u0082\u00db\u008a\u0017\u00b2C\u00bb\u008c\u00a3\u00da\u00abJS;[gD\u00adL\u00eetf|`e\u00abm\u00aa\u0015\u0015\u001d]\u0006\u0093\u000e\u00ca6\t>W\'\u0080/\u00ce\u00d7\u00b6\u00dfz\u00c7w\u00f0\u00b4\u00f8\u00f5\u00e0+\u00e8j\u0091\u00af\u0099\u0096\u0081U\u0089E\u00b2\u0087\u00ba\u0081\u00a2K\u00af\u00a9Xz@\'H\u00e2p\u00b9yaaci\u00f4\u0011\u008f\u001a^\u0002\u0007\n\u00d22\u0086;J#\r+\u00d3\u00d3\u00bb\u00db\u00ac\u00c4{\u00cc8\u00f4\u00fe\u00fc\u00a3\u00e5g\u00edg\u0095\u00de\u009d\u0091\u0086W\u008eW\u00b6\u00dc\u00be\u0086\u00a7W\u00af\u000fW{_\u00b8G\u00e8p0\u00f0}\u0007\u00a9\u001f\u00f2\u00172/d&\u00eb>\u00f467N^E\u008f]\u00d2U\u001emJd\u0085|\u00d3tC\u008c,\u0084s\u009b\u00b8\u0093\u00e6\u00ab#\u00a3o\u00ba\u00e7\u00b2\u00e6\u00ca\u0011\u00c2_\u00d9\u00d7\u00d1\u00c4\u00e9\u0006\u00e1_\u00f8\u008f\u00f0\u0083\u0008\u00b8\u0000`\u00180\u00e9\u00eb\u001e#\u0006n\u000e\u00b06\u00f1?2\'e/\u00b1W\u0088\\\u001fDTL\u0085t\u00cc}\u0019e]m\u0091\u0095\u00a6\u009d\u00f8\u0082`\u008aw\u00b2\u00b0\u00ba\u00f3\u00a3%\u00abx\u00d3\u008c\u00db\u008c\u00c0\u0005\u00c8J\u00f0\u009c\u00f8\u009c\u00e1\u0007\u00e9]\u0011|\u0019\u00a4\u0001\u00a06c>#&\u00fbn\u009a\u008c,{\u00e8\u0017\u00b6\u00e0r\u0000=\u00f7\u00f9k\u00c5\u009c\u001d\u0000<\u0000>\u0000<\u00f7\u00f9\u0000>\u00f7\u00f9\u0000+\u0000-\u0000+\u00f7\u00ef\u0000-\u00f7\u00e9\u00f6Vr\u00c9\u00e7d\u00af\u00fe\u0084\u00fa\u0002\u0096\u0000!\u0000m\u00f7\u00ad\u00ef\u00fb\u00e7?\u00dfy\u00d6\u00ba\u00ce\u00ff\u00c6|\u00beC\u00b5\u0088\u00ad\u00c7\u00a5\u001f\u009dY\u0094\u009a\u008c\u00df\u0084\\|gt-k\u00ef\u00f0\u00bak\u00d0\u009c/\u0084h\u008c\u00b1\u00b4\u00e5\u00bd4\u00a5~\u00ad\u00ad\u00d5\u00c0\u00de\u0005\u00c6\r\u00ce\u0086\u00f6\u00c5\u00ff\u0014\u00e7O\u00ef\u0098\u0017\u00b1\u001f\u00ee\u0000?\u0008)\u0000U\u00f7\u00aa\u00ef\u00ed\u00e74\u00df`\u00d6\u00b1\u00ce\u00fb\u00c6(\u00beE\u00b5\u0080\u00ad\u0088\u00a5\u0018\u009d_\u0094\u009f\u008c\u00dd\u0084\u0012|`\u0000E\u00f7\u00bc\u00ef\u00f8\u00e7)\u00dfs\u00d6\u00a0\u00ce\u00fd\u00c68\u00be\u0000\u00b5\u008d\u00ad\u00cc\u00a5\t\u009d^\u0094\u0080\u008c\u00d1\u0084\u001a|)tak\u00bac\u00ac[2SaJ\u00acB\u00bc:\u00072K)\u009c!\u008c)\u00bf\u00del\u00c6#\u00ce\u00ed\u00f6\u00b8\u00ffz\u00e7!\u00ef\u00f8\u0097\u0082\u009cG\u0084E\u008c\u00c2\u00b4\u0091\u00bdX\u00a5\u0006\u00ad\u00c2U\u00ad]\u00a7BdJ,r\u00f8z\u00aac5k\"\u0013\u00c5\u001b\u0086\u0000P\u0008\r0\u00d98\u00d9!W)\u0014\u00d1m\u00d9\u00ef\u00c1\u00aa\u00f6m\u00fe1\u00e6\u00f6\u00ee\u00a2\u0097t\u009f\t\u0087\u0089\u008f\u0087\u00b4X\u00bc]\u00a4\u00d0\u00ac\u009bUG]bE*M\u00e4u\u00b5ztb6j\u00fb\u0012\u00f1\u001b\n\u0003A\u000b\u008b3\u00cf8\u0013 P(\u0092\u0000s\u00f7\u00b1\u00ef\u00ea\u00e7?\u00dfs\u00d6\u00a6\u00ce\u00f1\u00c6,\u00beT\u00b5\u00c4\u00ad\u00db\u00a5\u0004\u009d_\u0094\u0081\u008c\u00d4\u0084\u0018|`tfk\u00adc\u00ac[3SxJ\u00b7B\u00ef:\u00052@)\u00c8!\u00db\u0019\u0019\u0011@\u0008\u0090\u0000\u009c\u00f8\u00a7\u00f0\u0019\u00e8/\u00e8,\u001f\u00f3\u0007\u00a6\u000fb>\u00b1\u00c9s\u00d1:\u00d9\u00eb\u00e1\u00a0K1\u00bc\u00f3\u00a4\u00ba\u00ack\u0094 \u009d\u00b6\u0085\u00a9\u008dv\u00f5\r\u00fe\u00d3\u00e6\u0086\u00eeJ\u00d6R\u00df\u00d4\u00c7\u009f\u00cf\u001e7d?) \u00e6(\u00a2\u0010}\u0018!\u0001\u00ff\t\u00baq\u0002y\u0004b\u00d3j\u00ceRSZVC\u00d7K\u009b\u00b3\u00b6\u00bbn\u00a3%\u0094\u00ea\u009c\u00f2\u0084\u007f\u008c4\u00f5\u00e8\u00fd\u008d\u00e5E\u00ed\u000b\u00d6\u00da\u00de\u009b\u00c6Y\u00ce\u0014\u00ae;Y\u00c2A\u0086IWq\rx\u00de`\u0083hF\u0010~\u001b\u00c9\u0003\u00a2\u000b`3\':\u00e4\"\u00a1*\"\u00d2\\\u00da\u000f\u00c5\u00c2\u00cd\u00d2\u00f5I\u00fd\u0005\u00e4\u00d2\u00ec\u00c2\u00a8S\u0000j\u00f7\u00b7\u00ef\u00e7\u00e7\"\u00df0\u00d6\u00bf\u00ce\u00fd\u00c6%\u00be\u0000\u00b5\u0097\u00ad\u00c0\u00a5\u0003\u009dE\u0094\u0098\u008c\u00dc\u0084\\|\"tak\u00e8c\u00ea[?SxJ\u00b4B\u00f3:\u00172A)\u008c!\u008c\u0019\u0012\u0011M\u0008\u00d8\u0000\u00dd\u00f8\u00a0\u00f02\u00e8i\u00df\u00a0\u00d7\u00e5\u00cf1\u00c78\u00be\u00bd\u00b6\u00c6\u00ae\u0010\u00a6M\u009d\u009e\u0095\u0090\u008dS\u0085\u0002|\u00dbv\u0080\u0000l\u00f7\u00ad\u00ef\u00fb\u00e78\u00df0\u00d6\u00a7\u00ce\u00f0\u00c63\u00beU\u00b5\u0088\u00ad\u00cc\u00a5L\u009dU\u0094\u009a\u008c\u00dc\u0084\\|7tmk\u00bcc\u00e4[pS3\u0086#\u0000U\u00f7\u00aa\u00ef\u00ed\u00e74\u00df`\u00d6\u00b1\u00ce\u00fb\u00c6(\u00beE\u00b5\u0080\u00ad\u0088\u00a5\t\u009d^\u0094\u0090\u008c\u0098\u0084\u0013|&t$k\u00bcc\u00e3[;SqJ\u00b6B\u00ef\u0000E\u00f7\u00bc\u00ef\u00eb\u00e7)\u00df`\u00d6\u00a0\u00ce\u00f1\u00c63\u00beN\u00b5\u00c4\u00ad\u00df\u00a5\u0004\u009dY\u0094\u0098\u008c\u00dd\u0084\\|\'tak\u00bcc\u00f8[9SzJ\u00bfB\u00bc:\u000e2A)\u0090!\u00d8\u0019P\u0011@\u0008\u0097\u0000\u00d7\u00f8\u00e5\u00f0*5\u00f9\u00c2\u0000\u00daW\u00d2\u0095\u00ea\u00dc\u00e3\u001c\u00fbM\u00f3\u008f\u008b\u00f2\u0080x\u0098c\u0090\u00b8\u00a8\u00e5\u00a1$\u00b9a\u00b1\u00e0I\u008cA\u00dd^\u0011V[n\u0085f\u00c6\u007f\u0003w\u0000\u000f\u00bd\u0007\u00ec\u001ct\u0014~,\u00a9$\u00f0=05 \u00cdH\u00c5\u0097\u00dd\u00df\u00ea\u0015\u00e2B>\u000e\u00c9\u008b\u00d1\u00c0\u00d9\u0016\u00e1[\u00e8\u0088\u00f0\u0096\u00e0\u0094\u0017m\u000f)\u0007\u00f8?\u00a26q.,&\u00e9^\u00d1\u0000 \u00f7\u00a6\u00ef\u00fd\u00e78\u00df0\u00d6\u00a6\u00ce\u00fd\u00c6?\u00beE\u00b5\u008d\u00ad\u00de\u00a5\t\u009dT\u0094\u00d4\u0000 \u00f7\u00e9\u00ef\u00a8"

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
    sput-object v1, LVa/q8;->f:[C

    .line 14
    .line 15
    const-wide v0, -0x3bcc0b493748083cL    # -3.681216394839586E20

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    sput-wide v0, LVa/q8;->g:J

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LVa/q8;->d:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, LVa/q8;->e:Ljava/util/HashMap;

    .line 35
    .line 36
    sget v0, LVa/q8;->i:I

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x41

    .line 39
    .line 40
    rem-int/lit16 v0, v0, 0x80

    .line 41
    .line 42
    sput v0, LVa/q8;->h:I

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LVa/q8;->a:I

    .line 6
    .line 7
    iput v0, p0, LVa/q8;->b:I

    .line 8
    .line 9
    iput-byte v0, p0, LVa/q8;->c:B

    .line 10
    .line 11
    return-void
.end method

.method public static j(LVa/y8;)LVa/y8;
    .locals 2

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->i:I

    .line 8
    .line 9
    sget-object v0, LVa/q8;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LVa/y8;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    sget v1, LVa/q8;->i:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0xd

    .line 22
    .line 23
    rem-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    sput v1, LVa/q8;->h:I

    .line 26
    .line 27
    invoke-virtual {v0, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget v0, LVa/q8;->h:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0xd

    .line 33
    .line 34
    rem-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    sput v0, LVa/q8;->i:I

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    return-object v1
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    rsub-int v3, v3, 0x3e2d

    .line 28
    .line 29
    int-to-char v3, v3

    .line 30
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    add-int/lit16 v4, v4, 0x4c7

    .line 35
    .line 36
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    rsub-int/lit8 v5, v5, 0x7

    .line 41
    .line 42
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object p0, v0

    .line 62
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const/16 v3, 0x30

    .line 68
    .line 69
    invoke-static {v0, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const v4, 0xe0d0

    .line 74
    .line 75
    .line 76
    sub-int/2addr v4, v3

    .line 77
    int-to-char v3, v4

    .line 78
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    rsub-int v4, v4, 0x4cd

    .line 83
    .line 84
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    add-int/lit8 v5, v5, 0x9

    .line 89
    .line 90
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    int-to-char p0, p0

    .line 112
    const/4 p1, 0x0

    .line 113
    invoke-static {p1, p1}, Landroid/graphics/PointF;->length(FF)F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    cmpl-float v3, v3, p1

    .line 118
    .line 119
    add-int/lit16 v3, v3, 0x4d7

    .line 120
    .line 121
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    add-int/lit8 v4, v4, 0x14

    .line 126
    .line 127
    shr-int/lit8 v4, v4, 0x6

    .line 128
    .line 129
    add-int/lit8 v4, v4, 0xe

    .line 130
    .line 131
    invoke-static {v3, v4, p0}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    if-eqz p3, :cond_1

    .line 146
    .line 147
    new-instance p0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    int-to-char p2, p2

    .line 157
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    add-int/lit16 v0, v0, 0x4e5

    .line 162
    .line 163
    invoke-static {p1, p1}, Landroid/graphics/PointF;->length(FF)F

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    cmpl-float p1, v3, p1

    .line 168
    .line 169
    rsub-int/lit8 p1, p1, 0x3

    .line 170
    .line 171
    invoke-static {v0, p1, p2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :cond_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    sget p1, LVa/q8;->i:I

    .line 197
    .line 198
    add-int/lit8 p1, p1, 0x3d

    .line 199
    .line 200
    rem-int/lit16 p2, p1, 0x80

    .line 201
    .line 202
    sput p2, LVa/q8;->h:I

    .line 203
    .line 204
    rem-int/lit8 p1, p1, 0x2

    .line 205
    .line 206
    if-eqz p1, :cond_2

    .line 207
    .line 208
    const/16 p1, 0x2f

    .line 209
    .line 210
    div-int/2addr p1, v1

    .line 211
    :cond_2
    return-object p0

    .line 212
    :cond_3
    const/4 p0, 0x0

    .line 213
    throw p0
.end method

.method public static p(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/q8;->f:[C

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
    sget-wide v7, LVa/q8;->g:J

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

.method public static t(LVa/c9;)LVa/c9;
    .locals 4

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    sget-object v1, LVa/q8;->e:Ljava/util/HashMap;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LVa/c9;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget v0, LVa/q8;->h:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x6b

    .line 27
    .line 28
    rem-int/lit16 v3, v0, 0x80

    .line 29
    .line 30
    sput v3, LVa/q8;->i:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v1, p0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    throw v2

    .line 44
    :cond_1
    return-object v0

    .line 45
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, LVa/c9;

    .line 50
    .line 51
    throw v2
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 1

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->h:I

    .line 8
    .line 9
    iget v0, p0, LVa/q8;->a:I

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    sget p1, LVa/q8;->i:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x75

    .line 20
    .line 21
    rem-int/lit16 p1, p1, 0x80

    .line 22
    .line 23
    sput p1, LVa/q8;->h:I

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final b(Ljava/util/List;)LVa/v8;
    .locals 5

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    sget v0, LVa/q8;->i:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x25

    .line 25
    .line 26
    rem-int/lit16 v0, v0, 0x80

    .line 27
    .line 28
    sput v0, LVa/q8;->h:I

    .line 29
    .line 30
    :try_start_1
    iget v0, p0, LVa/q8;->a:I

    .line 31
    .line 32
    add-int/lit8 v3, v0, 0x1

    .line 33
    .line 34
    iput v3, p0, LVa/q8;->a:I

    .line 35
    .line 36
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, LVa/v8;

    .line 41
    .line 42
    return-object p1

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    shr-int/lit8 p1, p1, 0x10

    .line 50
    .line 51
    int-to-char p1, p1

    .line 52
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    cmpl-float v0, v0, v2

    .line 57
    .line 58
    rsub-int v0, v0, 0x469

    .line 59
    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    shr-int/lit8 v3, v3, 0x10

    .line 65
    .line 66
    rsub-int/lit8 v3, v3, 0x18

    .line 67
    .line 68
    invoke-static {v0, v3, p1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1, v1}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_1
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    .line 83
    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    throw p1

    .line 86
    :goto_0
    const/4 v0, 0x0

    .line 87
    const-string v3, ""

    .line 88
    .line 89
    const/16 v4, 0x30

    .line 90
    .line 91
    invoke-static {v3, v4, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    rsub-int/lit8 v0, v0, -0x1

    .line 96
    .line 97
    int-to-char v0, v0

    .line 98
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    shr-int/lit8 v3, v3, 0x10

    .line 103
    .line 104
    rsub-int v3, v3, 0x480

    .line 105
    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    cmpl-float v2, v4, v2

    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x21

    .line 113
    .line 114
    invoke-static {v3, v2, v0}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p0, v0, p1}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 123
    .line 124
    .line 125
    throw v1
.end method

.method public final c(Ljava/util/ArrayList;)LVa/v8;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    sget v2, LVa/q8;->i:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x15

    .line 12
    .line 13
    rem-int/lit16 v3, v2, 0x80

    .line 14
    .line 15
    sput v3, LVa/q8;->h:I

    .line 16
    .line 17
    rem-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    :try_start_1
    iget v2, p0, LVa/q8;->a:I

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, LVa/v8;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    .line 29
    const/16 v2, 0x17

    .line 30
    .line 31
    :try_start_2
    div-int/2addr v2, v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    throw p1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    :try_start_3
    iget v2, p0, LVa/q8;->a:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LVa/v8;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    sget p1, LVa/q8;->i:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x65

    .line 49
    .line 50
    rem-int/lit16 p1, p1, 0x80

    .line 51
    .line 52
    sput p1, LVa/q8;->h:I

    .line 53
    .line 54
    return-object v0

    .line 55
    :goto_0
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/lit16 v4, v4, 0x35bc

    .line 62
    .line 63
    int-to-char v4, v4

    .line 64
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    cmp-long v2, v5, v2

    .line 69
    .line 70
    add-int/lit16 v2, v2, 0x4a1

    .line 71
    .line 72
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/lit8 v1, v1, 0x25

    .line 77
    .line 78
    invoke-static {v2, v1, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p0, v1, p1}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method

.method public final d(Ljava/util/List;)LVa/y8;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, LVa/v8;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x28

    .line 14
    .line 15
    const/4 v5, -0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    const/16 v9, 0x30

    .line 20
    .line 21
    const-string v10, ""

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    if-eqz v3, :cond_6

    .line 26
    .line 27
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual/range {p0 .. p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, LVa/v8;->f()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    if-eq v13, v4, :cond_2

    .line 44
    .line 45
    const/16 v4, 0x3d

    .line 46
    .line 47
    if-eq v13, v4, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v12, v6, v6}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    cmpl-float v4, v4, v6

    .line 55
    .line 56
    rsub-int v4, v4, 0x2ab

    .line 57
    .line 58
    int-to-char v4, v4

    .line 59
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    cmp-long v7, v9, v7

    .line 64
    .line 65
    rsub-int v7, v7, 0x317

    .line 66
    .line 67
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    shr-int/lit8 v8, v8, 0x10

    .line 72
    .line 73
    add-int/2addr v8, v11

    .line 74
    invoke-static {v7, v8, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

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
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move v5, v12

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    invoke-static {v10, v9, v12, v12}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    rsub-int/lit8 v4, v4, -0x1

    .line 96
    .line 97
    int-to-char v4, v4

    .line 98
    invoke-static {v12, v12}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    add-int/lit8 v9, v9, 0x6e

    .line 103
    .line 104
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 105
    .line 106
    .line 107
    move-result-wide v13

    .line 108
    cmp-long v7, v13, v7

    .line 109
    .line 110
    invoke-static {v9, v7, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    move v5, v11

    .line 125
    :cond_3
    :goto_0
    if-eqz v5, :cond_5

    .line 126
    .line 127
    if-eq v5, v11, :cond_4

    .line 128
    .line 129
    iget v1, v0, LVa/q8;->a:I

    .line 130
    .line 131
    sub-int/2addr v1, v11

    .line 132
    iput v1, v0, LVa/q8;->a:I

    .line 133
    .line 134
    new-instance v1, LVa/J8;

    .line 135
    .line 136
    invoke-direct {v1, v2}, LVa/J8;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    return-object v1

    .line 144
    :cond_4
    new-instance v3, LVa/H8;

    .line 145
    .line 146
    invoke-static {v12}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    cmpl-float v4, v4, v6

    .line 151
    .line 152
    int-to-char v4, v4

    .line 153
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    shr-int/lit8 v5, v5, 0x10

    .line 158
    .line 159
    rsub-int v5, v5, 0x97

    .line 160
    .line 161
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    cmpl-float v6, v7, v6

    .line 166
    .line 167
    sub-int/2addr v11, v6

    .line 168
    invoke-static {v5, v11, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v0, v4, v1}, LVa/q8;->z(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-direct {v3, v2, v1}, LVa/H8;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v3}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    return-object v1

    .line 188
    :cond_5
    new-instance v3, LVa/C8;

    .line 189
    .line 190
    new-instance v4, LVa/J8;

    .line 191
    .line 192
    invoke-direct {v4, v2}, LVa/J8;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v4}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, LVa/J8;

    .line 200
    .line 201
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v3, v2, v1}, LVa/C8;-><init>(LVa/J8;LVa/y8;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v3}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    return-object v1

    .line 213
    :cond_6
    invoke-virtual {v2}, LVa/v8;->g()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eq v3, v11, :cond_9

    .line 218
    .line 219
    invoke-virtual {v2}, LVa/v8;->e()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_7

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_7
    sget v3, LVa/v8;->c:I

    .line 227
    .line 228
    add-int/lit8 v3, v3, 0x55

    .line 229
    .line 230
    rem-int/lit16 v3, v3, 0x80

    .line 231
    .line 232
    sput v3, LVa/v8;->d:I

    .line 233
    .line 234
    invoke-virtual {v2}, LVa/v8;->b()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-nez v3, :cond_9

    .line 239
    .line 240
    invoke-virtual {v2}, LVa/v8;->c()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_8

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_8
    sget v3, LVa/v8;->d:I

    .line 248
    .line 249
    add-int/lit8 v3, v3, 0x51

    .line 250
    .line 251
    rem-int/lit16 v3, v3, 0x80

    .line 252
    .line 253
    sput v3, LVa/v8;->c:I

    .line 254
    .line 255
    move v3, v12

    .line 256
    goto :goto_2

    .line 257
    :cond_9
    :goto_1
    move v3, v11

    .line 258
    :goto_2
    const/4 v13, 0x0

    .line 259
    const/4 v14, 0x2

    .line 260
    if-nez v3, :cond_1e

    .line 261
    .line 262
    invoke-virtual {v2}, LVa/v8;->d()LVa/u8;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    sget-object v15, LVa/u8;->h:LVa/u8;

    .line 267
    .line 268
    move/from16 v16, v5

    .line 269
    .line 270
    const/16 v5, 0x5b

    .line 271
    .line 272
    if-ne v3, v15, :cond_b

    .line 273
    .line 274
    sget v1, LVa/v8;->c:I

    .line 275
    .line 276
    add-int/2addr v1, v5

    .line 277
    rem-int/lit16 v1, v1, 0x80

    .line 278
    .line 279
    sput v1, LVa/v8;->d:I

    .line 280
    .line 281
    add-int/lit8 v1, v1, 0x45

    .line 282
    .line 283
    rem-int/lit16 v3, v1, 0x80

    .line 284
    .line 285
    sput v3, LVa/v8;->c:I

    .line 286
    .line 287
    rem-int/2addr v1, v14

    .line 288
    if-eqz v1, :cond_a

    .line 289
    .line 290
    const/16 v1, 0x62

    .line 291
    .line 292
    div-int/2addr v1, v12

    .line 293
    :cond_a
    new-instance v1, LVa/B8;

    .line 294
    .line 295
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-direct {v1, v2}, LVa/B8;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    return-object v1

    .line 307
    :cond_b
    sget v3, LVa/v8;->c:I

    .line 308
    .line 309
    add-int/lit8 v3, v3, 0x63

    .line 310
    .line 311
    rem-int/lit16 v3, v3, 0x80

    .line 312
    .line 313
    sput v3, LVa/v8;->d:I

    .line 314
    .line 315
    invoke-virtual {v2}, LVa/v8;->d()LVa/u8;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    sget-object v15, LVa/u8;->a:LVa/u8;

    .line 320
    .line 321
    if-ne v3, v15, :cond_d

    .line 322
    .line 323
    sget v3, LVa/v8;->d:I

    .line 324
    .line 325
    add-int/lit8 v3, v3, 0x67

    .line 326
    .line 327
    rem-int/lit16 v3, v3, 0x80

    .line 328
    .line 329
    sput v3, LVa/v8;->c:I

    .line 330
    .line 331
    sget v3, LVa/q8;->h:I

    .line 332
    .line 333
    add-int/lit8 v3, v3, 0x4f

    .line 334
    .line 335
    rem-int/lit16 v4, v3, 0x80

    .line 336
    .line 337
    sput v4, LVa/q8;->i:I

    .line 338
    .line 339
    rem-int/2addr v3, v14

    .line 340
    if-eqz v3, :cond_c

    .line 341
    .line 342
    invoke-virtual {v0, v2, v1}, LVa/q8;->o(LVa/v8;Ljava/util/List;)LVa/y8;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    return-object v1

    .line 347
    :cond_c
    invoke-virtual {v0, v2, v1}, LVa/q8;->o(LVa/v8;Ljava/util/List;)LVa/y8;

    .line 348
    .line 349
    .line 350
    throw v13

    .line 351
    :cond_d
    sget v3, LVa/v8;->c:I

    .line 352
    .line 353
    add-int/lit8 v3, v3, 0x4f

    .line 354
    .line 355
    rem-int/lit16 v15, v3, 0x80

    .line 356
    .line 357
    sput v15, LVa/v8;->d:I

    .line 358
    .line 359
    rem-int/2addr v3, v14

    .line 360
    if-nez v3, :cond_e

    .line 361
    .line 362
    invoke-virtual {v2}, LVa/v8;->d()LVa/u8;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    sget-object v15, LVa/u8;->c:LVa/u8;

    .line 367
    .line 368
    const/16 v17, 0x5e

    .line 369
    .line 370
    div-int/lit8 v17, v17, 0x0

    .line 371
    .line 372
    if-ne v3, v15, :cond_1d

    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_e
    invoke-virtual {v2}, LVa/v8;->d()LVa/u8;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    sget-object v15, LVa/u8;->c:LVa/u8;

    .line 380
    .line 381
    if-ne v3, v15, :cond_1d

    .line 382
    .line 383
    :goto_3
    sget v3, LVa/v8;->d:I

    .line 384
    .line 385
    add-int/lit8 v3, v3, 0x29

    .line 386
    .line 387
    rem-int/lit16 v3, v3, 0x80

    .line 388
    .line 389
    sput v3, LVa/v8;->c:I

    .line 390
    .line 391
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 396
    .line 397
    .line 398
    move-result v15

    .line 399
    move/from16 v17, v6

    .line 400
    .line 401
    const/16 v6, 0x21

    .line 402
    .line 403
    move-wide/from16 v18, v7

    .line 404
    .line 405
    const/4 v7, 0x3

    .line 406
    const/4 v8, 0x4

    .line 407
    if-eq v15, v6, :cond_15

    .line 408
    .line 409
    if-eq v15, v4, :cond_14

    .line 410
    .line 411
    const/16 v4, 0x2d

    .line 412
    .line 413
    if-eq v15, v4, :cond_13

    .line 414
    .line 415
    if-eq v15, v5, :cond_11

    .line 416
    .line 417
    const/16 v4, 0x7b

    .line 418
    .line 419
    if-eq v15, v4, :cond_f

    .line 420
    .line 421
    goto/16 :goto_5

    .line 422
    .line 423
    :cond_f
    invoke-static {v10, v10, v12, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    int-to-char v4, v4

    .line 428
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    shr-int/lit8 v5, v5, 0x10

    .line 433
    .line 434
    invoke-static {v12}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    rsub-int/lit8 v6, v6, 0x1

    .line 439
    .line 440
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    if-eq v3, v11, :cond_10

    .line 453
    .line 454
    goto/16 :goto_5

    .line 455
    .line 456
    :cond_10
    move v3, v14

    .line 457
    goto/16 :goto_6

    .line 458
    .line 459
    :cond_11
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    shr-int/lit8 v4, v4, 0x10

    .line 464
    .line 465
    const v5, 0x84a1

    .line 466
    .line 467
    .line 468
    add-int/2addr v4, v5

    .line 469
    int-to-char v4, v4

    .line 470
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    shr-int/lit8 v5, v5, 0x10

    .line 475
    .line 476
    add-int/lit16 v5, v5, 0x315

    .line 477
    .line 478
    invoke-static {v10, v9, v12}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    neg-int v6, v6

    .line 483
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-eqz v3, :cond_16

    .line 496
    .line 497
    sget v3, LVa/q8;->i:I

    .line 498
    .line 499
    add-int/lit8 v3, v3, 0x41

    .line 500
    .line 501
    rem-int/lit16 v4, v3, 0x80

    .line 502
    .line 503
    sput v4, LVa/q8;->h:I

    .line 504
    .line 505
    rem-int/2addr v3, v14

    .line 506
    if-eqz v3, :cond_12

    .line 507
    .line 508
    :goto_4
    move v3, v12

    .line 509
    goto/16 :goto_6

    .line 510
    .line 511
    :cond_12
    move v3, v11

    .line 512
    goto/16 :goto_6

    .line 513
    .line 514
    :cond_13
    invoke-static {v10, v12}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    int-to-char v4, v4

    .line 519
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 520
    .line 521
    .line 522
    move-result v5

    .line 523
    int-to-byte v5, v5

    .line 524
    add-int/lit16 v5, v5, 0x30d

    .line 525
    .line 526
    invoke-static {v12, v12}, Landroid/view/View;->getDefaultSize(II)I

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    rsub-int/lit8 v6, v6, 0x1

    .line 531
    .line 532
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-eqz v3, :cond_16

    .line 545
    .line 546
    sget v3, LVa/q8;->h:I

    .line 547
    .line 548
    add-int/lit8 v3, v3, 0x5

    .line 549
    .line 550
    rem-int/lit16 v3, v3, 0x80

    .line 551
    .line 552
    sput v3, LVa/q8;->i:I

    .line 553
    .line 554
    move v3, v8

    .line 555
    goto :goto_6

    .line 556
    :cond_14
    invoke-static {v10, v12}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    int-to-char v4, v4

    .line 561
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    shr-int/lit8 v5, v5, 0x10

    .line 566
    .line 567
    rsub-int/lit8 v5, v5, 0x6e

    .line 568
    .line 569
    invoke-static {v12}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    neg-int v6, v6

    .line 574
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    if-eqz v3, :cond_16

    .line 587
    .line 588
    goto :goto_4

    .line 589
    :cond_15
    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    int-to-char v4, v4

    .line 594
    invoke-static {v10, v9, v12, v12}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    rsub-int v5, v5, 0x316

    .line 599
    .line 600
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    shr-int/lit8 v6, v6, 0x10

    .line 605
    .line 606
    add-int/2addr v6, v11

    .line 607
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_16

    .line 620
    .line 621
    sget v3, LVa/q8;->i:I

    .line 622
    .line 623
    add-int/lit8 v3, v3, 0xd

    .line 624
    .line 625
    rem-int/lit16 v3, v3, 0x80

    .line 626
    .line 627
    sput v3, LVa/q8;->h:I

    .line 628
    .line 629
    move v3, v7

    .line 630
    goto :goto_6

    .line 631
    :cond_16
    :goto_5
    move/from16 v3, v16

    .line 632
    .line 633
    :goto_6
    if-eqz v3, :cond_1c

    .line 634
    .line 635
    if-eq v3, v11, :cond_1b

    .line 636
    .line 637
    if-eq v3, v14, :cond_19

    .line 638
    .line 639
    if-eq v3, v7, :cond_18

    .line 640
    .line 641
    if-ne v3, v8, :cond_17

    .line 642
    .line 643
    new-instance v2, LVa/R8;

    .line 644
    .line 645
    new-instance v3, LVa/U8;

    .line 646
    .line 647
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    const/4 v5, 0x2

    .line 652
    invoke-direct {v3, v4, v5}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 653
    .line 654
    .line 655
    invoke-static {v3}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    invoke-virtual/range {p0 .. p1}, LVa/q8;->d(Ljava/util/List;)LVa/y8;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    const/4 v4, 0x0

    .line 664
    invoke-direct {v2, v3, v1, v4}, LVa/R8;-><init>(LVa/y8;LVa/y8;I)V

    .line 665
    .line 666
    .line 667
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    return-object v1

    .line 672
    :cond_17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 675
    .line 676
    .line 677
    invoke-static {v10, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    rsub-int v3, v3, 0x6b84

    .line 682
    .line 683
    int-to-char v3, v3

    .line 684
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    cmpl-float v4, v4, v17

    .line 689
    .line 690
    add-int/lit16 v4, v4, 0x32c

    .line 691
    .line 692
    invoke-static {v12}, Landroid/graphics/Color;->green(I)I

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    add-int/lit8 v5, v5, 0x14

    .line 697
    .line 698
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    invoke-virtual {v0, v1}, LVa/q8;->q(Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    throw v13

    .line 724
    :cond_18
    new-instance v2, LVa/O8;

    .line 725
    .line 726
    invoke-virtual/range {p0 .. p1}, LVa/q8;->e(Ljava/util/List;)LVa/y8;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    const/4 v3, 0x2

    .line 731
    invoke-direct {v2, v1, v3}, LVa/O8;-><init>(LVa/y8;I)V

    .line 732
    .line 733
    .line 734
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    return-object v1

    .line 739
    :cond_19
    new-instance v2, LVa/A8;

    .line 740
    .line 741
    new-instance v3, Ljava/util/HashMap;

    .line 742
    .line 743
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-static {v12, v12}, Landroid/view/View;->resolveSize(II)I

    .line 747
    .line 748
    .line 749
    move-result v4

    .line 750
    add-int/lit16 v4, v4, 0x6ee7

    .line 751
    .line 752
    int-to-char v4, v4

    .line 753
    invoke-static {v12, v12, v12}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 754
    .line 755
    .line 756
    move-result v5

    .line 757
    rsub-int v5, v5, 0x2fc

    .line 758
    .line 759
    invoke-static {v12}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 760
    .line 761
    .line 762
    move-result v6

    .line 763
    rsub-int/lit8 v6, v6, 0x1

    .line 764
    .line 765
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    new-instance v5, LVa/n8;

    .line 774
    .line 775
    const/4 v6, 0x0

    .line 776
    invoke-direct {v5, v6}, LVa/n8;-><init>(I)V

    .line 777
    .line 778
    .line 779
    iput-object v0, v5, LVa/n8;->b:LVa/q8;

    .line 780
    .line 781
    invoke-virtual {v0, v1, v4, v5}, LVa/q8;->m(Ljava/util/List;Ljava/lang/String;LVa/p8;)Ljava/util/ArrayList;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 790
    .line 791
    .line 792
    move-result v4

    .line 793
    xor-int/2addr v4, v11

    .line 794
    if-eq v4, v11, :cond_1a

    .line 795
    .line 796
    sget v4, LVa/q8;->i:I

    .line 797
    .line 798
    add-int/lit8 v4, v4, 0x71

    .line 799
    .line 800
    rem-int/lit16 v4, v4, 0x80

    .line 801
    .line 802
    sput v4, LVa/q8;->h:I

    .line 803
    .line 804
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    check-cast v4, Landroid/util/Pair;

    .line 809
    .line 810
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 811
    .line 812
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 813
    .line 814
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    goto :goto_7

    .line 818
    :cond_1a
    sget v1, LVa/q8;->i:I

    .line 819
    .line 820
    add-int/lit8 v1, v1, 0x53

    .line 821
    .line 822
    rem-int/lit16 v1, v1, 0x80

    .line 823
    .line 824
    sput v1, LVa/q8;->h:I

    .line 825
    .line 826
    invoke-direct {v2, v3}, LVa/A8;-><init>(Ljava/util/HashMap;)V

    .line 827
    .line 828
    .line 829
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    return-object v1

    .line 834
    :cond_1b
    new-instance v2, LVa/z8;

    .line 835
    .line 836
    const v3, 0xf117

    .line 837
    .line 838
    .line 839
    invoke-static {v9}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    sub-int/2addr v3, v4

    .line 844
    int-to-char v3, v3

    .line 845
    invoke-static {v12}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 846
    .line 847
    .line 848
    move-result v4

    .line 849
    add-int/lit16 v4, v4, 0x32b

    .line 850
    .line 851
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 852
    .line 853
    .line 854
    move-result-wide v5

    .line 855
    cmp-long v5, v5, v18

    .line 856
    .line 857
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    invoke-virtual {v0, v3, v1}, LVa/q8;->z(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    invoke-direct {v2, v1}, LVa/z8;-><init>(Ljava/util/ArrayList;)V

    .line 870
    .line 871
    .line 872
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    return-object v1

    .line 877
    :cond_1c
    new-instance v2, LVa/G8;

    .line 878
    .line 879
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 880
    .line 881
    .line 882
    move-result-object v3

    .line 883
    invoke-direct {v2, v3}, LVa/G8;-><init>(LVa/y8;)V

    .line 884
    .line 885
    .line 886
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 891
    .line 892
    .line 893
    move-result v3

    .line 894
    shr-int/lit8 v3, v3, 0x10

    .line 895
    .line 896
    int-to-char v3, v3

    .line 897
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 898
    .line 899
    .line 900
    move-result v4

    .line 901
    shr-int/lit8 v4, v4, 0x8

    .line 902
    .line 903
    rsub-int v4, v4, 0x97

    .line 904
    .line 905
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 906
    .line 907
    .line 908
    move-result-wide v5

    .line 909
    cmp-long v5, v5, v18

    .line 910
    .line 911
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v3

    .line 915
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 920
    .line 921
    .line 922
    move-result v4

    .line 923
    rsub-int/lit8 v5, v4, -0x1

    .line 924
    .line 925
    int-to-char v4, v5

    .line 926
    invoke-static {v12, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 927
    .line 928
    .line 929
    move-result v5

    .line 930
    rsub-int v5, v5, 0x318

    .line 931
    .line 932
    invoke-static {v12}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 933
    .line 934
    .line 935
    move-result v6

    .line 936
    rsub-int/lit8 v6, v6, 0x13

    .line 937
    .line 938
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    invoke-virtual {v0, v1, v3, v2, v4}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    return-object v2

    .line 950
    :cond_1d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 951
    .line 952
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 953
    .line 954
    .line 955
    invoke-static {v10, v9, v12}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 956
    .line 957
    .line 958
    move-result v3

    .line 959
    rsub-int/lit8 v5, v3, -0x1

    .line 960
    .line 961
    int-to-char v3, v5

    .line 962
    invoke-static {v10, v10, v12, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 963
    .line 964
    .line 965
    move-result v4

    .line 966
    add-int/lit16 v4, v4, 0x340

    .line 967
    .line 968
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 969
    .line 970
    .line 971
    move-result v5

    .line 972
    shr-int/lit8 v5, v5, 0x10

    .line 973
    .line 974
    rsub-int/lit8 v5, v5, 0x11

    .line 975
    .line 976
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v3

    .line 980
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    invoke-virtual {v0, v1}, LVa/q8;->q(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    throw v13

    .line 998
    :cond_1e
    sget v1, LVa/q8;->i:I

    .line 999
    .line 1000
    add-int/lit8 v1, v1, 0x69

    .line 1001
    .line 1002
    rem-int/lit16 v3, v1, 0x80

    .line 1003
    .line 1004
    sput v3, LVa/q8;->h:I

    .line 1005
    .line 1006
    rem-int/2addr v1, v14

    .line 1007
    if-nez v1, :cond_22

    .line 1008
    .line 1009
    invoke-virtual {v2}, LVa/v8;->e()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    if-eqz v1, :cond_1f

    .line 1014
    .line 1015
    :try_start_0
    new-instance v1, LVa/U8;

    .line 1016
    .line 1017
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v3

    .line 1021
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v3

    .line 1029
    const/4 v4, 0x2

    .line 1030
    invoke-direct {v1, v3, v4}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 1031
    .line 1032
    .line 1033
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1037
    return-object v1

    .line 1038
    :catch_0
    :try_start_1
    new-instance v1, LVa/U8;

    .line 1039
    .line 1040
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v3

    .line 1048
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    const/4 v4, 0x4

    .line 1053
    invoke-direct {v1, v3, v4}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1060
    goto :goto_8

    .line 1061
    :cond_1f
    invoke-virtual {v2}, LVa/v8;->b()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    if-eqz v1, :cond_20

    .line 1066
    .line 1067
    new-instance v1, LVa/U8;

    .line 1068
    .line 1069
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v2

    .line 1077
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    const/4 v3, 0x3

    .line 1082
    invoke-direct {v1, v2, v3}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 1083
    .line 1084
    .line 1085
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    sget v2, LVa/q8;->h:I

    .line 1090
    .line 1091
    add-int/lit8 v2, v2, 0x23

    .line 1092
    .line 1093
    rem-int/lit16 v2, v2, 0x80

    .line 1094
    .line 1095
    sput v2, LVa/q8;->i:I

    .line 1096
    .line 1097
    return-object v1

    .line 1098
    :cond_20
    invoke-virtual {v2}, LVa/v8;->c()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v1

    .line 1102
    if-eqz v1, :cond_21

    .line 1103
    .line 1104
    new-instance v1, LVa/U8;

    .line 1105
    .line 1106
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    const/4 v3, 0x1

    .line 1119
    invoke-direct {v1, v2, v3}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v1

    .line 1126
    return-object v1

    .line 1127
    :catch_1
    :cond_21
    new-instance v1, LVa/U8;

    .line 1128
    .line 1129
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    invoke-static {v2}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v2

    .line 1137
    const/4 v3, 0x0

    .line 1138
    invoke-direct {v1, v2, v3}, LVa/U8;-><init>(Ljava/lang/Object;I)V

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    :goto_8
    return-object v1

    .line 1146
    :cond_22
    invoke-virtual {v2}, LVa/v8;->e()Z

    .line 1147
    .line 1148
    .line 1149
    throw v13
.end method

.method public final e(Ljava/util/List;)LVa/y8;
    .locals 13

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->h:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/q8;->d(Ljava/util/List;)LVa/y8;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_8

    .line 18
    .line 19
    sget v1, LVa/q8;->i:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x45

    .line 22
    .line 23
    rem-int/lit16 v2, v1, 0x80

    .line 24
    .line 25
    sput v2, LVa/q8;->h:I

    .line 26
    .line 27
    rem-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    if-nez v1, :cond_7

    .line 30
    .line 31
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, LVa/v8;->f()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x2e

    .line 44
    .line 45
    const/16 v4, 0x30

    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    const-string v7, ""

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, -0x1

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x1

    .line 55
    if-eq v2, v3, :cond_2

    .line 56
    .line 57
    const/16 v3, 0x5b

    .line 58
    .line 59
    if-eq v2, v3, :cond_0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    cmp-long v2, v2, v5

    .line 67
    .line 68
    const v3, 0x84a0

    .line 69
    .line 70
    .line 71
    add-int/2addr v2, v3

    .line 72
    int-to-char v2, v2

    .line 73
    invoke-static {v10}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/lit16 v3, v3, 0x316

    .line 78
    .line 79
    invoke-static {v10}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    cmpl-float v12, v12, v8

    .line 84
    .line 85
    rsub-int/lit8 v12, v12, 0x1

    .line 86
    .line 87
    invoke-static {v3, v12, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move v9, v11

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    cmpl-float v2, v2, v8

    .line 109
    .line 110
    const v3, 0xafd1

    .line 111
    .line 112
    .line 113
    sub-int/2addr v3, v2

    .line 114
    int-to-char v2, v3

    .line 115
    invoke-static {v7, v10, v10}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    add-int/lit16 v3, v3, 0x314

    .line 120
    .line 121
    invoke-static {v7, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 122
    .line 123
    .line 124
    move-result v12

    .line 125
    neg-int v12, v12

    .line 126
    invoke-static {v3, v12, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    xor-int/2addr v1, v11

    .line 139
    if-eq v1, v11, :cond_3

    .line 140
    .line 141
    move v9, v10

    .line 142
    :cond_3
    :goto_1
    if-eqz v9, :cond_6

    .line 143
    .line 144
    if-eq v9, v11, :cond_4

    .line 145
    .line 146
    iget p1, p0, LVa/q8;->a:I

    .line 147
    .line 148
    sub-int/2addr p1, v11

    .line 149
    iput p1, p0, LVa/q8;->a:I

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_4
    sget v1, LVa/q8;->h:I

    .line 153
    .line 154
    add-int/lit8 v1, v1, 0x4b

    .line 155
    .line 156
    rem-int/lit16 v1, v1, 0x80

    .line 157
    .line 158
    sput v1, LVa/q8;->i:I

    .line 159
    .line 160
    invoke-virtual {p0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    const v3, 0xf0e7

    .line 169
    .line 170
    .line 171
    sub-int/2addr v3, v2

    .line 172
    int-to-char v2, v3

    .line 173
    invoke-static {v7, v4, v10, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    rsub-int v3, v3, 0x32a

    .line 178
    .line 179
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    shr-int/lit8 v4, v4, 0x10

    .line 184
    .line 185
    rsub-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    invoke-static {v3, v4, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-static {v10, v8, v8}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    cmpl-float v3, v3, v8

    .line 200
    .line 201
    int-to-char v3, v3

    .line 202
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    shr-int/lit8 v4, v4, 0x10

    .line 207
    .line 208
    rsub-int v4, v4, 0x3ac

    .line 209
    .line 210
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    cmpl-float v5, v5, v8

    .line 215
    .line 216
    add-int/lit8 v5, v5, 0x22

    .line 217
    .line 218
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {p0, p1, v2, v1, v3}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-static {v10, v10}, Landroid/view/View;->resolveSize(II)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    add-int/lit16 v3, v3, 0x2ab

    .line 238
    .line 239
    int-to-char v3, v3

    .line 240
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    cmpl-float v4, v4, v8

    .line 245
    .line 246
    add-int/lit16 v4, v4, 0x315

    .line 247
    .line 248
    invoke-static {v7, v10, v10}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    rsub-int/lit8 v5, v5, 0x1

    .line 253
    .line 254
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v2, v3}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_5

    .line 267
    .line 268
    invoke-virtual {p0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    new-instance v3, LVa/K8;

    .line 273
    .line 274
    invoke-direct {v3, v0, v1, v2}, LVa/K8;-><init>(LVa/y8;LVa/y8;LVa/y8;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v3}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    sget v1, LVa/q8;->i:I

    .line 282
    .line 283
    add-int/lit8 v1, v1, 0x11

    .line 284
    .line 285
    rem-int/lit16 v1, v1, 0x80

    .line 286
    .line 287
    sput v1, LVa/q8;->h:I

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_5
    iget v2, p0, LVa/q8;->a:I

    .line 292
    .line 293
    sub-int/2addr v2, v11

    .line 294
    iput v2, p0, LVa/q8;->a:I

    .line 295
    .line 296
    new-instance v2, LVa/L8;

    .line 297
    .line 298
    invoke-direct {v2, v0, v1}, LVa/I8;-><init>(LVa/y8;LVa/y8;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sget v1, LVa/q8;->h:I

    .line 306
    .line 307
    add-int/lit8 v1, v1, 0x3f

    .line 308
    .line 309
    rem-int/lit16 v1, v1, 0x80

    .line 310
    .line 311
    sput v1, LVa/q8;->i:I

    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :cond_6
    invoke-virtual {p0, v0, p1}, LVa/q8;->v(LVa/y8;Ljava/util/List;)LVa/y8;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_7
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p1}, LVa/v8;->f()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    const/4 p1, 0x0

    .line 333
    throw p1

    .line 334
    :cond_8
    return-object v0
.end method

.method public final f(Ljava/util/List;)LVa/y8;
    .locals 12

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->h:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LVa/q8;->i(Ljava/util/List;)LVa/y8;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x5a

    .line 23
    .line 24
    div-int/2addr v4, v2

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, LVa/q8;->i(Ljava/util/List;)LVa/y8;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_b

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, LVa/v8;->f()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/16 v5, 0x2b

    .line 52
    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    const/4 v8, 0x3

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x1

    .line 58
    if-eq v4, v5, :cond_5

    .line 59
    .line 60
    const/16 v5, 0x2d

    .line 61
    .line 62
    if-eq v4, v5, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x560

    .line 65
    .line 66
    const-string v11, ""

    .line 67
    .line 68
    if-eq v4, v5, :cond_3

    .line 69
    .line 70
    const/16 v5, 0x5a0

    .line 71
    .line 72
    if-eq v4, v5, :cond_2

    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_2
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    int-to-char v4, v4

    .line 81
    const/16 v5, 0x30

    .line 82
    .line 83
    invoke-static {v11, v5, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    add-int/lit16 v2, v2, 0x310

    .line 88
    .line 89
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    shr-int/lit8 v5, v5, 0x10

    .line 94
    .line 95
    add-int/2addr v5, v1

    .line 96
    invoke-static {v2, v5, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    move v2, v8

    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    shr-int/lit8 v4, v4, 0x10

    .line 118
    .line 119
    int-to-char v4, v4

    .line 120
    invoke-static {v11, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    rsub-int v2, v2, 0x30d

    .line 125
    .line 126
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    add-int/2addr v5, v1

    .line 131
    invoke-static {v2, v5, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_6

    .line 144
    .line 145
    move v2, v1

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    shr-int/lit8 v4, v4, 0x10

    .line 152
    .line 153
    int-to-char v4, v4

    .line 154
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    add-int/lit8 v5, v5, 0x14

    .line 159
    .line 160
    shr-int/lit8 v5, v5, 0x6

    .line 161
    .line 162
    add-int/lit16 v5, v5, 0x30c

    .line 163
    .line 164
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    add-int/lit8 v2, v2, 0x14

    .line 169
    .line 170
    shr-int/lit8 v2, v2, 0x6

    .line 171
    .line 172
    add-int/2addr v2, v10

    .line 173
    invoke-static {v5, v2, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_6

    .line 186
    .line 187
    sget v2, LVa/q8;->i:I

    .line 188
    .line 189
    add-int/lit8 v2, v2, 0x67

    .line 190
    .line 191
    rem-int/lit16 v2, v2, 0x80

    .line 192
    .line 193
    sput v2, LVa/q8;->h:I

    .line 194
    .line 195
    move v2, v10

    .line 196
    goto :goto_2

    .line 197
    :cond_5
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    cmp-long v4, v4, v6

    .line 202
    .line 203
    rsub-int/lit8 v4, v4, -0x1

    .line 204
    .line 205
    int-to-char v4, v4

    .line 206
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    shr-int/lit8 v5, v5, 0x10

    .line 211
    .line 212
    rsub-int v5, v5, 0x30b

    .line 213
    .line 214
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    shr-int/lit8 v6, v6, 0x16

    .line 219
    .line 220
    rsub-int/lit8 v6, v6, 0x1

    .line 221
    .line 222
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_6

    .line 235
    .line 236
    sget v3, LVa/q8;->h:I

    .line 237
    .line 238
    add-int/lit8 v3, v3, 0x3b

    .line 239
    .line 240
    rem-int/lit16 v3, v3, 0x80

    .line 241
    .line 242
    sput v3, LVa/q8;->i:I

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_6
    :goto_1
    move v2, v9

    .line 246
    :goto_2
    if-eqz v2, :cond_a

    .line 247
    .line 248
    if-eq v2, v10, :cond_9

    .line 249
    .line 250
    if-eq v2, v1, :cond_8

    .line 251
    .line 252
    if-eq v2, v8, :cond_7

    .line 253
    .line 254
    iget p1, p0, LVa/q8;->a:I

    .line 255
    .line 256
    sub-int/2addr p1, v10

    .line 257
    iput p1, p0, LVa/q8;->a:I

    .line 258
    .line 259
    return-object v0

    .line 260
    :cond_7
    new-instance p1, LVa/O8;

    .line 261
    .line 262
    check-cast v0, LVa/J8;

    .line 263
    .line 264
    const/4 v1, 0x1

    .line 265
    invoke-direct {p1, v0, v1}, LVa/O8;-><init>(LVa/y8;I)V

    .line 266
    .line 267
    .line 268
    invoke-static {p1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    return-object p1

    .line 273
    :cond_8
    new-instance p1, LVa/O8;

    .line 274
    .line 275
    check-cast v0, LVa/J8;

    .line 276
    .line 277
    invoke-direct {p1}, LVa/O8;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object v0, p1, LVa/O8;->e:LVa/y8;

    .line 281
    .line 282
    invoke-static {p1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    return-object p1

    .line 287
    :cond_9
    new-instance v1, LVa/R8;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, LVa/q8;->f(Ljava/util/List;)LVa/y8;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    const/4 v2, 0x0

    .line 294
    invoke-direct {v1, v0, p1, v2}, LVa/R8;-><init>(LVa/y8;LVa/y8;I)V

    .line 295
    .line 296
    .line 297
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    return-object p1

    .line 302
    :cond_a
    new-instance v1, LVa/S8;

    .line 303
    .line 304
    invoke-virtual {p0, p1}, LVa/q8;->f(Ljava/util/List;)LVa/y8;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    const/4 v2, 0x2

    .line 309
    invoke-direct {v1, v0, p1, v2}, LVa/S8;-><init>(LVa/y8;LVa/y8;I)V

    .line 310
    .line 311
    .line 312
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    return-object p1

    .line 317
    :cond_b
    return-object v0
.end method

.method public final g(Ljava/util/List;)LVa/y8;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget v0, LVa/q8;->i:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x59

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/q8;->h:I

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p1}, LVa/q8;->f(Ljava/util/List;)LVa/y8;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual/range {p0 .. p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_e

    .line 20
    .line 21
    invoke-virtual/range {p0 .. p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/16 v4, 0x3c

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x5

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v9, 0x2

    .line 40
    const-string v10, ""

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    if-eq v3, v4, :cond_5

    .line 44
    .line 45
    const/16 v4, 0x3e

    .line 46
    .line 47
    const-wide/16 v12, 0x0

    .line 48
    .line 49
    if-eq v3, v4, :cond_4

    .line 50
    .line 51
    const/16 v4, 0x43c

    .line 52
    .line 53
    if-eq v3, v4, :cond_3

    .line 54
    .line 55
    const/16 v4, 0x781

    .line 56
    .line 57
    if-eq v3, v4, :cond_2

    .line 58
    .line 59
    const/16 v4, 0x7a0

    .line 60
    .line 61
    if-eq v3, v4, :cond_1

    .line 62
    .line 63
    const/16 v4, 0x7bf

    .line 64
    .line 65
    if-eq v3, v4, :cond_0

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_0
    invoke-static {v11}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-char v3, v3

    .line 74
    invoke-static {v10, v11, v11}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    add-int/lit16 v4, v4, 0x309

    .line 79
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    shr-int/lit8 v10, v10, 0x10

    .line 85
    .line 86
    rsub-int/lit8 v10, v10, 0x2

    .line 87
    .line 88
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    move v11, v6

    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_1
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    int-to-char v3, v3

    .line 110
    invoke-static {v10, v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    add-int/lit16 v4, v4, 0x301

    .line 115
    .line 116
    invoke-static {v10}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    add-int/2addr v10, v7

    .line 121
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    sget v2, LVa/q8;->i:I

    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x2f

    .line 138
    .line 139
    rem-int/lit16 v2, v2, 0x80

    .line 140
    .line 141
    sput v2, LVa/q8;->h:I

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    :cond_2
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    int-to-byte v3, v3

    .line 150
    add-int/2addr v3, v8

    .line 151
    int-to-char v3, v3

    .line 152
    invoke-static {v11, v11, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    rsub-int v4, v4, 0x307

    .line 157
    .line 158
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    cmp-long v10, v10, v12

    .line 163
    .line 164
    add-int/2addr v10, v8

    .line 165
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_6

    .line 178
    .line 179
    sget v2, LVa/q8;->i:I

    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x61

    .line 182
    .line 183
    rem-int/lit16 v2, v2, 0x80

    .line 184
    .line 185
    sput v2, LVa/q8;->h:I

    .line 186
    .line 187
    move v11, v5

    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_3
    invoke-static {v11}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v3

    .line 194
    cmp-long v3, v3, v12

    .line 195
    .line 196
    add-int/lit16 v3, v3, 0x6be4

    .line 197
    .line 198
    int-to-char v3, v3

    .line 199
    invoke-static {v11, v11}, Landroid/view/View;->resolveSize(II)I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    add-int/lit16 v4, v4, 0x303

    .line 204
    .line 205
    invoke-static {v11}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    rsub-int/lit8 v10, v10, 0x2

    .line 210
    .line 211
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_6

    .line 224
    .line 225
    move v11, v8

    .line 226
    goto :goto_1

    .line 227
    :cond_4
    invoke-static {v10, v11}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    int-to-char v3, v3

    .line 232
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 233
    .line 234
    .line 235
    move-result-wide v10

    .line 236
    const-wide/16 v14, -0x1

    .line 237
    .line 238
    cmp-long v4, v10, v14

    .line 239
    .line 240
    rsub-int v4, v4, 0x307

    .line 241
    .line 242
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 243
    .line 244
    .line 245
    move-result-wide v10

    .line 246
    cmp-long v10, v10, v12

    .line 247
    .line 248
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_6

    .line 261
    .line 262
    move v11, v7

    .line 263
    goto :goto_1

    .line 264
    :cond_5
    invoke-static {v10, v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    int-to-char v3, v3

    .line 269
    invoke-static {v11, v11, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    rsub-int v4, v4, 0x305

    .line 274
    .line 275
    invoke-static {v10}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    neg-int v10, v10

    .line 280
    invoke-static {v4, v10, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_6

    .line 293
    .line 294
    sget v2, LVa/q8;->h:I

    .line 295
    .line 296
    add-int/lit8 v2, v2, 0x31

    .line 297
    .line 298
    rem-int/lit16 v2, v2, 0x80

    .line 299
    .line 300
    sput v2, LVa/q8;->i:I

    .line 301
    .line 302
    move v11, v9

    .line 303
    goto :goto_1

    .line 304
    :cond_6
    :goto_0
    const/4 v11, -0x1

    .line 305
    :goto_1
    if-eqz v11, :cond_d

    .line 306
    .line 307
    if-eq v11, v8, :cond_c

    .line 308
    .line 309
    if-eq v11, v9, :cond_b

    .line 310
    .line 311
    if-eq v11, v7, :cond_9

    .line 312
    .line 313
    if-eq v11, v5, :cond_8

    .line 314
    .line 315
    if-eq v11, v6, :cond_7

    .line 316
    .line 317
    iget v2, v1, LVa/q8;->a:I

    .line 318
    .line 319
    sub-int/2addr v2, v8

    .line 320
    iput v2, v1, LVa/q8;->a:I

    .line 321
    .line 322
    return-object v0

    .line 323
    :cond_7
    new-instance v2, LVa/P8;

    .line 324
    .line 325
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    const/4 v4, 0x0

    .line 330
    invoke-direct {v2, v0, v3, v4}, LVa/P8;-><init>(LVa/y8;LVa/y8;I)V

    .line 331
    .line 332
    .line 333
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :cond_8
    new-instance v2, LVa/P8;

    .line 339
    .line 340
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    const/4 v4, 0x3

    .line 345
    invoke-direct {v2, v0, v3, v4}, LVa/P8;-><init>(LVa/y8;LVa/y8;I)V

    .line 346
    .line 347
    .line 348
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0

    .line 353
    :cond_9
    new-instance v2, LVa/P8;

    .line 354
    .line 355
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    const/4 v4, 0x2

    .line 360
    invoke-direct {v2, v0, v3, v4}, LVa/P8;-><init>(LVa/y8;LVa/y8;I)V

    .line 361
    .line 362
    .line 363
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sget v2, LVa/q8;->h:I

    .line 368
    .line 369
    add-int/lit8 v2, v2, 0x19

    .line 370
    .line 371
    rem-int/lit16 v3, v2, 0x80

    .line 372
    .line 373
    sput v3, LVa/q8;->i:I

    .line 374
    .line 375
    rem-int/2addr v2, v9

    .line 376
    if-eqz v2, :cond_a

    .line 377
    .line 378
    return-object v0

    .line 379
    :cond_a
    const/4 v0, 0x0

    .line 380
    throw v0

    .line 381
    :cond_b
    new-instance v2, LVa/P8;

    .line 382
    .line 383
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    const/4 v4, 0x1

    .line 388
    invoke-direct {v2, v0, v3, v4}, LVa/P8;-><init>(LVa/y8;LVa/y8;I)V

    .line 389
    .line 390
    .line 391
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    return-object v0

    .line 396
    :cond_c
    new-instance v2, LVa/Q8;

    .line 397
    .line 398
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    const/4 v4, 0x1

    .line 403
    invoke-direct {v2, v0, v3, v4}, LVa/Q8;-><init>(LVa/y8;LVa/y8;I)V

    .line 404
    .line 405
    .line 406
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    return-object v0

    .line 411
    :cond_d
    new-instance v2, LVa/Q8;

    .line 412
    .line 413
    :try_start_0
    invoke-virtual/range {p0 .. p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 414
    .line 415
    .line 416
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 417
    const/4 v4, 0x0

    .line 418
    invoke-direct {v2, v0, v3, v4}, LVa/Q8;-><init>(LVa/y8;LVa/y8;I)V

    .line 419
    .line 420
    .line 421
    invoke-static {v2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    return-object v0

    .line 426
    :catchall_0
    move-exception v0

    .line 427
    throw v0

    .line 428
    :cond_e
    return-object v0
.end method

.method public final h(Ljava/util/ArrayList;)LVa/V8;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-byte v1, p0, LVa/q8;->c:B

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    int-to-byte v1, v1

    .line 11
    iput-byte v1, p0, LVa/q8;->c:B

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget v3, LVa/q8;->h:I

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x41

    .line 20
    .line 21
    rem-int/lit16 v3, v3, 0x80

    .line 22
    .line 23
    sput v3, LVa/q8;->i:I

    .line 24
    .line 25
    :goto_0
    const-string v3, ""

    .line 26
    .line 27
    const/16 v4, 0x30

    .line 28
    .line 29
    invoke-static {v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-int/lit16 v4, v4, 0x6ee8

    .line 34
    .line 35
    int-to-char v4, v4

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    shr-int/lit8 v5, v5, 0x18

    .line 41
    .line 42
    add-int/lit16 v5, v5, 0x2fc

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static {v3, v6, v6}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    rsub-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    invoke-static {v5, v3, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v2, v3}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    iget p1, p0, LVa/q8;->a:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    iput p1, p0, LVa/q8;->a:I

    .line 70
    .line 71
    iget p1, p0, LVa/q8;->b:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    iput p1, p0, LVa/q8;->b:I

    .line 76
    .line 77
    iget-byte p1, p0, LVa/q8;->c:B

    .line 78
    .line 79
    add-int/lit8 p1, p1, -0x1

    .line 80
    .line 81
    int-to-byte p1, p1

    .line 82
    iput-byte p1, p0, LVa/q8;->c:B

    .line 83
    .line 84
    new-instance p1, LVa/V8;

    .line 85
    .line 86
    invoke-direct {p1, v0, v1}, LVa/V8;-><init>(Ljava/util/ArrayList;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, LVa/V8;

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_0
    sget v2, LVa/q8;->h:I

    .line 97
    .line 98
    add-int/lit8 v2, v2, 0xd

    .line 99
    .line 100
    rem-int/lit16 v3, v2, 0x80

    .line 101
    .line 102
    sput v3, LVa/q8;->i:I

    .line 103
    .line 104
    rem-int/lit8 v2, v2, 0x2

    .line 105
    .line 106
    if-nez v2, :cond_1

    .line 107
    .line 108
    iget v2, p0, LVa/q8;->b:I

    .line 109
    .line 110
    add-int/lit8 v2, v2, -0x1

    .line 111
    .line 112
    :goto_1
    iput v2, p0, LVa/q8;->b:I

    .line 113
    .line 114
    invoke-virtual {p0, p1}, LVa/q8;->x(Ljava/util/ArrayList;)LVa/c9;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    goto :goto_0

    .line 126
    :cond_1
    iget v2, p0, LVa/q8;->b:I

    .line 127
    .line 128
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    goto :goto_1
.end method

.method public final i(Ljava/util/List;)LVa/y8;
    .locals 9

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->i:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LVa/q8;->e(Ljava/util/List;)LVa/y8;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x2b

    .line 23
    .line 24
    div-int/2addr v4, v2

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, LVa/q8;->e(Ljava/util/List;)LVa/y8;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_a

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, LVa/v8;->f()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/16 v5, 0x25

    .line 52
    .line 53
    const-string v6, ""

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    if-eq v4, v5, :cond_5

    .line 57
    .line 58
    const/16 v5, 0x2a

    .line 59
    .line 60
    if-eq v4, v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x2f

    .line 63
    .line 64
    if-eq v4, v5, :cond_2

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_2
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/lit16 v4, v4, 0x72e6

    .line 73
    .line 74
    int-to-char v4, v4

    .line 75
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    add-int/lit16 v5, v5, 0x312

    .line 80
    .line 81
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/4 v8, 0x0

    .line 86
    cmpl-float v6, v6, v8

    .line 87
    .line 88
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    sget v3, LVa/q8;->i:I

    .line 103
    .line 104
    add-int/lit8 v3, v3, 0xb

    .line 105
    .line 106
    rem-int/lit16 v4, v3, 0x80

    .line 107
    .line 108
    sput v4, LVa/q8;->h:I

    .line 109
    .line 110
    rem-int/2addr v3, v1

    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    move v2, v7

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    shr-int/lit8 v4, v4, 0x8

    .line 121
    .line 122
    const v5, 0xf67c

    .line 123
    .line 124
    .line 125
    add-int/2addr v4, v5

    .line 126
    int-to-char v4, v4

    .line 127
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    rsub-int v5, v5, 0x311

    .line 132
    .line 133
    const/16 v8, 0x30

    .line 134
    .line 135
    invoke-static {v6, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    neg-int v6, v6

    .line 140
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    const v4, 0xe741

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    sub-int/2addr v4, v2

    .line 163
    int-to-char v2, v4

    .line 164
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    shr-int/lit8 v4, v4, 0x10

    .line 169
    .line 170
    add-int/lit16 v4, v4, 0x313

    .line 171
    .line 172
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    shr-int/lit8 v5, v5, 0x16

    .line 177
    .line 178
    rsub-int/lit8 v5, v5, 0x1

    .line 179
    .line 180
    invoke-static {v4, v5, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    xor-int/2addr v2, v7

    .line 193
    if-eq v2, v7, :cond_6

    .line 194
    .line 195
    move v2, v1

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    :goto_1
    const/4 v2, -0x1

    .line 198
    :goto_2
    if-eqz v2, :cond_9

    .line 199
    .line 200
    if-eq v2, v7, :cond_8

    .line 201
    .line 202
    if-eq v2, v1, :cond_7

    .line 203
    .line 204
    iget p1, p0, LVa/q8;->a:I

    .line 205
    .line 206
    sub-int/2addr p1, v7

    .line 207
    iput p1, p0, LVa/q8;->a:I

    .line 208
    .line 209
    return-object v0

    .line 210
    :cond_7
    new-instance v1, LVa/R8;

    .line 211
    .line 212
    invoke-virtual {p0, p1}, LVa/q8;->i(Ljava/util/List;)LVa/y8;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const/4 v2, 0x3

    .line 217
    invoke-direct {v1, v0, p1, v2}, LVa/R8;-><init>(LVa/y8;LVa/y8;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    return-object p1

    .line 225
    :cond_8
    new-instance v1, LVa/R8;

    .line 226
    .line 227
    invoke-virtual {p0, p1}, LVa/q8;->i(Ljava/util/List;)LVa/y8;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const/4 v2, 0x2

    .line 232
    invoke-direct {v1, v0, p1, v2}, LVa/R8;-><init>(LVa/y8;LVa/y8;I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    return-object p1

    .line 240
    :cond_9
    new-instance v1, LVa/R8;

    .line 241
    .line 242
    invoke-virtual {p0, p1}, LVa/q8;->i(Ljava/util/List;)LVa/y8;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    const/4 v2, 0x1

    .line 247
    invoke-direct {v1, v0, p1, v2}, LVa/R8;-><init>(LVa/y8;LVa/y8;I)V

    .line 248
    .line 249
    .line 250
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1

    .line 255
    :cond_a
    return-object v0
.end method

.method public final k(Ljava/util/ArrayList;)LVa/V8;
    .locals 7

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->h:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, LVa/q8;->a:I

    .line 11
    .line 12
    iput-byte v0, p0, LVa/q8;->c:B

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    invoke-static {v1, v0}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-char v2, v2

    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    cmp-long v3, v3, v5

    .line 28
    .line 29
    rsub-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    shr-int/lit8 v4, v4, 0x10

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    invoke-static {v3, v4, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    shr-int/lit8 v3, v3, 0x10

    .line 52
    .line 53
    int-to-char v3, v3

    .line 54
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    rsub-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    rsub-int/lit8 v1, v1, 0x29

    .line 65
    .line 66
    invoke-static {v4, v1, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p0, p1, v2, v1}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, LVa/q8;->h(Ljava/util/ArrayList;)LVa/V8;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget v1, LVa/q8;->i:I

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x11

    .line 84
    .line 85
    rem-int/lit16 v2, v1, 0x80

    .line 86
    .line 87
    sput v2, LVa/q8;->h:I

    .line 88
    .line 89
    rem-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    const/16 v1, 0x16

    .line 94
    .line 95
    div-int/2addr v1, v0

    .line 96
    :cond_0
    return-object p1
.end method

.method public final m(Ljava/util/List;Ljava/lang/String;LVa/p8;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p2}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget v1, p0, LVa/q8;->a:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    iput v1, p0, LVa/q8;->a:I

    .line 22
    .line 23
    invoke-interface {p3, p1}, LVa/p8;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    const-string v2, ""

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static {v2, v2, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    add-int/lit16 v4, v4, 0x76ac

    .line 42
    .line 43
    int-to-char v4, v4

    .line 44
    invoke-static {v3, v3}, Landroid/view/View;->getDefaultSize(II)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    rsub-int v5, v5, 0x450

    .line 49
    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    rsub-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v1, v4}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    sget v1, LVa/q8;->i:I

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x57

    .line 75
    .line 76
    rem-int/lit16 v1, v1, 0x80

    .line 77
    .line 78
    sput v1, LVa/q8;->h:I

    .line 79
    .line 80
    invoke-interface {p3, p1}, LVa/p8;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const/16 p3, 0x30

    .line 98
    .line 99
    invoke-static {v2, p3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    rsub-int/lit8 v4, v4, -0x1

    .line 104
    .line 105
    int-to-char v4, v4

    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    shr-int/lit8 v5, v5, 0x10

    .line 111
    .line 112
    rsub-int v5, v5, 0x451

    .line 113
    .line 114
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    add-int/lit8 v3, v3, 0x16

    .line 119
    .line 120
    invoke-static {v5, v3, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const v3, 0x8605

    .line 135
    .line 136
    .line 137
    invoke-static {v2, p3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    add-int/2addr v4, v3

    .line 142
    int-to-char v3, v4

    .line 143
    invoke-static {v2, p3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    add-int/lit16 p3, p3, 0x468

    .line 148
    .line 149
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    const-wide/16 v6, -0x1

    .line 154
    .line 155
    cmp-long v2, v4, v6

    .line 156
    .line 157
    invoke-static {p3, v2, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p0, v1, p2, v0, p1}, LVa/q8;->y(LVa/v8;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sget p1, LVa/q8;->i:I

    .line 176
    .line 177
    add-int/lit8 p1, p1, 0x3d

    .line 178
    .line 179
    rem-int/lit16 p1, p1, 0x80

    .line 180
    .line 181
    sput p1, LVa/q8;->h:I

    .line 182
    .line 183
    return-object v0
.end method

.method public final n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->i:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/q8;->y(LVa/v8;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/q8;->i:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x45

    .line 19
    .line 20
    rem-int/lit16 p2, p1, 0x80

    .line 21
    .line 22
    sput p2, LVa/q8;->h:I

    .line 23
    .line 24
    rem-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    throw p1
.end method

.method public final o(LVa/v8;Ljava/util/List;)LVa/y8;
    .locals 8

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0x68b6f7b

    .line 12
    .line 13
    .line 14
    const v2, 0x33c587

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, -0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, LVa/v8;->f()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/16 v7, 0x46

    .line 31
    .line 32
    div-int/2addr v7, v5

    .line 33
    if-eq v6, v2, :cond_2

    .line 34
    .line 35
    if-eq v6, v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p1}, LVa/v8;->f()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eq v6, v2, :cond_2

    .line 47
    .line 48
    if-eq v6, v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v5}, Landroid/os/Process;->getThreadPriority(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/lit8 v1, v1, 0x14

    .line 56
    .line 57
    shr-int/lit8 v1, v1, 0x6

    .line 58
    .line 59
    rsub-int v1, v1, 0x3ec2

    .line 60
    .line 61
    int-to-char v1, v1

    .line 62
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/lit16 v2, v2, 0x3d3

    .line 67
    .line 68
    const-string v6, ""

    .line 69
    .line 70
    const-string v7, ""

    .line 71
    .line 72
    invoke-static {v6, v7, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    add-int/lit8 v6, v6, 0x5

    .line 77
    .line 78
    invoke-static {v2, v6, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    move v4, v3

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    shr-int/lit8 v1, v1, 0x10

    .line 99
    .line 100
    const v2, 0xe842

    .line 101
    .line 102
    .line 103
    add-int/2addr v1, v2

    .line 104
    int-to-char v1, v1

    .line 105
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const/4 v6, 0x0

    .line 110
    cmpl-float v2, v2, v6

    .line 111
    .line 112
    add-int/lit16 v2, v2, 0x3cf

    .line 113
    .line 114
    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    add-int/lit8 v6, v6, 0x4

    .line 119
    .line 120
    invoke-static {v2, v6, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    sget v0, LVa/q8;->i:I

    .line 135
    .line 136
    add-int/lit8 v0, v0, 0x63

    .line 137
    .line 138
    rem-int/lit16 v0, v0, 0x80

    .line 139
    .line 140
    sput v0, LVa/q8;->h:I

    .line 141
    .line 142
    move v4, v5

    .line 143
    :cond_3
    :goto_0
    if-eqz v4, :cond_5

    .line 144
    .line 145
    if-eq v4, v3, :cond_4

    .line 146
    .line 147
    const/4 p1, 0x0

    .line 148
    return-object p1

    .line 149
    :cond_4
    const v0, 0xafd0

    .line 150
    .line 151
    .line 152
    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    sub-int/2addr v0, v1

    .line 157
    int-to-char v0, v0

    .line 158
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    shr-int/lit8 v1, v1, 0x10

    .line 163
    .line 164
    rsub-int v1, v1, 0x314

    .line 165
    .line 166
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    shr-int/lit8 v2, v2, 0x10

    .line 171
    .line 172
    sub-int/2addr v3, v2

    .line 173
    invoke-static {v1, v3, v0}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const-string v1, ""

    .line 182
    .line 183
    invoke-static {v1, v5}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    rsub-int v1, v1, 0x4b42

    .line 188
    .line 189
    int-to-char v1, v1

    .line 190
    invoke-static {v5}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v2

    .line 194
    const-wide/16 v6, 0x0

    .line 195
    .line 196
    cmp-long v2, v2, v6

    .line 197
    .line 198
    rsub-int v2, v2, 0x3d8

    .line 199
    .line 200
    const-string v3, ""

    .line 201
    .line 202
    invoke-static {v3, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    rsub-int/lit8 v3, v3, 0x2f

    .line 207
    .line 208
    invoke-static {v2, v3, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {p0, p2, v0, p1, v1}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    new-instance p1, LVa/J8;

    .line 220
    .line 221
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    shr-int/lit8 v0, v0, 0x8

    .line 226
    .line 227
    rsub-int v0, v0, 0x3ec2

    .line 228
    .line 229
    int-to-char v0, v0

    .line 230
    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    add-int/lit16 v1, v1, 0x3d3

    .line 235
    .line 236
    const-string v2, ""

    .line 237
    .line 238
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    rsub-int/lit8 v2, v2, 0x4

    .line 243
    .line 244
    invoke-static {v1, v2, v0}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-direct {p1, v0}, LVa/J8;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-static {p1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p0, p1, p2}, LVa/q8;->v(LVa/y8;Ljava/util/List;)LVa/y8;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    return-object p1

    .line 264
    :cond_5
    sget-object p1, LVa/T8;->d:LVa/T8;

    .line 265
    .line 266
    const-class p1, LVa/T8;

    .line 267
    .line 268
    monitor-enter p1

    .line 269
    :try_start_0
    sget p2, LVa/T8;->e:I

    .line 270
    .line 271
    add-int/lit8 p2, p2, 0x65

    .line 272
    .line 273
    rem-int/lit16 p2, p2, 0x80

    .line 274
    .line 275
    sput p2, LVa/T8;->f:I

    .line 276
    .line 277
    add-int/lit8 p2, p2, 0xf

    .line 278
    .line 279
    rem-int/lit16 p2, p2, 0x80

    .line 280
    .line 281
    sput p2, LVa/T8;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    .line 283
    monitor-exit p1

    .line 284
    sget-object p1, LVa/T8;->d:LVa/T8;

    .line 285
    .line 286
    return-object p1

    .line 287
    :catchall_0
    move-exception p2

    .line 288
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    throw p2
.end method

.method public final q(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->i:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    new-instance v0, LVa/w8;

    .line 2
    .line 3
    iget v1, p0, LVa/q8;->b:I

    .line 4
    .line 5
    invoke-direct {v0, v1, p2, p1}, LVa/w8;-><init>(ILjava/lang/Exception;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final s(Ljava/util/List;)LVa/y8;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, LVa/q8;->g(Ljava/util/List;)LVa/y8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    sget v1, LVa/q8;->h:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x73

    .line 14
    .line 15
    rem-int/lit16 v2, v1, 0x80

    .line 16
    .line 17
    sput v2, LVa/q8;->i:I

    .line 18
    .line 19
    rem-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, LVa/v8;->f()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/16 v3, 0x4c0

    .line 36
    .line 37
    const/4 v4, -0x1

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    if-eq v2, v3, :cond_1

    .line 41
    .line 42
    const/16 v3, 0xf80

    .line 43
    .line 44
    if-eq v2, v3, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/lit8 v2, v2, 0x14

    .line 52
    .line 53
    shr-int/lit8 v2, v2, 0x6

    .line 54
    .line 55
    rsub-int v2, v2, 0x17ca

    .line 56
    .line 57
    int-to-char v2, v2

    .line 58
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    rsub-int v3, v3, 0x2ff

    .line 63
    .line 64
    const-string v6, ""

    .line 65
    .line 66
    invoke-static {v6}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    rsub-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    invoke-static {v3, v6, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    move v4, v5

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    shr-int/lit8 v2, v2, 0x18

    .line 93
    .line 94
    const v3, 0x8c0a

    .line 95
    .line 96
    .line 97
    sub-int/2addr v3, v2

    .line 98
    int-to-char v2, v3

    .line 99
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    const/4 v7, 0x0

    .line 104
    cmpl-float v3, v3, v7

    .line 105
    .line 106
    rsub-int v3, v3, 0x2fe

    .line 107
    .line 108
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    cmpl-float v7, v8, v7

    .line 113
    .line 114
    rsub-int/lit8 v7, v7, 0x2

    .line 115
    .line 116
    invoke-static {v3, v7, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_2

    .line 129
    .line 130
    sget v1, LVa/q8;->h:I

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x41

    .line 133
    .line 134
    rem-int/lit16 v1, v1, 0x80

    .line 135
    .line 136
    sput v1, LVa/q8;->i:I

    .line 137
    .line 138
    move v4, v6

    .line 139
    :cond_2
    :goto_0
    if-eqz v4, :cond_4

    .line 140
    .line 141
    if-eq v4, v5, :cond_3

    .line 142
    .line 143
    iget p1, p0, LVa/q8;->a:I

    .line 144
    .line 145
    sub-int/2addr p1, v5

    .line 146
    iput p1, p0, LVa/q8;->a:I

    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_3
    new-instance v1, LVa/S8;

    .line 150
    .line 151
    invoke-virtual {p0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const/4 v2, 0x0

    .line 156
    invoke-direct {v1, v0, p1, v2}, LVa/S8;-><init>(LVa/y8;LVa/y8;I)V

    .line 157
    .line 158
    .line 159
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :cond_4
    new-instance v1, LVa/S8;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    const/4 v2, 0x1

    .line 171
    invoke-direct {v1, v0, p1, v2}, LVa/S8;-><init>(LVa/y8;LVa/y8;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :cond_5
    invoke-virtual {p0, p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, LVa/v8;->f()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x0

    .line 191
    throw p1

    .line 192
    :cond_6
    return-object v0
.end method

.method public final u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, v1, p3}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/16 p1, 0x20

    .line 18
    .line 19
    div-int/lit8 p1, p1, 0x0

    .line 20
    .line 21
    :cond_0
    sget p1, LVa/q8;->h:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x55

    .line 24
    .line 25
    rem-int/lit16 p2, p1, 0x80

    .line 26
    .line 27
    sput p2, LVa/q8;->i:I

    .line 28
    .line 29
    rem-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    throw v1
.end method

.method public final v(LVa/y8;Ljava/util/List;)LVa/y8;
    .locals 11

    .line 1
    sget v0, LVa/q8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->i:I

    .line 8
    .line 9
    invoke-virtual {p0, p2}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LVa/v8;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, LVa/v8;->f()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, p2}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v4, ""

    .line 30
    .line 31
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    rsub-int/lit8 v5, v5, -0x1

    .line 36
    .line 37
    int-to-char v5, v5

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-static {v6, v6}, Landroid/graphics/PointF;->length(FF)F

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    cmpl-float v7, v7, v6

    .line 44
    .line 45
    add-int/lit16 v7, v7, 0x305

    .line 46
    .line 47
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    add-int/lit8 v8, v8, 0x1

    .line 52
    .line 53
    invoke-static {v7, v8, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v1, v5}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    sget v1, LVa/q8;->h:I

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x11

    .line 70
    .line 71
    rem-int/lit16 v1, v1, 0x80

    .line 72
    .line 73
    sput v1, LVa/q8;->i:I

    .line 74
    .line 75
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    shr-int/lit8 v1, v1, 0x10

    .line 80
    .line 81
    int-to-char v1, v1

    .line 82
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    const-wide/16 v9, -0x1

    .line 87
    .line 88
    cmp-long v2, v7, v9

    .line 89
    .line 90
    rsub-int v2, v2, 0x307

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    shr-int/lit8 v5, v5, 0x16

    .line 97
    .line 98
    rsub-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    invoke-static {v2, v5, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v2, LVa/o8;

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-direct {v2, v5}, LVa/o8;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object p0, v2, LVa/o8;->b:LVa/q8;

    .line 115
    .line 116
    invoke-virtual {p0, p2, v1, v2}, LVa/q8;->m(Ljava/util/List;Ljava/lang/String;LVa/p8;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget v1, LVa/q8;->h:I

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x17

    .line 123
    .line 124
    rem-int/lit16 v5, v1, 0x80

    .line 125
    .line 126
    sput v5, LVa/q8;->i:I

    .line 127
    .line 128
    rem-int/lit8 v1, v1, 0x2

    .line 129
    .line 130
    if-nez v1, :cond_0

    .line 131
    .line 132
    const/16 v1, 0x59

    .line 133
    .line 134
    div-int/2addr v1, v3

    .line 135
    :cond_0
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    int-to-char v1, v1

    .line 140
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    add-int/lit8 v5, v5, 0x6e

    .line 145
    .line 146
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v7

    .line 150
    const-wide/16 v9, 0x0

    .line 151
    .line 152
    cmp-long v7, v7, v9

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    invoke-static {v5, v7, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v4, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    add-int/lit16 v5, v5, 0x29cd

    .line 169
    .line 170
    int-to-char v5, v5

    .line 171
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 172
    .line 173
    .line 174
    move-result-wide v7

    .line 175
    cmp-long v7, v7, v9

    .line 176
    .line 177
    rsub-int v7, v7, 0x36e

    .line 178
    .line 179
    invoke-static {v4, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    rsub-int/lit8 v8, v8, 0x3f

    .line 184
    .line 185
    invoke-static {v7, v8, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {p0, p2, v1, v2, v5}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_1
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    int-to-char v5, v5

    .line 202
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    cmpl-float v7, v7, v6

    .line 207
    .line 208
    rsub-int/lit8 v7, v7, 0x6e

    .line 209
    .line 210
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    add-int/lit8 v8, v8, 0x1

    .line 215
    .line 216
    invoke-static {v7, v8, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v1, v5}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_2

    .line 229
    .line 230
    iget p2, p0, LVa/q8;->a:I

    .line 231
    .line 232
    add-int/lit8 p2, p2, -0x1

    .line 233
    .line 234
    iput p2, p0, LVa/q8;->a:I

    .line 235
    .line 236
    new-instance p2, LVa/D8;

    .line 237
    .line 238
    invoke-direct {p2, p1, v0}, LVa/D8;-><init>(LVa/y8;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-static {p2}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    return-object p1

    .line 246
    :cond_2
    :goto_0
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    cmpl-float v1, v1, v6

    .line 251
    .line 252
    add-int/lit8 v1, v1, -0x1

    .line 253
    .line 254
    int-to-char v1, v1

    .line 255
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    rsub-int v5, v5, 0x97

    .line 260
    .line 261
    invoke-static {v4, v4, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    add-int/lit8 v3, v3, 0x1

    .line 266
    .line 267
    invoke-static {v5, v3, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {p0, v1, p2}, LVa/q8;->z(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    new-instance v1, LVa/E8;

    .line 280
    .line 281
    invoke-direct {v1, p1, v0, v2, p2}, LVa/E8;-><init>(LVa/y8;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v1}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    return-object p1

    .line 289
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 295
    .line 296
    .line 297
    move-result p2

    .line 298
    rsub-int/lit8 p2, p2, -0x1

    .line 299
    .line 300
    int-to-char p2, p2

    .line 301
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    add-int/lit16 v1, v1, 0x351

    .line 306
    .line 307
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    rsub-int/lit8 v3, v3, 0x1c

    .line 312
    .line 313
    invoke-static {v1, v3, p2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p2

    .line 317
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-virtual {p0, p1, v2}, LVa/q8;->r(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 332
    .line 333
    .line 334
    throw v2
.end method

.method public final w(Ljava/lang/String;Ljava/util/ArrayList;)LVa/y8;
    .locals 6

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q8;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    div-int/2addr v2, v2

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0, p2}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0, p2}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    shr-int/lit8 v2, v2, 0x10

    .line 51
    .line 52
    add-int/lit16 v2, v2, 0x7123

    .line 53
    .line 54
    int-to-char v2, v2

    .line 55
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    shr-int/lit8 v3, v3, 0x10

    .line 60
    .line 61
    add-int/lit16 v3, v3, 0x112

    .line 62
    .line 63
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpl-float v4, v4, v5

    .line 69
    .line 70
    add-int/lit8 v4, v4, 0x23

    .line 71
    .line 72
    invoke-static {v3, v4, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0, p2, p1, v1, v0}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    sget p1, LVa/q8;->h:I

    .line 94
    .line 95
    add-int/lit8 p1, p1, 0x39

    .line 96
    .line 97
    rem-int/lit16 p1, p1, 0x80

    .line 98
    .line 99
    sput p1, LVa/q8;->i:I

    .line 100
    .line 101
    return-object v1
.end method

.method public final x(Ljava/util/ArrayList;)LVa/c9;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, LVa/v8;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v9, 0x3

    .line 18
    const/4 v10, -0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x2

    .line 21
    const/16 v13, 0x30

    .line 22
    .line 23
    const-wide/16 v14, 0x0

    .line 24
    .line 25
    const/16 v16, 0x4

    .line 26
    .line 27
    const-string v4, ""

    .line 28
    .line 29
    const/16 v17, 0x9

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    const/16 v18, 0x6

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    sparse-switch v3, :sswitch_data_0

    .line 36
    .line 37
    .line 38
    const/16 v20, 0x5

    .line 39
    .line 40
    const/16 v21, 0x8

    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :sswitch_0
    const v3, 0x898b

    .line 45
    .line 46
    .line 47
    invoke-static {v4, v13, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 48
    .line 49
    .line 50
    move-result v19

    .line 51
    add-int v3, v19, v3

    .line 52
    .line 53
    int-to-char v3, v3

    .line 54
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 55
    .line 56
    .line 57
    move-result v19

    .line 58
    const/16 v20, 0x5

    .line 59
    .line 60
    rsub-int/lit8 v7, v19, 0x31

    .line 61
    .line 62
    invoke-static {v4}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v19

    .line 66
    const/16 v21, 0x8

    .line 67
    .line 68
    add-int/lit8 v8, v19, 0x5

    .line 69
    .line 70
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :sswitch_1
    const/16 v20, 0x5

    .line 87
    .line 88
    const/16 v21, 0x8

    .line 89
    .line 90
    const v3, 0xe5c0

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    sub-int/2addr v3, v7

    .line 98
    int-to-char v3, v3

    .line 99
    invoke-static {v6, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    add-int/lit8 v7, v7, 0x3c

    .line 104
    .line 105
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    add-int/lit8 v8, v8, 0x5

    .line 110
    .line 111
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_2

    .line 124
    .line 125
    move/from16 v9, v20

    .line 126
    .line 127
    goto/16 :goto_2

    .line 128
    .line 129
    :sswitch_2
    const/16 v20, 0x5

    .line 130
    .line 131
    const/16 v21, 0x8

    .line 132
    .line 133
    invoke-static {v4, v13, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    add-int/2addr v3, v5

    .line 138
    int-to-char v3, v3

    .line 139
    invoke-static {v6, v6}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    cmp-long v7, v7, v14

    .line 144
    .line 145
    rsub-int/lit8 v7, v7, 0x4b

    .line 146
    .line 147
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    add-int/2addr v8, v9

    .line 152
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_2

    .line 165
    .line 166
    move/from16 v9, v17

    .line 167
    .line 168
    goto/16 :goto_2

    .line 169
    .line 170
    :sswitch_3
    const/16 v20, 0x5

    .line 171
    .line 172
    const/16 v21, 0x8

    .line 173
    .line 174
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 175
    .line 176
    .line 177
    move-result-wide v7

    .line 178
    cmp-long v3, v7, v14

    .line 179
    .line 180
    rsub-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    int-to-char v3, v3

    .line 183
    invoke-static {v6, v6, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    rsub-int/lit8 v7, v7, 0x49

    .line 188
    .line 189
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    shr-int/lit8 v8, v8, 0x8

    .line 194
    .line 195
    add-int/2addr v8, v9

    .line 196
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_2

    .line 209
    .line 210
    sget v2, LVa/q8;->i:I

    .line 211
    .line 212
    add-int/2addr v2, v9

    .line 213
    rem-int/lit16 v3, v2, 0x80

    .line 214
    .line 215
    sput v3, LVa/q8;->h:I

    .line 216
    .line 217
    rem-int/2addr v2, v12

    .line 218
    if-eqz v2, :cond_0

    .line 219
    .line 220
    const/16 v9, 0x37

    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_0
    move/from16 v9, v21

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :sswitch_4
    const/16 v20, 0x5

    .line 229
    .line 230
    const/16 v21, 0x8

    .line 231
    .line 232
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    rsub-int v3, v3, 0x3abd

    .line 237
    .line 238
    int-to-char v3, v3

    .line 239
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    rsub-int/lit8 v7, v7, 0x2e

    .line 244
    .line 245
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    shr-int/lit8 v8, v8, 0x10

    .line 250
    .line 251
    add-int/2addr v8, v9

    .line 252
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-eqz v2, :cond_2

    .line 265
    .line 266
    move v9, v12

    .line 267
    goto/16 :goto_2

    .line 268
    .line 269
    :sswitch_5
    const/16 v20, 0x5

    .line 270
    .line 271
    const/16 v21, 0x8

    .line 272
    .line 273
    const v3, 0xf0b2

    .line 274
    .line 275
    .line 276
    invoke-static {v4, v4, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    add-int/2addr v7, v3

    .line 281
    int-to-char v3, v7

    .line 282
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    rsub-int/lit8 v7, v7, 0x2b

    .line 287
    .line 288
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    add-int/lit8 v8, v8, 0x14

    .line 293
    .line 294
    shr-int/lit8 v8, v8, 0x6

    .line 295
    .line 296
    add-int/2addr v8, v12

    .line 297
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-eqz v2, :cond_2

    .line 310
    .line 311
    sget v2, LVa/q8;->h:I

    .line 312
    .line 313
    add-int/lit8 v2, v2, 0x4f

    .line 314
    .line 315
    rem-int/lit16 v2, v2, 0x80

    .line 316
    .line 317
    sput v2, LVa/q8;->i:I

    .line 318
    .line 319
    :goto_0
    move v9, v5

    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :sswitch_6
    const/16 v20, 0x5

    .line 323
    .line 324
    const/16 v21, 0x8

    .line 325
    .line 326
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    rsub-int/lit8 v3, v3, -0x1

    .line 331
    .line 332
    int-to-char v3, v3

    .line 333
    invoke-static {v4, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 338
    .line 339
    .line 340
    move-result-wide v8

    .line 341
    cmp-long v8, v8, v14

    .line 342
    .line 343
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_2

    .line 356
    .line 357
    sget v2, LVa/q8;->h:I

    .line 358
    .line 359
    add-int/lit8 v2, v2, 0x51

    .line 360
    .line 361
    rem-int/lit16 v2, v2, 0x80

    .line 362
    .line 363
    sput v2, LVa/q8;->i:I

    .line 364
    .line 365
    add-int/lit8 v2, v2, 0x5f

    .line 366
    .line 367
    rem-int/lit16 v2, v2, 0x80

    .line 368
    .line 369
    sput v2, LVa/q8;->h:I

    .line 370
    .line 371
    const/4 v9, 0x7

    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :sswitch_7
    const/16 v20, 0x5

    .line 375
    .line 376
    const/16 v21, 0x8

    .line 377
    .line 378
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    add-int/lit16 v3, v3, 0x536a

    .line 383
    .line 384
    int-to-char v3, v3

    .line 385
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    cmpl-float v7, v7, v11

    .line 390
    .line 391
    rsub-int/lit8 v7, v7, 0x2c

    .line 392
    .line 393
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    shr-int/lit8 v8, v8, 0x16

    .line 398
    .line 399
    add-int/2addr v8, v5

    .line 400
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_2

    .line 413
    .line 414
    sget v2, LVa/q8;->h:I

    .line 415
    .line 416
    add-int/lit8 v2, v2, 0x6b

    .line 417
    .line 418
    rem-int/lit16 v3, v2, 0x80

    .line 419
    .line 420
    sput v3, LVa/q8;->i:I

    .line 421
    .line 422
    rem-int/2addr v2, v12

    .line 423
    if-nez v2, :cond_1

    .line 424
    .line 425
    goto :goto_0

    .line 426
    :cond_1
    move v9, v6

    .line 427
    goto :goto_2

    .line 428
    :sswitch_8
    const/16 v20, 0x5

    .line 429
    .line 430
    const/16 v21, 0x8

    .line 431
    .line 432
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    shr-int/lit8 v3, v3, 0x10

    .line 437
    .line 438
    int-to-char v3, v3

    .line 439
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    add-int/lit8 v7, v7, 0x41

    .line 444
    .line 445
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    add-int/lit8 v8, v8, 0x8

    .line 450
    .line 451
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_2

    .line 464
    .line 465
    move/from16 v9, v18

    .line 466
    .line 467
    goto :goto_2

    .line 468
    :sswitch_9
    const/16 v20, 0x5

    .line 469
    .line 470
    const/16 v21, 0x8

    .line 471
    .line 472
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    shr-int/lit8 v3, v3, 0x10

    .line 477
    .line 478
    const v7, 0xa4a2

    .line 479
    .line 480
    .line 481
    add-int/2addr v3, v7

    .line 482
    int-to-char v3, v3

    .line 483
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    add-int/lit8 v7, v7, 0x36

    .line 488
    .line 489
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    shr-int/lit8 v8, v8, 0x10

    .line 494
    .line 495
    rsub-int/lit8 v8, v8, 0x6

    .line 496
    .line 497
    invoke-static {v7, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_2

    .line 510
    .line 511
    move/from16 v9, v16

    .line 512
    .line 513
    goto :goto_2

    .line 514
    :cond_2
    :goto_1
    move v9, v10

    .line 515
    :goto_2
    const-wide/16 v2, -0x1

    .line 516
    .line 517
    const/4 v7, 0x0

    .line 518
    packed-switch v9, :pswitch_data_0

    .line 519
    .line 520
    .line 521
    iget v2, v0, LVa/q8;->a:I

    .line 522
    .line 523
    sub-int/2addr v2, v5

    .line 524
    iput v2, v0, LVa/q8;->a:I

    .line 525
    .line 526
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    rsub-int v3, v3, 0x536a

    .line 535
    .line 536
    int-to-char v3, v3

    .line 537
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    rsub-int/lit8 v4, v4, 0x2b

    .line 542
    .line 543
    invoke-static {v6, v6}, Landroid/view/View;->getDefaultSize(II)I

    .line 544
    .line 545
    .line 546
    move-result v6

    .line 547
    rsub-int/lit8 v6, v6, 0x1

    .line 548
    .line 549
    invoke-static {v4, v6, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    cmpl-float v4, v4, v11

    .line 562
    .line 563
    sub-int/2addr v5, v4

    .line 564
    int-to-char v4, v5

    .line 565
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 566
    .line 567
    .line 568
    move-result-wide v5

    .line 569
    cmp-long v5, v5, v14

    .line 570
    .line 571
    rsub-int/lit8 v5, v5, 0x50

    .line 572
    .line 573
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    rsub-int/lit8 v6, v6, 0x1e

    .line 578
    .line 579
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-virtual {v0, v1, v3, v2, v4}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    new-instance v1, LVa/a9;

    .line 591
    .line 592
    invoke-direct {v1, v2}, LVa/a9;-><init>(LVa/y8;)V

    .line 593
    .line 594
    .line 595
    invoke-static {v1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    return-object v1

    .line 600
    :pswitch_0
    invoke-static {v11, v11}, Landroid/graphics/PointF;->length(FF)F

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    cmpl-float v2, v2, v11

    .line 605
    .line 606
    rsub-int v2, v2, 0x536a

    .line 607
    .line 608
    int-to-char v2, v2

    .line 609
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    add-int/lit8 v3, v3, 0x2b

    .line 614
    .line 615
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 616
    .line 617
    .line 618
    move-result v4

    .line 619
    shr-int/lit8 v4, v4, 0x8

    .line 620
    .line 621
    sub-int/2addr v5, v4

    .line 622
    invoke-static {v3, v5, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    new-instance v3, LVa/n8;

    .line 631
    .line 632
    const/4 v4, 0x1

    .line 633
    invoke-direct {v3, v4}, LVa/n8;-><init>(I)V

    .line 634
    .line 635
    .line 636
    iput-object v0, v3, LVa/n8;->b:LVa/q8;

    .line 637
    .line 638
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->m(Ljava/util/List;Ljava/lang/String;LVa/p8;)Ljava/util/ArrayList;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    new-instance v2, LVa/e9;

    .line 643
    .line 644
    invoke-direct {v2, v1}, LVa/e9;-><init>(Ljava/util/ArrayList;)V

    .line 645
    .line 646
    .line 647
    invoke-static {v2}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    sget v2, LVa/q8;->h:I

    .line 652
    .line 653
    add-int/lit8 v2, v2, 0x51

    .line 654
    .line 655
    rem-int/lit16 v2, v2, 0x80

    .line 656
    .line 657
    sput v2, LVa/q8;->i:I

    .line 658
    .line 659
    return-object v1

    .line 660
    :pswitch_1
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    int-to-char v2, v2

    .line 665
    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    invoke-static {v6, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    add-int/2addr v8, v5

    .line 674
    invoke-static {v3, v8, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    add-int/lit8 v3, v3, 0x14

    .line 687
    .line 688
    shr-int/lit8 v3, v3, 0x6

    .line 689
    .line 690
    add-int/lit16 v3, v3, 0x1453

    .line 691
    .line 692
    int-to-char v3, v3

    .line 693
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 694
    .line 695
    .line 696
    move-result v8

    .line 697
    rsub-int v8, v8, 0x18f

    .line 698
    .line 699
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 700
    .line 701
    .line 702
    move-result v9

    .line 703
    add-int/lit8 v9, v9, 0x2c

    .line 704
    .line 705
    invoke-static {v8, v9, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {p0 .. p1}, LVa/q8;->h(Ljava/util/ArrayList;)LVa/V8;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const v3, 0xa9b1

    .line 721
    .line 722
    .line 723
    invoke-static {v6, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    add-int/2addr v8, v3

    .line 728
    int-to-char v3, v8

    .line 729
    invoke-static {v4, v4, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    rsub-int v8, v8, 0x1bc

    .line 734
    .line 735
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    rsub-int/lit8 v9, v9, 0x5

    .line 740
    .line 741
    invoke-static {v8, v9, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 750
    .line 751
    .line 752
    move-result-wide v8

    .line 753
    cmp-long v8, v8, v14

    .line 754
    .line 755
    rsub-int/lit8 v8, v8, 0x1

    .line 756
    .line 757
    int-to-char v8, v8

    .line 758
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 759
    .line 760
    .line 761
    move-result v9

    .line 762
    add-int/lit16 v9, v9, 0x1c2

    .line 763
    .line 764
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 765
    .line 766
    .line 767
    move-result v12

    .line 768
    shr-int/lit8 v12, v12, 0x10

    .line 769
    .line 770
    rsub-int/lit8 v12, v12, 0x35

    .line 771
    .line 772
    invoke-static {v9, v12, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v8

    .line 776
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v8

    .line 780
    invoke-virtual {v0, v1, v3, v8}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-static {v13}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    rsub-int/lit8 v3, v3, 0x30

    .line 788
    .line 789
    int-to-char v3, v3

    .line 790
    invoke-static {v6}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 791
    .line 792
    .line 793
    move-result v8

    .line 794
    rsub-int/lit8 v8, v8, 0x6e

    .line 795
    .line 796
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 797
    .line 798
    .line 799
    move-result v9

    .line 800
    shr-int/lit8 v9, v9, 0x8

    .line 801
    .line 802
    add-int/2addr v9, v5

    .line 803
    invoke-static {v8, v9, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-static {v6}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 812
    .line 813
    .line 814
    move-result-wide v8

    .line 815
    cmp-long v8, v8, v14

    .line 816
    .line 817
    rsub-int v8, v8, 0x7a0e

    .line 818
    .line 819
    int-to-char v8, v8

    .line 820
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 821
    .line 822
    .line 823
    move-result-wide v16

    .line 824
    cmp-long v9, v16, v14

    .line 825
    .line 826
    rsub-int v9, v9, 0x1f7

    .line 827
    .line 828
    invoke-static {v4, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 829
    .line 830
    .line 831
    move-result v12

    .line 832
    add-int/lit8 v12, v12, 0x29

    .line 833
    .line 834
    invoke-static {v9, v12, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v8

    .line 838
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    invoke-virtual {v0, v1, v3, v8}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {p0 .. p1}, LVa/q8;->b(Ljava/util/List;)LVa/v8;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    sget-object v8, LVa/u8;->b:LVa/u8;

    .line 850
    .line 851
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 852
    .line 853
    .line 854
    move-result-wide v16

    .line 855
    cmp-long v9, v16, v14

    .line 856
    .line 857
    add-int/2addr v9, v10

    .line 858
    int-to-char v9, v9

    .line 859
    invoke-static {v4, v6}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 860
    .line 861
    .line 862
    move-result v12

    .line 863
    rsub-int v12, v12, 0x21f

    .line 864
    .line 865
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 866
    .line 867
    .line 868
    move-result v16

    .line 869
    shr-int/lit8 v16, v16, 0x10

    .line 870
    .line 871
    move/from16 v18, v10

    .line 872
    .line 873
    add-int/lit8 v10, v16, 0x1b

    .line 874
    .line 875
    invoke-static {v12, v10, v9}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v9

    .line 879
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v9

    .line 883
    sget v10, LVa/q8;->i:I

    .line 884
    .line 885
    add-int/lit8 v10, v10, 0x1b

    .line 886
    .line 887
    rem-int/lit16 v10, v10, 0x80

    .line 888
    .line 889
    sput v10, LVa/q8;->h:I

    .line 890
    .line 891
    invoke-virtual {v3}, LVa/v8;->d()LVa/u8;

    .line 892
    .line 893
    .line 894
    move-result-object v10

    .line 895
    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v10

    .line 899
    if-eqz v10, :cond_3

    .line 900
    .line 901
    new-instance v7, LVa/J8;

    .line 902
    .line 903
    invoke-virtual {v3}, LVa/v8;->f()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-direct {v7, v3}, LVa/J8;-><init>(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    invoke-static {v7}, LVa/q8;->j(LVa/y8;)LVa/y8;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    check-cast v3, LVa/J8;

    .line 915
    .line 916
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 917
    .line 918
    .line 919
    move-result v7

    .line 920
    int-to-byte v7, v7

    .line 921
    add-int/2addr v7, v5

    .line 922
    int-to-char v7, v7

    .line 923
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 924
    .line 925
    .line 926
    move-result-wide v8

    .line 927
    cmp-long v8, v8, v14

    .line 928
    .line 929
    add-int/lit16 v8, v8, 0x96

    .line 930
    .line 931
    invoke-static {v6, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 932
    .line 933
    .line 934
    move-result v9

    .line 935
    add-int/2addr v9, v5

    .line 936
    invoke-static {v8, v9, v7}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v7

    .line 940
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    const v8, 0xbcd3

    .line 945
    .line 946
    .line 947
    invoke-static {v4, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 948
    .line 949
    .line 950
    move-result v9

    .line 951
    add-int/2addr v9, v8

    .line 952
    int-to-char v8, v9

    .line 953
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 954
    .line 955
    .line 956
    move-result v9

    .line 957
    shr-int/lit8 v9, v9, 0x10

    .line 958
    .line 959
    add-int/lit16 v9, v9, 0x23a

    .line 960
    .line 961
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 962
    .line 963
    .line 964
    move-result v10

    .line 965
    shr-int/lit8 v10, v10, 0x10

    .line 966
    .line 967
    add-int/lit8 v10, v10, 0x27

    .line 968
    .line 969
    invoke-static {v9, v10, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v8

    .line 973
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v8

    .line 977
    invoke-virtual {v0, v1, v7, v8}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 981
    .line 982
    .line 983
    move-result v6

    .line 984
    rsub-int/lit8 v10, v6, -0x1

    .line 985
    .line 986
    int-to-char v6, v10

    .line 987
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 988
    .line 989
    .line 990
    move-result-wide v7

    .line 991
    cmp-long v7, v7, v14

    .line 992
    .line 993
    add-int/lit8 v7, v7, -0x1

    .line 994
    .line 995
    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    add-int/2addr v8, v5

    .line 1000
    invoke-static {v7, v8, v6}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v5

    .line 1004
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v5

    .line 1008
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 1009
    .line 1010
    .line 1011
    move-result v6

    .line 1012
    cmpl-float v6, v6, v11

    .line 1013
    .line 1014
    rsub-int v6, v6, 0x2f17

    .line 1015
    .line 1016
    int-to-char v6, v6

    .line 1017
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 1018
    .line 1019
    .line 1020
    move-result v7

    .line 1021
    shr-int/lit8 v7, v7, 0x10

    .line 1022
    .line 1023
    add-int/lit16 v7, v7, 0x261

    .line 1024
    .line 1025
    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    rsub-int/lit8 v4, v4, 0x2e

    .line 1030
    .line 1031
    invoke-static {v7, v4, v6}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v4

    .line 1035
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v4

    .line 1039
    invoke-virtual {v0, v1, v5, v4}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual/range {p0 .. p1}, LVa/q8;->h(Ljava/util/ArrayList;)LVa/V8;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    new-instance v4, LVa/Z8;

    .line 1047
    .line 1048
    invoke-direct {v4, v2, v1, v3}, LVa/Z8;-><init>(LVa/V8;LVa/V8;LVa/J8;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v4}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    sget v2, LVa/q8;->h:I

    .line 1056
    .line 1057
    add-int/lit8 v2, v2, 0x2b

    .line 1058
    .line 1059
    rem-int/lit16 v2, v2, 0x80

    .line 1060
    .line 1061
    sput v2, LVa/q8;->i:I

    .line 1062
    .line 1063
    return-object v1

    .line 1064
    :cond_3
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-virtual {v3}, LVa/v8;->d()LVa/u8;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v3

    .line 1072
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    invoke-static {v2, v1, v3, v9}, LVa/q8;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    invoke-virtual {v0, v1}, LVa/q8;->q(Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    throw v7

    .line 1084
    :pswitch_2
    invoke-virtual/range {p0 .. p1}, LVa/q8;->h(Ljava/util/ArrayList;)LVa/V8;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    return-object v1

    .line 1089
    :pswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 1090
    .line 1091
    .line 1092
    move-result v2

    .line 1093
    shr-int/lit8 v2, v2, 0x10

    .line 1094
    .line 1095
    add-int/lit16 v2, v2, 0x536a

    .line 1096
    .line 1097
    int-to-char v2, v2

    .line 1098
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 1099
    .line 1100
    .line 1101
    move-result v3

    .line 1102
    shr-int/lit8 v3, v3, 0x16

    .line 1103
    .line 1104
    rsub-int/lit8 v3, v3, 0x2b

    .line 1105
    .line 1106
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    sub-int/2addr v5, v4

    .line 1111
    invoke-static {v3, v5, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    shr-int/lit8 v3, v3, 0x16

    .line 1124
    .line 1125
    const v4, 0xe988

    .line 1126
    .line 1127
    .line 1128
    sub-int/2addr v4, v3

    .line 1129
    int-to-char v3, v4

    .line 1130
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 1131
    .line 1132
    .line 1133
    move-result v4

    .line 1134
    shr-int/lit8 v4, v4, 0x16

    .line 1135
    .line 1136
    add-int/lit16 v4, v4, 0x2d6

    .line 1137
    .line 1138
    invoke-static {v13}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 1139
    .line 1140
    .line 1141
    move-result v5

    .line 1142
    add-int/lit8 v5, v5, -0xa

    .line 1143
    .line 1144
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v3

    .line 1148
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v3

    .line 1152
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1153
    .line 1154
    .line 1155
    new-instance v1, LVa/X8;

    .line 1156
    .line 1157
    const/4 v2, 0x0

    .line 1158
    invoke-direct {v1, v2}, LVa/X8;-><init>(I)V

    .line 1159
    .line 1160
    .line 1161
    invoke-static {v1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    sget v2, LVa/q8;->h:I

    .line 1166
    .line 1167
    add-int/lit8 v2, v2, 0x47

    .line 1168
    .line 1169
    rem-int/lit16 v3, v2, 0x80

    .line 1170
    .line 1171
    sput v3, LVa/q8;->i:I

    .line 1172
    .line 1173
    rem-int/2addr v2, v12

    .line 1174
    if-nez v2, :cond_4

    .line 1175
    .line 1176
    const/16 v2, 0x39

    .line 1177
    .line 1178
    div-int/2addr v2, v6

    .line 1179
    :cond_4
    return-object v1

    .line 1180
    :pswitch_4
    invoke-static {v6, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    rsub-int v2, v2, 0x536a

    .line 1185
    .line 1186
    int-to-char v2, v2

    .line 1187
    invoke-static {v4, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 1188
    .line 1189
    .line 1190
    move-result v3

    .line 1191
    rsub-int/lit8 v3, v3, 0x2b

    .line 1192
    .line 1193
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 1194
    .line 1195
    .line 1196
    move-result v8

    .line 1197
    shr-int/lit8 v8, v8, 0x10

    .line 1198
    .line 1199
    add-int/2addr v8, v5

    .line 1200
    invoke-static {v3, v8, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v2

    .line 1204
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v2

    .line 1208
    const v3, 0xf020

    .line 1209
    .line 1210
    .line 1211
    invoke-static {v4, v13, v6, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 1212
    .line 1213
    .line 1214
    move-result v5

    .line 1215
    add-int/2addr v5, v3

    .line 1216
    int-to-char v3, v5

    .line 1217
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    rsub-int v4, v4, 0x2b2

    .line 1222
    .line 1223
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    rsub-int/lit8 v5, v5, 0x23

    .line 1228
    .line 1229
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v3

    .line 1233
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v3

    .line 1237
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1238
    .line 1239
    .line 1240
    new-instance v1, LVa/X8;

    .line 1241
    .line 1242
    const/4 v2, 0x1

    .line 1243
    invoke-direct {v1, v2}, LVa/X8;-><init>(I)V

    .line 1244
    .line 1245
    .line 1246
    invoke-static {v1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    sget v2, LVa/q8;->i:I

    .line 1251
    .line 1252
    add-int/lit8 v2, v2, 0x43

    .line 1253
    .line 1254
    rem-int/lit16 v3, v2, 0x80

    .line 1255
    .line 1256
    sput v3, LVa/q8;->h:I

    .line 1257
    .line 1258
    rem-int/2addr v2, v12

    .line 1259
    if-nez v2, :cond_5

    .line 1260
    .line 1261
    return-object v1

    .line 1262
    :cond_5
    throw v7

    .line 1263
    :pswitch_5
    sget v2, LVa/q8;->i:I

    .line 1264
    .line 1265
    add-int/lit8 v2, v2, 0x3f

    .line 1266
    .line 1267
    rem-int/lit16 v3, v2, 0x80

    .line 1268
    .line 1269
    sput v3, LVa/q8;->h:I

    .line 1270
    .line 1271
    rem-int/2addr v2, v12

    .line 1272
    if-eqz v2, :cond_6

    .line 1273
    .line 1274
    invoke-virtual/range {p0 .. p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v2

    .line 1278
    const-wide/16 v8, 0x1

    .line 1279
    .line 1280
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    mul-int/lit16 v3, v3, 0x430d

    .line 1285
    .line 1286
    int-to-char v3, v3

    .line 1287
    const/16 v8, 0x5a

    .line 1288
    .line 1289
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 1290
    .line 1291
    .line 1292
    move-result v9

    .line 1293
    shr-int/2addr v8, v9

    .line 1294
    const/16 v9, 0x11

    .line 1295
    .line 1296
    invoke-static {v4, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 1297
    .line 1298
    .line 1299
    move-result v9

    .line 1300
    neg-int v9, v9

    .line 1301
    invoke-static {v8, v9, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v3

    .line 1305
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    invoke-virtual {v2, v3}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v2

    .line 1313
    if-eqz v2, :cond_7

    .line 1314
    .line 1315
    goto :goto_3

    .line 1316
    :cond_6
    invoke-virtual/range {p0 .. p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v2

    .line 1320
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 1321
    .line 1322
    .line 1323
    move-result v3

    .line 1324
    rsub-int v3, v3, 0x536a

    .line 1325
    .line 1326
    int-to-char v3, v3

    .line 1327
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 1328
    .line 1329
    .line 1330
    move-result v8

    .line 1331
    rsub-int/lit8 v8, v8, 0x2b

    .line 1332
    .line 1333
    invoke-static {v4, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 1334
    .line 1335
    .line 1336
    move-result v9

    .line 1337
    neg-int v9, v9

    .line 1338
    invoke-static {v8, v9, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v3

    .line 1342
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    invoke-virtual {v2, v3}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    if-eqz v2, :cond_7

    .line 1351
    .line 1352
    :goto_3
    new-instance v2, LVa/b9;

    .line 1353
    .line 1354
    invoke-direct {v2, v7}, LVa/a9;-><init>(LVa/y8;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-static {v2}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    goto :goto_4

    .line 1362
    :cond_7
    new-instance v2, LVa/b9;

    .line 1363
    .line 1364
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v3

    .line 1368
    invoke-direct {v2, v3}, LVa/a9;-><init>(LVa/y8;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-static {v2}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    sget v3, LVa/q8;->h:I

    .line 1376
    .line 1377
    add-int/lit8 v3, v3, 0x5f

    .line 1378
    .line 1379
    rem-int/lit16 v3, v3, 0x80

    .line 1380
    .line 1381
    sput v3, LVa/q8;->i:I

    .line 1382
    .line 1383
    :goto_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 1384
    .line 1385
    .line 1386
    move-result v3

    .line 1387
    shr-int/lit8 v3, v3, 0x10

    .line 1388
    .line 1389
    add-int/lit16 v3, v3, 0x536a

    .line 1390
    .line 1391
    int-to-char v3, v3

    .line 1392
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 1393
    .line 1394
    .line 1395
    move-result v7

    .line 1396
    shr-int/lit8 v7, v7, 0x10

    .line 1397
    .line 1398
    add-int/lit8 v7, v7, 0x2b

    .line 1399
    .line 1400
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 1401
    .line 1402
    .line 1403
    move-result v8

    .line 1404
    shr-int/lit8 v8, v8, 0x10

    .line 1405
    .line 1406
    sub-int/2addr v5, v8

    .line 1407
    invoke-static {v7, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v3

    .line 1411
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v3

    .line 1415
    const v5, -0xff5025

    .line 1416
    .line 1417
    .line 1418
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 1419
    .line 1420
    .line 1421
    move-result v7

    .line 1422
    sub-int/2addr v5, v7

    .line 1423
    int-to-char v5, v5

    .line 1424
    invoke-static {v4, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 1425
    .line 1426
    .line 1427
    move-result v7

    .line 1428
    rsub-int v7, v7, 0x28f

    .line 1429
    .line 1430
    invoke-static {v4, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 1431
    .line 1432
    .line 1433
    move-result v4

    .line 1434
    add-int/lit8 v4, v4, 0x24

    .line 1435
    .line 1436
    invoke-static {v7, v4, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v4

    .line 1440
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v4

    .line 1444
    invoke-virtual {v0, v1, v3, v2, v4}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1445
    .line 1446
    .line 1447
    return-object v2

    .line 1448
    :pswitch_6
    move/from16 v18, v10

    .line 1449
    .line 1450
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 1451
    .line 1452
    .line 1453
    move-result v2

    .line 1454
    rsub-int/lit8 v10, v2, -0x1

    .line 1455
    .line 1456
    int-to-char v2, v10

    .line 1457
    invoke-static {v6}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 1458
    .line 1459
    .line 1460
    move-result-wide v7

    .line 1461
    cmp-long v3, v7, v14

    .line 1462
    .line 1463
    add-int/lit8 v3, v3, 0x6e

    .line 1464
    .line 1465
    invoke-static {v4, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 1466
    .line 1467
    .line 1468
    move-result v7

    .line 1469
    add-int/2addr v7, v5

    .line 1470
    invoke-static {v3, v7, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v2

    .line 1474
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v2

    .line 1478
    invoke-static {v6, v6}, Landroid/view/View;->resolveSize(II)I

    .line 1479
    .line 1480
    .line 1481
    move-result v3

    .line 1482
    add-int/lit16 v3, v3, 0x60eb

    .line 1483
    .line 1484
    int-to-char v3, v3

    .line 1485
    invoke-static {v4, v13, v6, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 1486
    .line 1487
    .line 1488
    move-result v5

    .line 1489
    rsub-int v5, v5, 0x135

    .line 1490
    .line 1491
    invoke-static {v6, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1492
    .line 1493
    .line 1494
    move-result v7

    .line 1495
    rsub-int/lit8 v7, v7, 0x2b

    .line 1496
    .line 1497
    invoke-static {v5, v7, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v3

    .line 1505
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    invoke-static {v6, v6}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 1513
    .line 1514
    .line 1515
    move-result-wide v5

    .line 1516
    cmp-long v3, v5, v14

    .line 1517
    .line 1518
    rsub-int/lit8 v10, v3, -0x1

    .line 1519
    .line 1520
    int-to-char v3, v10

    .line 1521
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 1522
    .line 1523
    .line 1524
    move-result-wide v5

    .line 1525
    cmp-long v5, v5, v14

    .line 1526
    .line 1527
    rsub-int v5, v5, 0x98

    .line 1528
    .line 1529
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 1530
    .line 1531
    .line 1532
    move-result v6

    .line 1533
    neg-int v6, v6

    .line 1534
    invoke-static {v5, v6, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v3

    .line 1538
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v3

    .line 1542
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 1543
    .line 1544
    .line 1545
    move-result v5

    .line 1546
    shr-int/lit8 v5, v5, 0x10

    .line 1547
    .line 1548
    int-to-char v5, v5

    .line 1549
    invoke-static {v4, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 1550
    .line 1551
    .line 1552
    move-result v4

    .line 1553
    add-int/lit16 v4, v4, 0x162

    .line 1554
    .line 1555
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 1556
    .line 1557
    .line 1558
    move-result v6

    .line 1559
    shr-int/lit8 v6, v6, 0x18

    .line 1560
    .line 1561
    rsub-int/lit8 v6, v6, 0x2f

    .line 1562
    .line 1563
    invoke-static {v4, v6, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v4

    .line 1567
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v4

    .line 1571
    invoke-virtual {v0, v1, v3, v4}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    new-instance v3, LVa/f9;

    .line 1575
    .line 1576
    invoke-virtual/range {p0 .. p1}, LVa/q8;->x(Ljava/util/ArrayList;)LVa/c9;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v1

    .line 1580
    invoke-direct {v3, v2, v1}, LVa/f9;-><init>(LVa/y8;LVa/c9;)V

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v3}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v1

    .line 1587
    sget v2, LVa/q8;->i:I

    .line 1588
    .line 1589
    add-int/lit8 v2, v2, 0x25

    .line 1590
    .line 1591
    rem-int/lit16 v2, v2, 0x80

    .line 1592
    .line 1593
    sput v2, LVa/q8;->h:I

    .line 1594
    .line 1595
    return-object v1

    .line 1596
    :pswitch_7
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 1597
    .line 1598
    .line 1599
    move-result v8

    .line 1600
    int-to-byte v8, v8

    .line 1601
    add-int/2addr v8, v5

    .line 1602
    int-to-char v8, v8

    .line 1603
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 1604
    .line 1605
    .line 1606
    move-result-wide v9

    .line 1607
    cmp-long v2, v9, v2

    .line 1608
    .line 1609
    add-int/lit8 v2, v2, 0x6d

    .line 1610
    .line 1611
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 1612
    .line 1613
    .line 1614
    move-result v3

    .line 1615
    cmpl-float v3, v3, v11

    .line 1616
    .line 1617
    sub-int/2addr v5, v3

    .line 1618
    invoke-static {v2, v5, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v2

    .line 1622
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v2

    .line 1626
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 1627
    .line 1628
    .line 1629
    move-result v3

    .line 1630
    int-to-char v3, v3

    .line 1631
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 1632
    .line 1633
    .line 1634
    move-result v5

    .line 1635
    rsub-int v5, v5, 0xc7

    .line 1636
    .line 1637
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 1638
    .line 1639
    .line 1640
    move-result v8

    .line 1641
    add-int/lit8 v8, v8, 0x2a

    .line 1642
    .line 1643
    invoke-static {v5, v8, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v3

    .line 1647
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v3

    .line 1651
    invoke-virtual {v0, v1, v2, v3}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1652
    .line 1653
    .line 1654
    invoke-static {v6, v6, v6}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1655
    .line 1656
    .line 1657
    move-result v2

    .line 1658
    add-int/lit16 v2, v2, 0x536a

    .line 1659
    .line 1660
    int-to-char v2, v2

    .line 1661
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 1662
    .line 1663
    .line 1664
    move-result v3

    .line 1665
    add-int/lit8 v3, v3, 0x2b

    .line 1666
    .line 1667
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 1668
    .line 1669
    .line 1670
    move-result v5

    .line 1671
    neg-int v5, v5

    .line 1672
    invoke-static {v3, v5, v2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v2

    .line 1676
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v2

    .line 1680
    invoke-virtual {v0, v2, v1}, LVa/q8;->w(Ljava/lang/String;Ljava/util/ArrayList;)LVa/y8;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v2

    .line 1684
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v3

    .line 1688
    invoke-static {v4, v4, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 1689
    .line 1690
    .line 1691
    move-result v5

    .line 1692
    rsub-int v5, v5, 0x536a

    .line 1693
    .line 1694
    int-to-char v5, v5

    .line 1695
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 1696
    .line 1697
    .line 1698
    move-result v8

    .line 1699
    rsub-int/lit8 v8, v8, 0x2a

    .line 1700
    .line 1701
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 1702
    .line 1703
    .line 1704
    move-result v9

    .line 1705
    int-to-byte v9, v9

    .line 1706
    neg-int v9, v9

    .line 1707
    invoke-static {v8, v9, v5}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v5

    .line 1711
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v5

    .line 1715
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 1716
    .line 1717
    .line 1718
    move-result v8

    .line 1719
    shr-int/lit8 v8, v8, 0x10

    .line 1720
    .line 1721
    const v9, 0xc90a

    .line 1722
    .line 1723
    .line 1724
    sub-int/2addr v9, v8

    .line 1725
    int-to-char v8, v9

    .line 1726
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 1727
    .line 1728
    .line 1729
    move-result v9

    .line 1730
    shr-int/lit8 v9, v9, 0x18

    .line 1731
    .line 1732
    rsub-int v9, v9, 0xf1

    .line 1733
    .line 1734
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 1735
    .line 1736
    .line 1737
    move-result v10

    .line 1738
    shr-int/lit8 v10, v10, 0x10

    .line 1739
    .line 1740
    add-int/lit8 v10, v10, 0x21

    .line 1741
    .line 1742
    invoke-static {v9, v10, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v8

    .line 1746
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v8

    .line 1750
    invoke-virtual {v0, v1, v5, v3, v8}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1751
    .line 1752
    .line 1753
    invoke-static {v4, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 1754
    .line 1755
    .line 1756
    move-result v4

    .line 1757
    int-to-char v4, v4

    .line 1758
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 1759
    .line 1760
    .line 1761
    move-result v5

    .line 1762
    rsub-int v5, v5, 0x97

    .line 1763
    .line 1764
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 1765
    .line 1766
    .line 1767
    move-result v6

    .line 1768
    neg-int v6, v6

    .line 1769
    invoke-static {v5, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v4

    .line 1773
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v4

    .line 1777
    invoke-virtual {v0, v4, v1}, LVa/q8;->w(Ljava/lang/String;Ljava/util/ArrayList;)LVa/y8;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v4

    .line 1781
    new-instance v5, LVa/Y8;

    .line 1782
    .line 1783
    invoke-virtual/range {p0 .. p1}, LVa/q8;->x(Ljava/util/ArrayList;)LVa/c9;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v1

    .line 1787
    invoke-direct {v5, v2, v3, v4, v1}, LVa/Y8;-><init>(LVa/y8;LVa/y8;LVa/y8;LVa/c9;)V

    .line 1788
    .line 1789
    .line 1790
    invoke-static {v5}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v1

    .line 1794
    sget v2, LVa/q8;->i:I

    .line 1795
    .line 1796
    add-int/lit8 v2, v2, 0x65

    .line 1797
    .line 1798
    rem-int/lit16 v3, v2, 0x80

    .line 1799
    .line 1800
    sput v3, LVa/q8;->h:I

    .line 1801
    .line 1802
    rem-int/2addr v2, v12

    .line 1803
    if-nez v2, :cond_8

    .line 1804
    .line 1805
    return-object v1

    .line 1806
    :cond_8
    throw v7

    .line 1807
    :pswitch_8
    move/from16 v18, v10

    .line 1808
    .line 1809
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 1810
    .line 1811
    .line 1812
    move-result v8

    .line 1813
    cmpl-float v8, v8, v11

    .line 1814
    .line 1815
    add-int/lit8 v8, v8, -0x1

    .line 1816
    .line 1817
    int-to-char v8, v8

    .line 1818
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 1819
    .line 1820
    .line 1821
    move-result v9

    .line 1822
    add-int/lit8 v9, v9, 0x6e

    .line 1823
    .line 1824
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 1825
    .line 1826
    .line 1827
    move-result v10

    .line 1828
    shr-int/lit8 v10, v10, 0x10

    .line 1829
    .line 1830
    rsub-int/lit8 v10, v10, 0x1

    .line 1831
    .line 1832
    invoke-static {v9, v10, v8}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v8

    .line 1836
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v8

    .line 1840
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 1841
    .line 1842
    .line 1843
    move-result v9

    .line 1844
    int-to-char v9, v9

    .line 1845
    invoke-static {v4, v13, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 1846
    .line 1847
    .line 1848
    move-result v10

    .line 1849
    rsub-int/lit8 v10, v10, 0x6e

    .line 1850
    .line 1851
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 1852
    .line 1853
    .line 1854
    move-result-wide v19

    .line 1855
    cmp-long v11, v19, v14

    .line 1856
    .line 1857
    add-int/lit8 v11, v11, 0x27

    .line 1858
    .line 1859
    invoke-static {v10, v11, v9}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v9

    .line 1863
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v9

    .line 1867
    invoke-virtual {v0, v1, v8, v9}, LVa/q8;->u(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual/range {p0 .. p1}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v8

    .line 1874
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 1875
    .line 1876
    .line 1877
    move-result-wide v9

    .line 1878
    cmp-long v9, v9, v14

    .line 1879
    .line 1880
    add-int/lit8 v9, v9, -0x1

    .line 1881
    .line 1882
    int-to-char v9, v9

    .line 1883
    invoke-static {v4, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 1884
    .line 1885
    .line 1886
    move-result v10

    .line 1887
    rsub-int v10, v10, 0x96

    .line 1888
    .line 1889
    const v11, -0xffffff

    .line 1890
    .line 1891
    .line 1892
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 1893
    .line 1894
    .line 1895
    move-result v13

    .line 1896
    sub-int/2addr v11, v13

    .line 1897
    invoke-static {v10, v11, v9}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v9

    .line 1901
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v9

    .line 1905
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 1906
    .line 1907
    .line 1908
    move-result-wide v10

    .line 1909
    cmp-long v10, v10, v14

    .line 1910
    .line 1911
    rsub-int v10, v10, 0x2462

    .line 1912
    .line 1913
    int-to-char v10, v10

    .line 1914
    invoke-static {v4, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 1915
    .line 1916
    .line 1917
    move-result v4

    .line 1918
    rsub-int v4, v4, 0x98

    .line 1919
    .line 1920
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 1921
    .line 1922
    .line 1923
    move-result-wide v18

    .line 1924
    cmp-long v2, v18, v2

    .line 1925
    .line 1926
    add-int/lit8 v2, v2, 0x2b

    .line 1927
    .line 1928
    invoke-static {v4, v2, v10}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v2

    .line 1932
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    invoke-virtual {v0, v1, v9, v8, v2}, LVa/q8;->n(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual/range {p0 .. p1}, LVa/q8;->x(Ljava/util/ArrayList;)LVa/c9;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    invoke-virtual/range {p0 .. p1}, LVa/q8;->a(Ljava/util/List;)Z

    .line 1944
    .line 1945
    .line 1946
    move-result v3

    .line 1947
    if-eqz v3, :cond_a

    .line 1948
    .line 1949
    sget v3, LVa/q8;->i:I

    .line 1950
    .line 1951
    add-int/lit8 v3, v3, 0x4b

    .line 1952
    .line 1953
    rem-int/lit16 v4, v3, 0x80

    .line 1954
    .line 1955
    sput v4, LVa/q8;->h:I

    .line 1956
    .line 1957
    rem-int/2addr v3, v12

    .line 1958
    if-eqz v3, :cond_9

    .line 1959
    .line 1960
    invoke-virtual/range {p0 .. p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v3

    .line 1964
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 1965
    .line 1966
    .line 1967
    move-result v4

    .line 1968
    int-to-byte v4, v4

    .line 1969
    const/16 v9, 0x71e8

    .line 1970
    .line 1971
    rem-int/2addr v9, v4

    .line 1972
    int-to-char v4, v9

    .line 1973
    invoke-static {v6, v5}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 1974
    .line 1975
    .line 1976
    move-result v6

    .line 1977
    rsub-int v6, v6, 0x7192

    .line 1978
    .line 1979
    invoke-static {v5}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 1980
    .line 1981
    .line 1982
    move-result-wide v9

    .line 1983
    cmp-long v9, v9, v14

    .line 1984
    .line 1985
    mul-int/2addr v9, v12

    .line 1986
    invoke-static {v6, v9, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v4

    .line 1990
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v4

    .line 1994
    invoke-virtual {v3, v4}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 1995
    .line 1996
    .line 1997
    move-result v3

    .line 1998
    if-eqz v3, :cond_a

    .line 1999
    .line 2000
    goto :goto_5

    .line 2001
    :cond_9
    invoke-virtual/range {p0 .. p1}, LVa/q8;->c(Ljava/util/ArrayList;)LVa/v8;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v3

    .line 2005
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 2006
    .line 2007
    .line 2008
    move-result v4

    .line 2009
    int-to-byte v4, v4

    .line 2010
    rsub-int v4, v4, 0x3366

    .line 2011
    .line 2012
    int-to-char v4, v4

    .line 2013
    invoke-static {v6, v6}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 2014
    .line 2015
    .line 2016
    move-result v9

    .line 2017
    rsub-int v9, v9, 0xc4

    .line 2018
    .line 2019
    invoke-static {v6}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 2020
    .line 2021
    .line 2022
    move-result-wide v10

    .line 2023
    cmp-long v6, v10, v14

    .line 2024
    .line 2025
    add-int/lit8 v6, v6, 0x4

    .line 2026
    .line 2027
    invoke-static {v9, v6, v4}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v4

    .line 2031
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v4

    .line 2035
    invoke-virtual {v3, v4}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 2036
    .line 2037
    .line 2038
    move-result v3

    .line 2039
    if-eqz v3, :cond_a

    .line 2040
    .line 2041
    :goto_5
    iget v3, v0, LVa/q8;->a:I

    .line 2042
    .line 2043
    add-int/2addr v3, v5

    .line 2044
    iput v3, v0, LVa/q8;->a:I

    .line 2045
    .line 2046
    invoke-virtual/range {p0 .. p1}, LVa/q8;->x(Ljava/util/ArrayList;)LVa/c9;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v7

    .line 2050
    sget v1, LVa/q8;->i:I

    .line 2051
    .line 2052
    add-int/lit8 v1, v1, 0x9

    .line 2053
    .line 2054
    rem-int/lit16 v1, v1, 0x80

    .line 2055
    .line 2056
    sput v1, LVa/q8;->h:I

    .line 2057
    .line 2058
    :cond_a
    new-instance v1, LVa/W8;

    .line 2059
    .line 2060
    iget-byte v3, v0, LVa/q8;->c:B

    .line 2061
    .line 2062
    invoke-direct {v1, v8, v2, v7, v3}, LVa/W8;-><init>(LVa/y8;LVa/c9;LVa/c9;B)V

    .line 2063
    .line 2064
    .line 2065
    invoke-static {v1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v1

    .line 2069
    return-object v1

    .line 2070
    :pswitch_9
    new-instance v1, LVa/a9;

    .line 2071
    .line 2072
    invoke-direct {v1, v7}, LVa/a9;-><init>(LVa/y8;)V

    .line 2073
    .line 2074
    .line 2075
    invoke-static {v1}, LVa/q8;->t(LVa/c9;)LVa/c9;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v1

    .line 2079
    return-object v1

    .line 2080
    nop

    .line 2081
    :sswitch_data_0
    .sparse-switch
        -0x37b1c2d0 -> :sswitch_9
        -0x21ced359 -> :sswitch_8
        0x3b -> :sswitch_7
        0x7b -> :sswitch_6
        0xd1d -> :sswitch_5
        0x18cc9 -> :sswitch_4
        0x1c1bb -> :sswitch_3
        0x1c727 -> :sswitch_2
        0x59a58ff -> :sswitch_1
        0x6bdcb31 -> :sswitch_0
    .end sparse-switch

    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y(LVa/v8;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    .line 1
    sget v0, LVa/q8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q8;->h:I

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LVa/v8;->h(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const v1, 0x1008604

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    add-int/2addr v3, v1

    .line 30
    int-to-char v1, v3

    .line 31
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    add-int/lit16 v3, v3, 0x468

    .line 36
    .line 37
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    shr-int/lit8 v4, v4, 0x10

    .line 42
    .line 43
    rsub-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    invoke-static {v3, v4, v1}, LVa/q8;->p(IIC)Ljava/lang/String;

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
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    add-int/lit8 p2, p2, 0x14

    .line 64
    .line 65
    shr-int/lit8 p2, p2, 0x6

    .line 66
    .line 67
    const v1, 0x8604

    .line 68
    .line 69
    .line 70
    add-int/2addr p2, v1

    .line 71
    int-to-char p2, p2

    .line 72
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/lit16 v3, v3, 0x467

    .line 77
    .line 78
    const-wide/16 v4, 0x0

    .line 79
    .line 80
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    invoke-static {v3, v4, p2}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    shr-int/lit8 v3, v3, 0x18

    .line 111
    .line 112
    add-int/2addr v3, v1

    .line 113
    int-to-char v3, v3

    .line 114
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    const-wide/16 v6, -0x1

    .line 119
    .line 120
    cmp-long v4, v4, v6

    .line 121
    .line 122
    add-int/lit16 v4, v4, 0x466

    .line 123
    .line 124
    const/16 v5, 0x30

    .line 125
    .line 126
    const-string v6, ""

    .line 127
    .line 128
    invoke-static {v6, v5, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    neg-int v5, v5

    .line 133
    invoke-static {v4, v5, v3}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, LVa/v8;->f()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    sub-int/2addr v1, p1

    .line 156
    int-to-char p1, v1

    .line 157
    invoke-static {v6}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    add-int/lit16 v1, v1, 0x468

    .line 162
    .line 163
    invoke-static {v6, v2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    add-int/lit8 v2, v2, 0x1

    .line 168
    .line 169
    invoke-static {v1, v2, p1}, LVa/q8;->p(IIC)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p3, p2, p1, p4}, LVa/q8;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p0, p1}, LVa/q8;->q(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const/4 p1, 0x0

    .line 192
    throw p1
.end method

.method public final z(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, LVa/o8;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LVa/o8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/o8;->b:LVa/q8;

    .line 8
    .line 9
    invoke-virtual {p0, p2, p1, v0}, LVa/q8;->m(Ljava/util/List;Ljava/lang/String;LVa/p8;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget p2, LVa/q8;->h:I

    .line 14
    .line 15
    add-int/lit8 p2, p2, 0x33

    .line 16
    .line 17
    rem-int/lit16 p2, p2, 0x80

    .line 18
    .line 19
    sput p2, LVa/q8;->i:I

    .line 20
    .line 21
    return-object p1
.end method
