.class public final LVa/qa;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field public static a:I = 0x0

.field public static b:I = 0x1


# direct methods
.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, -0x1367fc096663bcceL    # -1.2935648951175612E215

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    sget v0, LVa/qa;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/qa;->a:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    const/16 v1, 0x30

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    rsub-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    const-string v1, "\udd2d\udd7d\u446d\uc040\u070d\u4665\u7472\ubda3\ud1a8\u0bd6\u534c\ua24a\uc4d2\u18dd\u5fd1\u973d\ufb12\u2d89\u6ca3\u9bf7\uee68\u3246\u79f9\u888b\ue28b"

    .line 27
    .line 28
    invoke-static {v0, v1}, LVa/qa;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget v0, LVa/qa;->a:I

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x5f

    .line 42
    .line 43
    rem-int/lit16 v0, v0, 0x80

    .line 44
    .line 45
    sput v0, LVa/qa;->b:I

    .line 46
    .line 47
    :cond_0
    const-string v0, "\u5658\u561b\u46ff\u46ae\u059f\uc08f\u1c1d\ud5ca\u5ac4\u0940\ud5a2\uca17\u4f89\u1a7f\ud916\uff7e\u7020\u2f3c\uea54\uf3d3\u6536\u30e2\uff7e\ue08b\u69f5\uc5bd\u80ab\u1530\u1abc\uc94e\u959a\u0a30\u0f56\uda0a\u9901\u3f67\u3077\uefff\uaa6f\u33e3\u253b\uf0a0\ubfbb\u20a3\u29dc\u85b8\u40c2\u552f\udae0\u8965\u5400\u4a7a\ucf75\u9a2c\u5938\u7eb2\uf050\uafee\u6a67\u73fa\ue484\ub0fd\u7f8c\u60fa\ue98c\u4435\u00e6\u9516\u9a80\u4919\u1463"

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1, v0}, LVa/qa;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    sget p1, LVa/qa;->b:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x3f

    .line 4
    .line 5
    rem-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    sput p1, LVa/qa;->a:I

    .line 8
    .line 9
    return-void
.end method
