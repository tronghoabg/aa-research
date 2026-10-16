.class public abstract LVa/d9;
.super LVa/c9;
.source "SourceFile"


# static fields
.field public static final e:[C

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final d:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/16 v1, 0x65

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-char v1, v0, v2

    .line 8
    .line 9
    sput-object v0, LVa/d9;->e:[C

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, LVa/d9;->d:B

    .line 5
    .line 6
    return-void
.end method

.method public static e(ILjava/lang/StringBuilder;)V
    .locals 9

    .line 1
    sget v0, LVa/d9;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/d9;->f:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v1, p0, :cond_1

    .line 12
    .line 13
    sget v2, LVa/d9;->g:I

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    rem-int/lit16 v2, v2, 0x80

    .line 18
    .line 19
    sput v2, LVa/d9;->f:I

    .line 20
    .line 21
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    rsub-int/lit8 v2, v2, 0x7f

    .line 26
    .line 27
    const-string v3, "\u0081\u0081"

    .line 28
    .line 29
    const-string v4, "ISO-8859-1"

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, LVa/a;->x:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v4

    .line 38
    :try_start_0
    sget-object v5, LVa/d9;->e:[C

    .line 39
    .line 40
    array-length v6, v3

    .line 41
    sput v6, LVa/a;->w:I

    .line 42
    .line 43
    new-array v6, v6, [C

    .line 44
    .line 45
    sput v0, LVa/a;->v:I

    .line 46
    .line 47
    :goto_1
    sget v7, LVa/a;->v:I

    .line 48
    .line 49
    sget v8, LVa/a;->w:I

    .line 50
    .line 51
    if-ge v7, v8, :cond_0

    .line 52
    .line 53
    add-int/lit8 v8, v8, -0x1

    .line 54
    .line 55
    sub-int/2addr v8, v7

    .line 56
    aget-byte v8, v3, v8

    .line 57
    .line 58
    add-int/2addr v8, v2

    .line 59
    aget-char v8, v5, v8

    .line 60
    .line 61
    add-int/lit8 v8, v8, -0x45

    .line 62
    .line 63
    int-to-char v8, v8

    .line 64
    aput-char v8, v6, v7

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    sput v7, LVa/a;->v:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v2, v6}, Ljava/lang/String;-><init>([C)V

    .line 76
    .line 77
    .line 78
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :goto_2
    monitor-exit v4

    .line 90
    throw p0

    .line 91
    :cond_1
    sget p0, LVa/d9;->f:I

    .line 92
    .line 93
    add-int/lit8 p0, p0, 0x45

    .line 94
    .line 95
    rem-int/lit16 p1, p0, 0x80

    .line 96
    .line 97
    sput p1, LVa/d9;->g:I

    .line 98
    .line 99
    rem-int/lit8 p0, p0, 0x2

    .line 100
    .line 101
    if-eqz p0, :cond_2

    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    const/4 p0, 0x0

    .line 105
    throw p0
.end method
