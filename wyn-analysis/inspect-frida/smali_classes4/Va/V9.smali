.class public final LVa/V9;
.super Landroid/webkit/WebViewClient;
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
.field public final a:Landroid/webkit/WebViewClient;

.field public final b:Landroid/webkit/WebViewClient;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x444

    .line 2
    .line 3
    new-array v1, v0, [C

    .line 4
    .line 5
    const-string v2, "\u0000WkW\u00d6\u0006A\u00c0\u00ac\u00a1\u0017\u009f\u0083[\u00ee\u001dY\u00fc\u00c4\u00ab/\u0091\u009bH\u0006,q\u00ce\u00dc\u00d9G\u008d\u00b3O\u001e \u0089\u00e5\u00f4\u00c2_\u0087\u00cbh\u008f\u00d5\u00e4\u00d0Y\u0086\u00cei#*\u0098J\u000c\u00d5a\u00a0\u00d6 K?\u00a00\u0014\u00d4\u0089\u0084\u00fesS_\u00c8\n<\u00d5\u0091\u00ac\u0006q{T\u00d0XD\u00f9\u00b9\u00b4.\u0081\u0083U\u00f8\u001el\u00e0\u00c1\u00996\u009e\u00ab_\u0000>t\u00ec\u00e9\u00b9^\u0086\u00b3Q(\u0013\u009c\u00ea\u00f1\u00c6f\u00b0\u00dba0!\u00a4\u00f6\u0019\u00cd\u008e\u0098\u00e3oXr\u00cd\u0019!\u00cc\u0096\u009c\u000b+\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00bb\u009bT\u00061q\u00ed\u00dc\u00d5G\u0080\u00b3c\u001e>\u0089\u00ed\u00f4\u00d3_\u0086\u00cbn6l\u00a1\r\u000c\u00d8w\u008d\u00e3aN*\u00b9\u001c$\u00e5\u008f\u00aa\u00fbkf2\u00d1\u0000<\u00cd\u00a7\u00b2\u0013m~o\u00e9\u001eT\u00f2\u00bf\u009c+m\u0096U\u0001\u0002l\u00f1\u00d7\u00a4B\u009b\u00ae\u0006\u0019\u0015\u0084\u00e0\u00ef\u00a8Z\u00df\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbi6$\u00a1\u0011\u000c\u00c5w\u008e\u00e3pN\t\u00b9\u000e$\u00cf\u008f\u00ae\u00fb|f)\u00d1\u0016<\u00c1\u00a7\u0083\u0013z~V\u00e9 T\u00f1\u00bf\u00b1+f\u0096]\u0001\u0008l\u00ff\u00d7\u00e2B\u008e\u00aeK\u0019\u0011\u0084\u00e7\u00ef\u00a1Z\u0085\u00c6\\1s\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00bb\u009bT\u00061q\u00ed\u00dc\u00d5G\u0080\u00b3c\u001e>\u0089\u00ed\u00f4\u00d3_\u0086\u00cbn6l\u00a1\r\u000c\u00d8w\u008d\u00e3aN*\u00b9\u001c$\u00e5\u008f\u00aa\u00fbkf2\u00d1\u0000<\u00cd\u00a7\u00b2\u0013m~o\u00e9\u001eT\u00f2\u00bf\u009c+m\u0096U\u0001\u0002l\u00f1\u00d7\u00a4B\u009b\u00ae\u0006\u0019\u0012\u0084\u00f7\u00ef\u00b5Z\u0083\u00c6M1)\u009c\u00f8\u0007\u0097Up>u\u0083#\u0014\u00cc\u00f9\u008fB\u00ef\u00d6p\u00bb\u0005\u000c\u0085\u0091\u009az\u0095\u00ceqS!$\u00d6\u0089\u00fa\u0012\u00af\u00e6pK\t\u00dc\u00d4\u00a1\u00f1\n\u00fd\u009e@c\u0017\u00f4\u001bY\u00e4\"\u00b0\u00b6D\u001b \u00ec9q\u00fe\u00da\u009b\u00aeO3\u0010\u0084#\u00b8\u0098\u00d3\u009dn\u00cb\u00f9$\u0014g\u00af\u0007;\u0098V\u00ed\u00e1m|r\u0097}#\u0099\u00be\u00c9\u00c9>d\u0012\u00ffG\u000b\u0098\u00a6\u00e11<L\u0019\u00e7\u0015s\u00a8\u008e\u00ff\u0019\u00f3\u00b4\u000c\u00cfX[\u00ac\u00f6\u00dd\u0001\u00cc\u009c\u00197hC\u00a0\u00de\u00f5i\u00ca\u0084\u001d\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbu6\"\u00a12\u000c\u00dfw\u0083\u00e3pN\u0014\u00b9\u001d$\u00d9\u008f\u00b3\u00fb{f2\u00d1\u0011<\u00c1@L+I\u0096\u001f\u0001\u00f0\u00ec\u00b3W\u00d3\u00c3L\u00ae9\u0019\u00b9\u0084\u00a6o\u00a9\u00dbMF\u001d1\u00ea\u009c\u00c6\u0007\u0093\u00f3L^5\u00c9\u00e8\u00b4\u00cd\u001f\u00c1\u008b`v-\u00e1\u0018L\u00cc7\u0087\u00a3y\u000e\u0006\u00f9\u001fd\u00d7\u00cf\u00b0\u00bbu&*\u0091\u001e|\u00dd\u00e7\u00abSS>V\u00a9\u0014\u0014\u00e2\u00ff\u00bckx\u00d6I\u00da\u009c\u00b1\u0099\u000c\u00cf\u009b vc\u00cd\u0003Y\u009c4\u00e9\u0083i\u001ev\u00f5yA\u009d\u00dc\u00cd\u00ab:\u0006\u0016\u009dCi\u009c\u00c4\u00e5S8.\u001d\u0085\u0011\u0011\u00ac\u00ec\u00fb{\u00f3\u00d6\u0006\u00adT9\u0080\u0094\u00fec\u00cf\u00fe\nUW!\u00b2\u00bc\u00fd\u000b\u00c2\u00e6\u000f}j\u00c9\u00b2\u00a4\u00973\u00c6%\u009cN\u0099\u00f3\u00cfd \u0089c2\u0003\u00a6\u009c\u00cb\u00e9|i\u00e1v\ny\u00be\u009d#\u00cdT:\u00f9\u0016bC\u0096\u009c;\u00e5\u00ac8\u00d1\u001dz\u0011\u00ee\u00ac\u0013\u00fb\u0084\u00f5)\u000cRX\u00c6\u00a8k\u00f6\u009c\u00d7\u0001\u0016\u00aaa\u00de\u0092C\u00eb\u00f4\u00d9\u0019\u0012\u0082}(\u0083C\u0086\u00fe\u00d0i?\u0084|?\u001c\u00ab\u0083\u00c6\u00f6qv\u00eci\u0007f\u00b3\u0082.\u00d2Y%\u00f4\to\\\u009b\u00836\u00fa\u00a1\'\u00dc\u0002w\u000e\u00e3\u00b3\u001e\u00e4\u0089\u00fe$\u0019_V\u00cb\u00bff\u00d2\u0091\u00db\u000c\u001f\u00a7o\u00d3\u00aaN\u00eb\u00f9\u00dd\u0014\u0011\u008fc;\u00a7V\u0093\u00c1\u00c4\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00ad/\u009a\u009b`\u00067q\u00f8\u00dc\u00d1G\u00bc\u00b3E\u001e!\u0089\u00f1\u00f4\u00d4_\u0085\u00cbs6?\u00a1\r\u000c\u00d9w\u008d\u00e3z\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cb~6#\u00a1+\u000c\u00c0w\u0086\u00e3uN2\u00b9\u001d$\u00fc\u008f\u00b5\u00fb}f)\u00d1\u0006<\u00c1\u00a7\u00b2\u0013@~S\u00e9\u001fT\u00ea\u00bf\u00bf+p\u0096M\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbu6\"\u00a1,\u000c\u00d5w\u0081\u00e3qN/\u00b9\u000e$\u00cf\u008f\u00b8\u00fb]f3\u00d1\u001e<\u00e1\u00a7\u00a4\u0013z~U\u00e9\u001e\u00bb\u00ae\u00d0\u00abm\u00fd\u00fa\u0012\u0017Q\u00ac18\u00aeU\u00db\u00e2[\u007fD\u0094K \u00af\u00bd\u00ff\u00ca\u0008g$\u00fcq\u0008\u00ae\u00a5\u00d72\nO/\u00e4#p\u009e\u008d\u00c9\u001a\u00c7\u00b7>\u00ccjX\u009a\u00f5\u00c4\u0002\u00e5\u009f$4S@\u00a6\u00dd\u00c7j\u00f0\u0087*\u001cS\u00a8\u0097\u00c5\u0092R\u00e2\u00ef\u0007\u0004O\u0090\u00bb-\u00ba\u00ba\u00fc\u00d7\u0006lD\u00f9d\u0015\u00b18\u00d9S\u00dc\u00ee\u008aye\u0094&/F\u00bb\u00d9\u00d6\u00aca,\u00fc=\u0017\t\u00a3\u00d6>\u00a8I\u007f\u00e4N\u007f\u0015\u008b\u009c&\u00a1\u00b1j\u00ccCg\u0013\u00f3\u00ef\u000e\u00be\u0099\u00c24CO\u0010\u00db\u00dav\u00bf\u0081\u0087\u001cS\u00b7)\u00c3\u00e4^\u00b9\u00e9\u008a\u0004{\u009f&+\u00fdF\u00c3\u00d1\u009elv\u0087\u000f\u0013\u00fb\u00ae\u00da9\u008eTV\u00ef3z\u0011\u0096\u00c7!\u0099\u00bc}\u00d7,\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbu6\"\u00a1,\u000c\u00d5w\u0081\u00e3qN/\u00b9\u000e$\u00cf\u008f\u00b8\u00fbFf4\u00d1\u0006<\u00d4\u00a7\u0097\u0013}~N\u00e9\u0004T\u00cc\u00bf\u00b5+s\u0096A\u0001\u0003l\u00eb\u00d7\u00be\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbi6$\u00a1\u0011\u000c\u00c5w\u008e\u00e3pN\t\u00b9\u000e$\u00cf\u008f\u00ae\u00fb|f)\u00d1\u0016<\u00c1\u00a7\u009d\u0013m~C\u00e9)T\u00e8\u00bf\u00b5+l\u0096@ \u009fK\u009a\u00f6\u00cca#\u008c`7\u0000\u00a3\u009f\u00ce\u00eayj\u00e4u\u000fz\u00bb\u009e&\u00ceQ9\u00fc\u0015g@\u0093\u009f>\u00e6\u00a9;\u00d4\u001e\u007f\u0012\u00eb\u00af\u0016\u00f8\u0081\u00f1,\u0004WP\u00c3\u00afn\u00f2\u0099\u00c6\u0004\u001c\u00afc\u00db\u00b0F\u00d1\u00f1\u00cd\u001c\u0007\u0087I3\u00a4^\u0085\u00c9\u00d8t0.PEU\u00f8\u0003o\u00ec\u0082\u00af9\u00cf\u00adP\u00c0%w\u00a5\u00ea\u00ba\u0001\u00b5\u00b5Q(\u0001_\u00f6\u00f2\u00dai\u008f\u009dP0)\u00a7\u00f4\u00da\u00d1q\u00dd\u00e5`\u00187\u008f8\"\u00c6Y\u0096\u00cdm`6\u0097.\n\u00d7\u00a1\u00a8\u00d5uH2\u00ff\u0002\u0012\u00d5\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbu6\"\u00a1,\u000c\u00d5w\u0081\u00e3qN/\u00b9\u000e$\u00cf\u008f\u00b8\u00fbBf/\u00d1\u0015<\u00cd\u00a7\u00b8\u0013Z~_\u00e9\u001dT\u00eb\u00bf\u00b5+q\u0096@\u00a9\u008c\u00c2\u0089\u007f\u00df\u00e80\u0005s\u00be\u0013*\u008cG\u00f9\u00f0ymf\u0086i2\u008d\u00af\u00dd\u00d8*u\u0006\u00eeS\u001a\u008c\u00b7\u00f5 (]\r\u00f6\u0001b\u00bc\u009f\u00eb\u0008\u00e5\u00a5\u001c\u00deHJ\u00b8\u00e7\u00e6\u0010\u00c7\u008d\u0006&qR\u008f\u00cf\u00fdx\u00cf\u0095\u001d\u000eZ\u00ba\u00b3\u00d7\u0081@\u00ca\u00fd%\u0000Ek@\u00d6\u0016A\u00f9\u00ac\u00ba\u0017\u00da\u0083E\u00ee0Y\u00b0\u00c4\u00af/\u00a0\u009bD\u0006\u0014q\u00e3\u00dc\u00cfG\u009a\u00b3E\u001e<\u0089\u00e1\u00f4\u00c4_\u00c8\u00cbu6\"\u00a1,\u000c\u00d5w\u008c\u00e3pN#\u00b9\n$\u00fa\u008f\u00ae\u00fbaf#\u00d1\u0017<\u00d7\u00a7\u00a5\u0013O~U\u00e9\u0002T\u00fb\u0000gkW\u00d6\u0010A\u00c1\u00ac\u00ba\u0017\u009b\u0083\\\u00ee.Y\u00f5\u00c4\u00a6/\u00a3\u009bC\u0006:q\u00dc\u00dc\u00d5G\u008b\u00b3W\u001e\u0011\u0089\u00e8\u00f4\u00df_\u008d\u00cbt68\u0000gkW\u00d6\u0010A\u00c2\u00ac\u00aa\u0017\u00ad\u0083I\u00ee<Y\u00c6\u00c4\u00ab/\u0091\u009bQ\u0006\u001bq\u00e6\u00dc\u00d5G\u008b\u00b3N\u001e&\u00059n<\u00d3jD\u0085\u00a9\u00c6\u0012\u00a6\u0086\'\u00ebJ\\\u0085\u00c1\u00d2*\u00ed\u009ez\u0003At\u008e\u00d9\u00a5B\u00f1\u00b6)\u001bZ\u008c\u0091\u00f1\u00a4Z\u00f3\u00ceF3g\u00a4g\t\u00aer\u00c8\u00e6\u0001K_\u00bcs!\u0095\u008a\u00cc\u00fe\u001bcY\u00d4`9\u00ac\u00a2\u00ee\u0016\u0011{%\u00ec\u007fQ\u0090\u00ba\u00cd.\n\u0093\'\u0004hi\u00c4\u00d2\u00d8G\u00e1\u00ab&\u001cu\u0081\u0098\u00ea\u00dd_\u00aa\u00c394C\u0099\u0084\u0002\u00aaw\u00e3\u00db:L\u0008\u00b1\u00dd\u0000\'"

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
    sput-object v1, LVa/V9;->c:[C

    .line 14
    .line 15
    const-wide v0, 0x744f0c955af36b32L    # 1.7784274752043231E252

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    sput-wide v0, LVa/V9;->d:J

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebViewClient;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 5
    .line 6
    iput-object p2, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 7
    .line 8
    return-void
.end method

.method public static c(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/V9;->c:[C

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
    sget-wide v7, LVa/V9;->d:J

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
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    sget v0, LVa/V9;->e:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x11

    .line 8
    .line 9
    rem-int/lit16 v3, v0, 0x80

    .line 10
    .line 11
    sput v3, LVa/V9;->f:I

    .line 12
    .line 13
    rem-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    const-wide/16 v5, -0x1

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    const v10, 0x15f0af40

    .line 29
    .line 30
    .line 31
    const/16 v11, 0x30

    .line 32
    .line 33
    const/4 v12, -0x1

    .line 34
    const-string v13, ""

    .line 35
    .line 36
    if-eq v0, v10, :cond_1

    .line 37
    .line 38
    const v10, 0x16be0135

    .line 39
    .line 40
    .line 41
    if-eq v0, v10, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v14

    .line 48
    cmp-long v0, v14, v5

    .line 49
    .line 50
    add-int/2addr v0, v12

    .line 51
    int-to-char v0, v0

    .line 52
    invoke-static {v9}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    rsub-int v10, v10, 0x3dd

    .line 57
    .line 58
    invoke-static {v13, v11, v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    add-int/lit8 v11, v11, 0x18

    .line 63
    .line 64
    invoke-static {v10, v11, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    move v12, v9

    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object/from16 v11, p1

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_1
    invoke-static {v13, v13, v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    int-to-char v0, v0

    .line 90
    invoke-static {v13, v11, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    add-int/lit16 v10, v10, 0x3f6

    .line 95
    .line 96
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    shr-int/lit8 v11, v11, 0x10

    .line 101
    .line 102
    add-int/lit8 v11, v11, 0x12

    .line 103
    .line 104
    invoke-static {v10, v11, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    sget v0, LVa/V9;->f:I

    .line 119
    .line 120
    add-int/lit8 v0, v0, 0x2b

    .line 121
    .line 122
    rem-int/lit16 v0, v0, 0x80

    .line 123
    .line 124
    sput v0, LVa/V9;->e:I

    .line 125
    .line 126
    move v12, v7

    .line 127
    :cond_2
    :goto_0
    if-eqz v12, :cond_5

    .line 128
    .line 129
    if-eq v12, v7, :cond_3

    .line 130
    .line 131
    :try_start_2
    new-instance v0, LVa/k8;

    .line 132
    .line 133
    invoke-static {v13, v9}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    int-to-char v10, v10

    .line 138
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    shr-int/lit8 v11, v11, 0x8

    .line 143
    .line 144
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 145
    .line 146
    .line 147
    move-result-wide v12

    .line 148
    cmp-long v12, v12, v3

    .line 149
    .line 150
    add-int/lit8 v12, v12, 0x15

    .line 151
    .line 152
    invoke-static {v11, v12, v10}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 160
    move-object/from16 v11, p1

    .line 161
    .line 162
    move-object/from16 v12, p5

    .line 163
    .line 164
    :try_start_3
    invoke-direct {v0, v11, v12, v10, v2}, LVa/k8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v11}, LVa/y7;->f()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v0, v10}, LVa/j8;->d(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v8

    .line 175
    :catch_1
    move-exception v0

    .line 176
    goto :goto_1

    .line 177
    :cond_3
    move-object/from16 v11, p1

    .line 178
    .line 179
    sget v0, LVa/V9;->e:I

    .line 180
    .line 181
    add-int/lit8 v0, v0, 0x41

    .line 182
    .line 183
    rem-int/lit16 v10, v0, 0x80

    .line 184
    .line 185
    sput v10, LVa/V9;->f:I

    .line 186
    .line 187
    rem-int/lit8 v0, v0, 0x2

    .line 188
    .line 189
    if-eqz v0, :cond_4

    .line 190
    .line 191
    iget-object v0, v1, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_4
    throw v8

    .line 195
    :cond_5
    move-object/from16 v11, p1

    .line 196
    .line 197
    sget v0, LVa/V9;->e:I

    .line 198
    .line 199
    add-int/lit8 v0, v0, 0x33

    .line 200
    .line 201
    rem-int/lit16 v10, v0, 0x80

    .line 202
    .line 203
    sput v10, LVa/V9;->f:I

    .line 204
    .line 205
    rem-int/lit8 v0, v0, 0x2

    .line 206
    .line 207
    if-eqz v0, :cond_6

    .line 208
    .line 209
    iget-object v0, v1, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 210
    .line 211
    return-object v0

    .line 212
    :cond_6
    throw v8

    .line 213
    :cond_7
    move-object/from16 v11, p1

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 216
    .line 217
    .line 218
    :try_start_4
    throw v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    throw v0

    .line 221
    :goto_1
    invoke-virtual {v11}, LVa/y7;->f()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    new-instance v11, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 231
    .line 232
    .line 233
    move-result-wide v12

    .line 234
    cmp-long v5, v12, v5

    .line 235
    .line 236
    add-int/lit16 v5, v5, 0x57b

    .line 237
    .line 238
    int-to-char v5, v5

    .line 239
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 240
    .line 241
    .line 242
    move-result-wide v12

    .line 243
    cmp-long v3, v12, v3

    .line 244
    .line 245
    rsub-int v3, v3, 0x408

    .line 246
    .line 247
    invoke-static {v9}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    add-int/lit8 v4, v4, 0x3c

    .line 252
    .line 253
    invoke-static {v3, v4, v5}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    shr-int/lit8 v2, v2, 0x10

    .line 272
    .line 273
    int-to-char v2, v2

    .line 274
    const/4 v3, 0x0

    .line 275
    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    cmpl-float v3, v4, v3

    .line 280
    .line 281
    add-int/lit16 v3, v3, 0x443

    .line 282
    .line 283
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    shr-int/lit8 v4, v4, 0x10

    .line 288
    .line 289
    sub-int/2addr v7, v4

    .line 290
    invoke-static {v3, v7, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-static {v10, v2, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    return-object v8
.end method

.method public final b(Landroid/webkit/WebView;Ljava/lang/String;Z)Z
    .locals 9

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    iget-object v2, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 14
    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0x5a

    .line 26
    .line 27
    div-int/2addr v1, v6

    .line 28
    xor-int/2addr v0, v5

    .line 29
    if-eq v0, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p3

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eq v0, v5, :cond_2

    .line 39
    .line 40
    :cond_1
    if-eqz p3, :cond_4

    .line 41
    .line 42
    :cond_2
    :goto_0
    instance-of p3, v2, LVa/V9;

    .line 43
    .line 44
    if-eqz p3, :cond_3

    .line 45
    .line 46
    move-object p3, v2

    .line 47
    check-cast p3, LVa/V9;

    .line 48
    .line 49
    invoke-virtual {p3, p1, p2, v5}, LVa/V9;->b(Landroid/webkit/WebView;Ljava/lang/String;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :cond_3
    return v5

    .line 53
    :goto_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    shr-int/lit8 v0, v0, 0x16

    .line 58
    .line 59
    int-to-char v0, v0

    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    shr-int/lit8 v1, v1, 0x10

    .line 65
    .line 66
    invoke-static {v6, v6}, Landroid/view/View;->resolveSize(II)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    rsub-int/lit8 v5, v5, 0x16

    .line 71
    .line 72
    invoke-static {v1, v5, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const v1, 0x8f90

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    sub-int/2addr v1, v5

    .line 88
    int-to-char v1, v1

    .line 89
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    shr-int/lit8 v5, v5, 0x10

    .line 94
    .line 95
    add-int/lit8 v5, v5, 0x16

    .line 96
    .line 97
    const v7, -0xffffce

    .line 98
    .line 99
    .line 100
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    sub-int/2addr v7, v8

    .line 105
    invoke-static {v5, v7, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v0, v1, p3, v6}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 114
    .line 115
    .line 116
    :cond_4
    sget p3, LVa/V9;->f:I

    .line 117
    .line 118
    add-int/lit8 v0, p3, 0x45

    .line 119
    .line 120
    rem-int/lit16 v0, v0, 0x80

    .line 121
    .line 122
    sput v0, LVa/V9;->e:I

    .line 123
    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    add-int/lit8 p3, p3, 0x55

    .line 127
    .line 128
    rem-int/lit16 v0, p3, 0x80

    .line 129
    .line 130
    sput v0, LVa/V9;->e:I

    .line 131
    .line 132
    rem-int/lit8 p3, p3, 0x2

    .line 133
    .line 134
    const-class v0, Landroid/webkit/WebViewClient;

    .line 135
    .line 136
    if-nez p3, :cond_5

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-nez p3, :cond_6

    .line 147
    .line 148
    sget p3, LVa/V9;->f:I

    .line 149
    .line 150
    add-int/lit8 p3, p3, 0x33

    .line 151
    .line 152
    rem-int/lit16 p3, p3, 0x80

    .line 153
    .line 154
    sput p3, LVa/V9;->e:I

    .line 155
    .line 156
    :try_start_1
    invoke-virtual {v2, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    return p1

    .line 161
    :catchall_1
    move-exception p3

    .line 162
    const-string v0, ""

    .line 163
    .line 164
    invoke-static {v0, v6}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    int-to-char v1, v1

    .line 169
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v7

    .line 173
    cmp-long v2, v7, v3

    .line 174
    .line 175
    add-int/lit8 v2, v2, -0x1

    .line 176
    .line 177
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 178
    .line 179
    .line 180
    move-result-wide v7

    .line 181
    cmp-long v5, v7, v3

    .line 182
    .line 183
    rsub-int/lit8 v5, v5, 0x17

    .line 184
    .line 185
    invoke-static {v2, v5, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const/16 v2, 0x30

    .line 194
    .line 195
    invoke-static {v0, v2, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    rsub-int/lit8 v0, v0, -0x1

    .line 200
    .line 201
    int-to-char v0, v0

    .line 202
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    add-int/lit8 v2, v2, 0x49

    .line 207
    .line 208
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 209
    .line 210
    .line 211
    move-result-wide v7

    .line 212
    cmp-long v3, v7, v3

    .line 213
    .line 214
    add-int/lit8 v3, v3, 0x33

    .line 215
    .line 216
    invoke-static {v2, v3, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v1, v0, p3, v6}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    const/4 p1, 0x0

    .line 236
    throw p1

    .line 237
    :cond_6
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    return p1
.end method

.method public final d(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Z)Z
    .locals 10

    .line 1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    :try_start_0
    iget-object v6, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 10
    .line 11
    invoke-virtual {v6, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz p3, :cond_2

    .line 19
    .line 20
    :goto_0
    instance-of p3, v0, LVa/V9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    sget p3, LVa/V9;->f:I

    .line 25
    .line 26
    add-int/lit8 p3, p3, 0x41

    .line 27
    .line 28
    rem-int/lit16 p3, p3, 0x80

    .line 29
    .line 30
    sput p3, LVa/V9;->e:I

    .line 31
    .line 32
    :try_start_1
    move-object p3, v0

    .line 33
    check-cast p3, LVa/V9;

    .line 34
    .line 35
    invoke-virtual {p3, p1, p2, v4}, LVa/V9;->d(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    return v4

    .line 39
    :catchall_0
    move-exception p3

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return v4

    .line 42
    :goto_1
    invoke-static {v1, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    int-to-char v6, v6

    .line 47
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    shr-int/lit8 v7, v7, 0x10

    .line 52
    .line 53
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    cmp-long v8, v8, v2

    .line 58
    .line 59
    add-int/lit8 v8, v8, 0x15

    .line 60
    .line 61
    invoke-static {v7, v8, v6}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

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
    invoke-static {v5, v5}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    rsub-int/lit8 v8, v8, 0x7c

    .line 81
    .line 82
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    shr-int/lit8 v9, v9, 0x10

    .line 87
    .line 88
    rsub-int/lit8 v9, v9, 0x36

    .line 89
    .line 90
    invoke-static {v8, v9, v7}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-static {v6, v7, p3, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 99
    .line 100
    .line 101
    :cond_2
    if-eqz v0, :cond_4

    .line 102
    .line 103
    sget p3, LVa/V9;->f:I

    .line 104
    .line 105
    add-int/lit8 p3, p3, 0x45

    .line 106
    .line 107
    rem-int/lit16 v6, p3, 0x80

    .line 108
    .line 109
    sput v6, LVa/V9;->e:I

    .line 110
    .line 111
    rem-int/lit8 p3, p3, 0x2

    .line 112
    .line 113
    if-nez p3, :cond_3

    .line 114
    .line 115
    :try_start_2
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    return p1

    .line 120
    :cond_3
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    .line 121
    .line 122
    .line 123
    const/4 p3, 0x0

    .line 124
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    :catchall_1
    move-exception p3

    .line 126
    invoke-static {v5}, Landroid/os/Process;->getThreadPriority(I)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    add-int/lit8 v0, v0, 0x14

    .line 131
    .line 132
    shr-int/lit8 v0, v0, 0x6

    .line 133
    .line 134
    int-to-char v0, v0

    .line 135
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    rsub-int/lit8 v7, v7, 0x16

    .line 144
    .line 145
    invoke-static {v6, v7, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const/16 v6, 0x30

    .line 154
    .line 155
    invoke-static {v1, v6, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    add-int/2addr v1, v4

    .line 160
    int-to-char v1, v1

    .line 161
    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    add-int/lit16 v4, v4, 0x82

    .line 166
    .line 167
    invoke-static {v5, v5}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    cmp-long v2, v6, v2

    .line 172
    .line 173
    rsub-int/lit8 v2, v2, 0x37

    .line 174
    .line 175
    invoke-static {v4, v2, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v0, v1, p3, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 184
    .line 185
    .line 186
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    return p1
.end method

.method public final doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 8

    .line 1
    sget v0, LVa/V9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :goto_0
    const/4 v1, 0x0

    .line 27
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-char v2, v2

    .line 32
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    const-wide/16 v6, 0x0

    .line 41
    .line 42
    cmp-long v4, v4, v6

    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x15

    .line 45
    .line 46
    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    shr-int/lit8 v3, v3, 0x10

    .line 59
    .line 60
    int-to-char v3, v3

    .line 61
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    shr-int/lit8 v4, v4, 0x10

    .line 66
    .line 67
    rsub-int v4, v4, 0x20a

    .line 68
    .line 69
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    shr-int/lit8 v5, v5, 0x10

    .line 74
    .line 75
    rsub-int/lit8 v5, v5, 0x2b

    .line 76
    .line 77
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 86
    .line 87
    .line 88
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    sget v1, LVa/V9;->e:I

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0xb

    .line 95
    .line 96
    rem-int/lit16 v1, v1, 0x80

    .line 97
    .line 98
    sput v1, LVa/V9;->f:I

    .line 99
    .line 100
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 8

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V9;->e:I

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    iget-object v3, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 13
    .line 14
    invoke-virtual {v3, p1, p2, p3}, Landroid/webkit/WebViewClient;->onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    sget v3, LVa/V9;->f:I

    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x75

    .line 20
    .line 21
    rem-int/lit16 v3, v3, 0x80

    .line 22
    .line 23
    sput v3, LVa/V9;->e:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v3

    .line 27
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    int-to-char v4, v4

    .line 32
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    add-int/lit8 v5, v5, 0x14

    .line 37
    .line 38
    shr-int/lit8 v5, v5, 0x6

    .line 39
    .line 40
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, 0x0

    .line 45
    cmpl-float v6, v6, v7

    .line 46
    .line 47
    rsub-int/lit8 v6, v6, 0x17

    .line 48
    .line 49
    invoke-static {v5, v6, v4}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    cmp-long v5, v5, v0

    .line 62
    .line 63
    rsub-int v5, v5, 0x28c7

    .line 64
    .line 65
    int-to-char v5, v5

    .line 66
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    rsub-int v6, v6, 0x1c7

    .line 71
    .line 72
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    rsub-int/lit8 v7, v7, 0x27

    .line 77
    .line 78
    invoke-static {v6, v7, v5}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v4, v5, v3, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 87
    .line 88
    .line 89
    :goto_0
    :try_start_1
    iget-object v3, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    .line 91
    if-eqz v3, :cond_0

    .line 92
    .line 93
    sget v4, LVa/V9;->e:I

    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x45

    .line 96
    .line 97
    rem-int/lit16 v4, v4, 0x80

    .line 98
    .line 99
    sput v4, LVa/V9;->f:I

    .line 100
    .line 101
    :try_start_2
    invoke-virtual {v3, p1, p2, p3}, Landroid/webkit/WebViewClient;->onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catch_0
    move-exception p1

    .line 106
    goto :goto_2

    .line 107
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 108
    .line 109
    .line 110
    :goto_1
    return-void

    .line 111
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 112
    .line 113
    .line 114
    move-result-wide p2

    .line 115
    cmp-long p2, p2, v0

    .line 116
    .line 117
    rsub-int/lit8 p2, p2, 0x1

    .line 118
    .line 119
    int-to-char p2, p2

    .line 120
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    cmp-long p3, v3, v0

    .line 125
    .line 126
    rsub-int/lit8 p3, p3, 0x1

    .line 127
    .line 128
    const/16 v0, 0x30

    .line 129
    .line 130
    const-string v1, ""

    .line 131
    .line 132
    invoke-static {v1, v0, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    rsub-int/lit8 v0, v0, 0x15

    .line 137
    .line 138
    invoke-static {p3, v0, p2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-static {v1, v2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    int-to-char p3, p3

    .line 151
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    shr-int/lit8 v0, v0, 0x10

    .line 156
    .line 157
    add-int/lit16 v0, v0, 0x1ef

    .line 158
    .line 159
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    rsub-int/lit8 v1, v1, 0x1b

    .line 164
    .line 165
    invoke-static {v0, v1, p3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    invoke-static {p2, p3, p1, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 3
    .line 4
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-char v2, v2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v0, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    cmpl-float v3, v4, v3

    .line 20
    .line 21
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    add-int/lit8 v4, v4, 0x16

    .line 26
    .line 27
    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    cmp-long v3, v3, v5

    .line 42
    .line 43
    add-int/lit8 v3, v3, -0x1

    .line 44
    .line 45
    int-to-char v3, v3

    .line 46
    const/16 v4, 0x30

    .line 47
    .line 48
    const-string v5, ""

    .line 49
    .line 50
    invoke-static {v5, v4, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    rsub-int v4, v4, 0x12e

    .line 55
    .line 56
    invoke-static {v5}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/lit8 v5, v5, 0x24

    .line 61
    .line 62
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v1, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    sget v2, LVa/V9;->e:I

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x67

    .line 80
    .line 81
    rem-int/lit16 v3, v2, 0x80

    .line 82
    .line 83
    sput v3, LVa/V9;->f:I

    .line 84
    .line 85
    rem-int/lit8 v2, v2, 0x2

    .line 86
    .line 87
    if-nez v2, :cond_0

    .line 88
    .line 89
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    div-int/2addr p1, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget p1, LVa/V9;->f:I

    .line 103
    .line 104
    add-int/lit8 p1, p1, 0x71

    .line 105
    .line 106
    rem-int/lit16 p1, p1, 0x80

    .line 107
    .line 108
    sput p1, LVa/V9;->e:I

    .line 109
    .line 110
    :goto_1
    return-void
.end method

.method public final onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 7

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x2d

    .line 20
    .line 21
    div-int/2addr v0, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    shr-int/lit8 v1, v1, 0x8

    .line 34
    .line 35
    int-to-char v1, v1

    .line 36
    const-string v3, ""

    .line 37
    .line 38
    invoke-static {v3, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    shr-int/lit8 v4, v4, 0x10

    .line 47
    .line 48
    rsub-int/lit8 v4, v4, 0x16

    .line 49
    .line 50
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    cmp-long v3, v3, v5

    .line 65
    .line 66
    rsub-int v3, v3, 0x5535

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v5, 0x0

    .line 74
    cmpl-float v4, v4, v5

    .line 75
    .line 76
    rsub-int v4, v4, 0xea

    .line 77
    .line 78
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    rsub-int/lit8 v5, v5, 0x22

    .line 83
    .line 84
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    sget v1, LVa/V9;->e:I

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x17

    .line 102
    .line 103
    rem-int/lit16 v2, v1, 0x80

    .line 104
    .line 105
    sput v2, LVa/V9;->f:I

    .line 106
    .line 107
    rem-int/lit8 v1, v1, 0x2

    .line 108
    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget p1, LVa/V9;->e:I

    .line 115
    .line 116
    add-int/lit8 p1, p1, 0x1d

    .line 117
    .line 118
    rem-int/lit16 p1, p1, 0x80

    .line 119
    .line 120
    sput p1, LVa/V9;->f:I

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    throw p1

    .line 128
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sget p1, LVa/V9;->f:I

    .line 132
    .line 133
    add-int/lit8 p1, p1, 0x2d

    .line 134
    .line 135
    rem-int/lit16 p1, p1, 0x80

    .line 136
    .line 137
    sput p1, LVa/V9;->e:I

    .line 138
    .line 139
    :goto_2
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
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
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    cmpl-float v1, v1, v2

    .line 14
    .line 15
    int-to-char v1, v1

    .line 16
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    cmpl-float v3, v3, v2

    .line 21
    .line 22
    rsub-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    add-int/lit8 v5, v5, 0x16

    .line 30
    .line 31
    invoke-static {v3, v5, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v4, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    cmpl-float v2, v3, v2

    .line 44
    .line 45
    const v3, 0xb8dd

    .line 46
    .line 47
    .line 48
    add-int/2addr v2, v3

    .line 49
    int-to-char v2, v2

    .line 50
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    rsub-int v3, v3, 0x10c

    .line 55
    .line 56
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/lit8 v5, v5, 0x23

    .line 61
    .line 62
    invoke-static {v3, v5, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v1, v2, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    sget v1, LVa/V9;->e:I

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0xb

    .line 80
    .line 81
    rem-int/lit16 v1, v1, 0x80

    .line 82
    .line 83
    sput v1, LVa/V9;->f:I

    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget p1, LVa/V9;->e:I

    .line 93
    .line 94
    add-int/lit8 p1, p1, 0x5f

    .line 95
    .line 96
    rem-int/lit16 p2, p1, 0x80

    .line 97
    .line 98
    sput p2, LVa/V9;->f:I

    .line 99
    .line 100
    rem-int/lit8 p1, p1, 0x2

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    const/4 p1, 0x0

    .line 106
    throw p1
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/V9;->e:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x39

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/V9;->f:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v2, v2

    .line 22
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v4, 0x30

    .line 27
    .line 28
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/lit8 v4, v4, -0x1a

    .line 33
    .line 34
    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    int-to-byte v3, v3

    .line 47
    rsub-int v3, v3, 0x5534

    .line 48
    .line 49
    int-to-char v3, v3

    .line 50
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    shr-int/lit8 v4, v4, 0x16

    .line 55
    .line 56
    add-int/lit16 v4, v4, 0xea

    .line 57
    .line 58
    const-string v5, ""

    .line 59
    .line 60
    invoke-static {v5}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    add-int/lit8 v5, v5, 0x23

    .line 65
    .line 66
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    sget v1, LVa/V9;->e:I

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x45

    .line 84
    .line 85
    rem-int/lit16 v2, v1, 0x80

    .line 86
    .line 87
    sput v2, LVa/V9;->f:I

    .line 88
    .line 89
    rem-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    if-eqz v1, :cond_0

    .line 92
    .line 93
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    throw p1

    .line 102
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 8

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/16 v2, 0x30

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-char v1, v1

    .line 36
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    add-int/lit8 v5, v5, -0x30

    .line 41
    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    shr-int/lit8 v6, v6, 0x10

    .line 47
    .line 48
    rsub-int/lit8 v6, v6, 0x16

    .line 49
    .line 50
    invoke-static {v5, v6, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    shr-int/lit8 v5, v5, 0x10

    .line 63
    .line 64
    const v6, 0xbbeb

    .line 65
    .line 66
    .line 67
    sub-int/2addr v6, v5

    .line 68
    int-to-char v5, v6

    .line 69
    invoke-static {v4, v4}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    add-int/lit16 v6, v6, 0x25c

    .line 74
    .line 75
    invoke-static {v3, v2, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    add-int/lit8 v7, v7, 0x31

    .line 80
    .line 81
    invoke-static {v6, v7, v5}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v1, v5, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 90
    .line 91
    .line 92
    :goto_1
    :try_start_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    goto :goto_3

    .line 102
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    .line 104
    .line 105
    sget p1, LVa/V9;->e:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x2f

    .line 108
    .line 109
    rem-int/lit16 p1, p1, 0x80

    .line 110
    .line 111
    sput p1, LVa/V9;->f:I

    .line 112
    .line 113
    :goto_2
    return-void

    .line 114
    :goto_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    shr-int/lit8 p2, p2, 0x10

    .line 119
    .line 120
    int-to-char p2, p2

    .line 121
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    add-int/lit8 v1, v1, -0x1a

    .line 130
    .line 131
    invoke-static {v0, v1, p2}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-static {v3, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/lit16 v0, v0, 0x389c

    .line 144
    .line 145
    int-to-char v0, v0

    .line 146
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    const/4 v2, 0x0

    .line 151
    cmpl-float v1, v1, v2

    .line 152
    .line 153
    add-int/lit16 v1, v1, 0x28c

    .line 154
    .line 155
    invoke-static {v3}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    add-int/lit8 v2, v2, 0x33

    .line 160
    .line 161
    invoke-static {v1, v2, v0}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p2, v0, p1, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    sget v0, LVa/V9;->f:I

    add-int/lit8 v0, v0, 0x9

    rem-int/lit16 v0, v0, 0x80

    sput v0, LVa/V9;->e:I

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    int-to-char v1, v1

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x16

    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v3

    shr-int/lit8 v3, v3, 0x8

    add-int/lit16 v3, v3, 0x25d9

    int-to-char v3, v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    rsub-int v4, v4, 0x1a5

    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    add-int/lit8 v5, v5, 0x24

    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 4
    :goto_0
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    sget p1, LVa/V9;->e:I

    add-int/lit8 p1, p1, 0x5b

    rem-int/lit16 p2, p1, 0x80

    sput p2, LVa/V9;->f:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 7

    .line 7
    sget v0, LVa/V9;->f:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v1, v0, 0x80

    sput v1, LVa/V9;->e:I

    rem-int/lit8 v0, v0, 0x2

    const/16 v1, 0x24

    iget-object v2, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 8
    :try_start_0
    invoke-virtual {v2, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    const/4 v0, 0x4

    div-int/2addr v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    const/16 v2, 0x30

    .line 9
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v4

    sub-int/2addr v2, v4

    int-to-char v2, v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v4

    const-string v5, ""

    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x16

    invoke-static {v4, v5, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int v4, v4, 0x25d9

    int-to-char v4, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    add-int/lit16 v5, v5, 0x1a4

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x24

    invoke-static {v5, v6, v4}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v0, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 10
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_2

    .line 11
    sget v2, LVa/V9;->e:I

    add-int/lit8 v2, v2, 0x13

    rem-int/lit16 v4, v2, 0x80

    sput v4, LVa/V9;->f:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_1

    .line 12
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    div-int/2addr v1, v3

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    return-void

    .line 13
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    return-void
.end method

.method public final onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget v0, LVa/V9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget v0, LVa/V9;->f:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x23

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/V9;->e:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    cmpl-float v1, v2, v1

    .line 30
    .line 31
    int-to-char v1, v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    shr-int/lit8 v4, v4, 0x18

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x16

    .line 44
    .line 45
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    const-string v3, ""

    .line 54
    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    int-to-char v4, v4

    .line 60
    const/16 v5, 0x30

    .line 61
    .line 62
    invoke-static {v3, v5, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    rsub-int v3, v3, 0x2be

    .line 67
    .line 68
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    rsub-int/lit8 v5, v5, 0x2e

    .line 73
    .line 74
    invoke-static {v3, v5, v4}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    sget v1, LVa/V9;->f:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x77

    .line 92
    .line 93
    rem-int/lit16 v1, v1, 0x80

    .line 94
    .line 95
    sput v1, LVa/V9;->e:I

    .line 96
    .line 97
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
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
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

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
    const-string v2, ""

    .line 16
    .line 17
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const v4, 0x1000016

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    add-int/2addr v6, v4

    .line 30
    invoke-static {v3, v6, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    shr-int/lit8 v3, v3, 0x10

    .line 43
    .line 44
    const v4, 0xa9c9

    .line 45
    .line 46
    .line 47
    add-int/2addr v3, v4

    .line 48
    int-to-char v3, v3

    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    shr-int/lit8 v4, v4, 0x10

    .line 54
    .line 55
    rsub-int v4, v4, 0x38e

    .line 56
    .line 57
    const/16 v6, 0x30

    .line 58
    .line 59
    invoke-static {v2, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/lit8 v2, v2, 0x29

    .line 64
    .line 65
    invoke-static {v4, v2, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v1, v2, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 77
    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    sget v1, LVa/V9;->f:I

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x13

    .line 83
    .line 84
    rem-int/lit16 v1, v1, 0x80

    .line 85
    .line 86
    sput v1, LVa/V9;->e:I

    .line 87
    .line 88
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 89
    .line 90
    .line 91
    sget p1, LVa/V9;->f:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x33

    .line 94
    .line 95
    rem-int/lit16 p1, p1, 0x80

    .line 96
    .line 97
    sput p1, LVa/V9;->e:I

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    return-void
.end method

.method public final onReceivedLoginRequest(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x69

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V9;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedLoginRequest(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    shr-int/lit8 v2, v2, 0x10

    .line 22
    .line 23
    int-to-char v2, v2

    .line 24
    invoke-static {v0, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    rsub-int/lit8 v4, v4, 0x16

    .line 33
    .line 34
    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    shr-int/lit8 v3, v3, 0x10

    .line 47
    .line 48
    int-to-char v3, v3

    .line 49
    const-string v4, ""

    .line 50
    .line 51
    invoke-static {v4, v0, v0}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    rsub-int v4, v4, 0x363

    .line 56
    .line 57
    invoke-static {v0, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    add-int/lit8 v5, v5, 0x2b

    .line 62
    .line 63
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-object v1, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    sget v2, LVa/V9;->e:I

    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x3b

    .line 81
    .line 82
    rem-int/lit16 v2, v2, 0x80

    .line 83
    .line 84
    sput v2, LVa/V9;->f:I

    .line 85
    .line 86
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedLoginRequest(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sget p1, LVa/V9;->e:I

    .line 90
    .line 91
    add-int/lit8 p1, p1, 0x11

    .line 92
    .line 93
    rem-int/lit16 p2, p1, 0x80

    .line 94
    .line 95
    sput p2, LVa/V9;->f:I

    .line 96
    .line 97
    rem-int/lit8 p1, p1, 0x2

    .line 98
    .line 99
    if-nez p1, :cond_0

    .line 100
    .line 101
    const/16 p1, 0x41

    .line 102
    .line 103
    div-int/2addr p1, v0

    .line 104
    :cond_0
    return-void

    .line 105
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedLoginRequest(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 7

    .line 1
    sget v0, LVa/V9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

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
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

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
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-wide/16 v5, -0x1

    .line 32
    .line 33
    cmp-long v1, v3, v5

    .line 34
    .line 35
    rsub-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    int-to-char v1, v1

    .line 38
    const/high16 v3, -0x1000000

    .line 39
    .line 40
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    sub-int/2addr v3, v4

    .line 45
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    add-int/lit8 v4, v4, 0x16

    .line 50
    .line 51
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    shr-int/lit8 v3, v3, 0x10

    .line 64
    .line 65
    int-to-char v3, v3

    .line 66
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    shr-int/lit8 v4, v4, 0x10

    .line 71
    .line 72
    rsub-int v4, v4, 0x235

    .line 73
    .line 74
    const v5, -0xffffd9

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    sub-int/2addr v5, v6

    .line 82
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    sget v1, LVa/V9;->f:I

    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x77

    .line 100
    .line 101
    rem-int/lit16 v3, v1, 0x80

    .line 102
    .line 103
    sput v3, LVa/V9;->e:I

    .line 104
    .line 105
    rem-int/lit8 v1, v1, 0x2

    .line 106
    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 110
    .line 111
    .line 112
    const/16 p1, 0xf

    .line 113
    .line 114
    div-int/2addr p1, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 117
    .line 118
    .line 119
    :goto_2
    return-void

    .line 120
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 6

    .line 1
    sget v0, LVa/V9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V9;->f:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, LU1/b;->w(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)V
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
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v2, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    cmpl-float v3, v4, v3

    .line 30
    .line 31
    const-string v4, ""

    .line 32
    .line 33
    const/16 v5, 0x30

    .line 34
    .line 35
    invoke-static {v4, v5, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    add-int/lit8 v4, v4, 0x17

    .line 40
    .line 41
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    int-to-char v3, v3

    .line 54
    invoke-static {v5}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    rsub-int v4, v4, 0x3e6

    .line 59
    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    shr-int/lit8 v5, v5, 0x8

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x28

    .line 67
    .line 68
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 80
    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    sget v1, LVa/V9;->e:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x59

    .line 86
    .line 87
    rem-int/lit16 v1, v1, 0x80

    .line 88
    .line 89
    sput v1, LVa/V9;->f:I

    .line 90
    .line 91
    invoke-static {v0, p1, p2}, Lcom/dexterous/flutterlocalnotifications/a;->u(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1

    .line 96
    :cond_0
    const/4 p1, 0x1

    .line 97
    return p1
.end method

.method public final onScaleChanged(Landroid/webkit/WebView;FF)V
    .locals 7

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x56

    .line 20
    .line 21
    div-int/2addr v0, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :goto_0
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    int-to-char v1, v1

    .line 34
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    shr-int/lit8 v3, v3, 0x10

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/lit8 v4, v4, 0x16

    .line 47
    .line 48
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    rsub-int v3, v3, 0x2e15

    .line 61
    .line 62
    int-to-char v3, v3

    .line 63
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    shr-int/lit8 v4, v4, 0x10

    .line 68
    .line 69
    rsub-int v4, v4, 0x340

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    invoke-static {v5, v5}, Landroid/graphics/PointF;->length(FF)F

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    cmpl-float v5, v6, v5

    .line 77
    .line 78
    add-int/lit8 v5, v5, 0x23

    .line 79
    .line 80
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 89
    .line 90
    .line 91
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    sget v1, LVa/V9;->e:I

    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x69

    .line 98
    .line 99
    rem-int/lit16 v1, v1, 0x80

    .line 100
    .line 101
    sput v1, LVa/V9;->f:I

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    .line 104
    .line 105
    .line 106
    sget p1, LVa/V9;->e:I

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x6b

    .line 109
    .line 110
    rem-int/lit16 p1, p1, 0x80

    .line 111
    .line 112
    sput p1, LVa/V9;->f:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 9

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x41

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x3b

    .line 20
    .line 21
    div-int/2addr v0, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Landroid/webkit/WebViewClient;->onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :goto_0
    const-string v1, ""

    .line 30
    .line 31
    const/16 v3, 0x30

    .line 32
    .line 33
    invoke-static {v1, v3, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    rsub-int/lit8 v4, v4, -0x1

    .line 38
    .line 39
    int-to-char v4, v4

    .line 40
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/4 v6, 0x0

    .line 45
    cmpl-float v5, v5, v6

    .line 46
    .line 47
    rsub-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    const-wide/16 v6, 0x0

    .line 50
    .line 51
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    rsub-int/lit8 v8, v8, 0x16

    .line 56
    .line 57
    invoke-static {v5, v8, v4}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const v5, 0xdad9

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    add-int/2addr v8, v5

    .line 73
    int-to-char v5, v8

    .line 74
    invoke-static {v1, v3, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/lit16 v1, v1, 0x17e

    .line 79
    .line 80
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-int/lit8 v3, v3, 0x28

    .line 85
    .line 86
    invoke-static {v1, v3, v5}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v4, v1, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    sget v1, LVa/V9;->e:I

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x25

    .line 104
    .line 105
    rem-int/lit16 v2, v1, 0x80

    .line 106
    .line 107
    sput v2, LVa/V9;->f:I

    .line 108
    .line 109
    rem-int/lit8 v1, v1, 0x2

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    throw p1

    .line 122
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onTooManyRedirects(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
    .locals 6

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V9;->e:I

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
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
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v2, v2

    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    shr-int/lit8 v3, v3, 0x18

    .line 27
    .line 28
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/lit8 v4, v4, 0x17

    .line 33
    .line 34
    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

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
    const-string v3, ""

    .line 43
    .line 44
    invoke-static {v3, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    rsub-int v4, v4, 0x20da

    .line 49
    .line 50
    int-to-char v4, v4

    .line 51
    invoke-static {v3, v3, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    rsub-int v3, v3, 0x318

    .line 56
    .line 57
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    rsub-int/lit8 v5, v5, 0x28

    .line 62
    .line 63
    invoke-static {v3, v5, v4}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    sget v1, LVa/V9;->f:I

    .line 79
    .line 80
    add-int/lit8 v1, v1, 0x7b

    .line 81
    .line 82
    rem-int/lit16 v2, v1, 0x80

    .line 83
    .line 84
    sput v2, LVa/V9;->e:I

    .line 85
    .line 86
    rem-int/lit8 v1, v1, 0x2

    .line 87
    .line 88
    if-nez v1, :cond_0

    .line 89
    .line 90
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    throw p1

    .line 99
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 7

    .line 7
    sget v0, LVa/V9;->e:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v1, v0, 0x80

    sput v1, LVa/V9;->f:I

    rem-int/lit8 v0, v0, 0x2

    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 8
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    const/16 v0, 0x18

    div-int/2addr v0, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    const-wide/16 v3, 0x0

    .line 9
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v1

    int-to-char v1, v1

    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x14

    shr-int/lit8 v6, v6, 0x6

    add-int/lit8 v6, v6, 0x16

    invoke-static {v5, v6, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    cmp-long v3, v5, v3

    add-int/lit16 v3, v3, 0x4008

    int-to-char v3, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int v4, v4, 0x152

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v5

    shr-int/lit8 v5, v5, 0x10

    rsub-int/lit8 v5, v5, 0x2b

    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 10
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_1

    .line 11
    sget v1, LVa/V9;->e:I

    add-int/lit8 v1, v1, 0x4b

    rem-int/lit16 v1, v1, 0x80

    sput v1, LVa/V9;->f:I

    .line 12
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    .line 13
    sget p2, LVa/V9;->e:I

    add-int/lit8 p2, p2, 0x45

    rem-int/lit16 p2, p2, 0x80

    sput p2, LVa/V9;->f:I

    return-object p1

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 9

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    int-to-char v2, v2

    invoke-static {v0}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v7

    cmp-long v4, v7, v5

    add-int/lit8 v4, v4, 0x15

    invoke-static {v3, v4, v2}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v0}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v3

    add-int/lit16 v3, v3, 0x4009

    int-to-char v3, v3

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    rsub-int v4, v4, 0x153

    invoke-static {v0, v0}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v5

    add-int/lit8 v5, v5, 0x2b

    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 3
    :goto_0
    iget-object v1, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    if-eqz v1, :cond_0

    .line 4
    sget v0, LVa/V9;->e:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v0, v0, 0x80

    sput v0, LVa/V9;->f:I

    .line 5
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    .line 6
    sget p2, LVa/V9;->f:I

    add-int/lit8 p2, p2, 0x1b

    rem-int/lit16 p2, p2, 0x80

    sput p2, LVa/V9;->e:I

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    sget p2, LVa/V9;->e:I

    add-int/lit8 p2, p2, 0x1b

    rem-int/lit16 v1, p2, 0x80

    sput v1, LVa/V9;->f:I

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    const/16 p2, 0x14

    div-int/2addr p2, v0

    :cond_1
    return-object p1
.end method

.method public final shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    sget v0, LVa/V9;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/V9;->b:Landroid/webkit/WebViewClient;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x1e

    .line 20
    .line 21
    div-int/2addr v0, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    shr-int/lit8 v1, v1, 0x10

    .line 34
    .line 35
    int-to-char v1, v1

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    shr-int/lit8 v3, v3, 0x10

    .line 41
    .line 42
    const-string v4, ""

    .line 43
    .line 44
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    rsub-int/lit8 v4, v4, 0x15

    .line 49
    .line 50
    invoke-static {v3, v4, v1}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    int-to-char v3, v3

    .line 63
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    rsub-int v4, v4, 0x2ed

    .line 68
    .line 69
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    rsub-int/lit8 v5, v5, 0x2b

    .line 74
    .line 75
    invoke-static {v4, v5, v3}, LVa/V9;->c(IIC)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget-object v0, p0, LVa/V9;->a:Landroid/webkit/WebViewClient;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    sget v1, LVa/V9;->e:I

    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x3d

    .line 93
    .line 94
    rem-int/lit16 v2, v1, 0x80

    .line 95
    .line 96
    sput v2, LVa/V9;->f:I

    .line 97
    .line 98
    rem-int/lit8 v1, v1, 0x2

    .line 99
    .line 100
    if-eqz v1, :cond_1

    .line 101
    .line 102
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    return p1

    .line 107
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    throw p1

    .line 112
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    .line 2
    sget v0, LVa/V9;->f:I

    add-int/lit8 v0, v0, 0x35

    rem-int/lit16 v1, v0, 0x80

    sput v1, LVa/V9;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, LVa/V9;->d(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Z)Z

    move-result p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    sget p2, LVa/V9;->f:I

    add-int/lit8 p2, p2, 0x59

    rem-int/lit16 v0, p2, 0x80

    sput v0, LVa/V9;->e:I

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    throw p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LVa/V9;->e:I

    add-int/lit8 v0, v0, 0x1d

    rem-int/lit16 v1, v0, 0x80

    sput v1, LVa/V9;->f:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, p2, v0}, LVa/V9;->b(Landroid/webkit/WebView;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
