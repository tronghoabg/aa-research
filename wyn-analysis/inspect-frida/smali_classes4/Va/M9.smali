.class public final LVa/M9;
.super LVa/G9;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


# static fields
.field public static final c:[C


# instance fields
.field public b:LVa/L9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/M9;->c:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0xd7s
        0xf6s
        0xd1s
        0xees
        0xf7s
        0xd4s
        0xf1s
        0xfbs
        0xfcs
        0xeds
        0xfas
        0xccs
        0xebs
        0xe9s
        0xcds
        0xa8s
        0xf5s
        0xdcs
        0xeas
    .end array-data
.end method

.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/M9;->c:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit16 v4, v4, -0x88

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method


# virtual methods
.method public final onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LVa/M9;->b:LVa/L9;

    .line 3
    .line 4
    invoke-interface {v1, p0, p1, p2, p3}, LVa/L9;->a(LVa/M9;Landroid/media/MediaPlayer;II)Z
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
    const-string v2, ""

    .line 10
    .line 11
    const/16 v3, 0x30

    .line 12
    .line 13
    invoke-static {v2, v3, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit16 v2, v2, 0x80

    .line 18
    .line 19
    const-string v3, "\u008b\u0085\u0089\u008e\u008b\u0085\u008d\u008a\u008c\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081"

    .line 20
    .line 21
    invoke-static {v2, v3}, LVa/M9;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, -0xffff81

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sub-int/2addr v3, v4

    .line 37
    const-string v4, "\u0085\u0084\u0082\u0083\u0082\u0085\u0090\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0093\u0092\u0091\u0090\u0082\u0087\u0090\u008b\u0085\u008b\u008b\u008f"

    .line 38
    .line 39
    invoke-static {v3, v4}, LVa/M9;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, LVa/G9;->a:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    check-cast v1, Landroid/media/MediaPlayer$OnInfoListener;

    .line 55
    .line 56
    invoke-interface {v1, p1, p2, p3}, Landroid/media/MediaPlayer$OnInfoListener;->onInfo(Landroid/media/MediaPlayer;II)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_0
    return v0
.end method
