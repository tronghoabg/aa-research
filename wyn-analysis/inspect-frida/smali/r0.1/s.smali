.class public final Lr0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/s;

.field public static b:LL0/i;

.field public static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr0/s;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr0/s;->a:Lr0/s;

    .line 7
    .line 8
    sget-object v0, LL0/i;->a:LL0/i;

    .line 9
    .line 10
    sput-object v0, Lr0/s;->b:LL0/i;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Lr0/t;IIF)V
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, LA6/h;->b(II)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    invoke-virtual {p0}, Lr0/t;->g()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget v2, LL0/g;->c:I

    .line 15
    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shr-long v3, p1, v2

    .line 19
    .line 20
    long-to-int v3, v3

    .line 21
    shr-long v4, v0, v2

    .line 22
    .line 23
    long-to-int v2, v4

    .line 24
    add-int/2addr v3, v2

    .line 25
    const-wide v4, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr p1, v4

    .line 31
    long-to-int p1, p1

    .line 32
    and-long/2addr v0, v4

    .line 33
    long-to-int p2, v0

    .line 34
    add-int/2addr p1, p2

    .line 35
    invoke-static {v3, p1}, LA6/h;->b(II)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, p2, p3, v0}, Lr0/t;->m(JFLtf/l;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static b(Lr0/t;JF)V
    .locals 6

    .line 1
    const-string v0, "$this$place"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lr0/t;->g()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sget v2, LL0/g;->c:I

    .line 11
    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    shr-long v3, p1, v2

    .line 15
    .line 16
    long-to-int v3, v3

    .line 17
    shr-long v4, v0, v2

    .line 18
    .line 19
    long-to-int v2, v4

    .line 20
    add-int/2addr v3, v2

    .line 21
    const-wide v4, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr p1, v4

    .line 27
    long-to-int p1, p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    add-int/2addr p1, p2

    .line 31
    invoke-static {v3, p1}, LA6/h;->b(II)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, p1, p2, p3, v0}, Lr0/t;->m(JFLtf/l;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static c(Lr0/s;Lr0/t;II)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "<this>"

    .line 5
    .line 6
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p2, p3}, LA6/h;->b(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    sget-object p0, Lr0/s;->b:LL0/i;

    .line 14
    .line 15
    sget-object v0, LL0/i;->a:LL0/i;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/16 v4, 0x20

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eq p0, v0, :cond_1

    .line 27
    .line 28
    sget p0, Lr0/s;->c:I

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v6, p1, Lr0/t;->c:J

    .line 34
    .line 35
    shr-long/2addr v6, v4

    .line 36
    long-to-int v0, v6

    .line 37
    sub-int/2addr p0, v0

    .line 38
    sget v0, LL0/g;->c:I

    .line 39
    .line 40
    shr-long v6, p2, v4

    .line 41
    .line 42
    long-to-int v0, v6

    .line 43
    sub-int/2addr p0, v0

    .line 44
    and-long/2addr p2, v2

    .line 45
    long-to-int p2, p2

    .line 46
    invoke-static {p0, p2}, LA6/h;->b(II)J

    .line 47
    .line 48
    .line 49
    move-result-wide p2

    .line 50
    invoke-virtual {p1}, Lr0/t;->g()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    shr-long v8, p2, v4

    .line 55
    .line 56
    long-to-int p0, v8

    .line 57
    shr-long v8, v6, v4

    .line 58
    .line 59
    long-to-int v0, v8

    .line 60
    add-int/2addr p0, v0

    .line 61
    and-long/2addr p2, v2

    .line 62
    long-to-int p2, p2

    .line 63
    and-long/2addr v2, v6

    .line 64
    long-to-int p3, v2

    .line 65
    add-int/2addr p2, p3

    .line 66
    invoke-static {p0, p2}, LA6/h;->b(II)J

    .line 67
    .line 68
    .line 69
    move-result-wide p2

    .line 70
    invoke-virtual {p1, p2, p3, v1, v5}, Lr0/t;->m(JFLtf/l;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lr0/t;->g()J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    sget p0, LL0/g;->c:I

    .line 79
    .line 80
    shr-long v8, p2, v4

    .line 81
    .line 82
    long-to-int p0, v8

    .line 83
    shr-long v8, v6, v4

    .line 84
    .line 85
    long-to-int v0, v8

    .line 86
    add-int/2addr p0, v0

    .line 87
    and-long/2addr p2, v2

    .line 88
    long-to-int p2, p2

    .line 89
    and-long/2addr v2, v6

    .line 90
    long-to-int p3, v2

    .line 91
    add-int/2addr p2, p3

    .line 92
    invoke-static {p0, p2}, LA6/h;->b(II)J

    .line 93
    .line 94
    .line 95
    move-result-wide p2

    .line 96
    invoke-virtual {p1, p2, p3, v1, v5}, Lr0/t;->m(JFLtf/l;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public static d(Lr0/s;Lr0/t;)V
    .locals 12

    .line 1
    sget v0, Lr0/v;->b:I

    .line 2
    .line 3
    sget-object v0, Lr0/u;->j:Lr0/u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string p0, "<this>"

    .line 9
    .line 10
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p0, p0}, LA6/h;->b(II)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    sget-object p0, Lr0/s;->b:LL0/i;

    .line 19
    .line 20
    sget-object v3, LL0/i;->a:LL0/i;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const-wide v5, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/16 v7, 0x20

    .line 29
    .line 30
    if-eq p0, v3, :cond_1

    .line 31
    .line 32
    sget p0, Lr0/s;->c:I

    .line 33
    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-wide v8, p1, Lr0/t;->c:J

    .line 38
    .line 39
    shr-long/2addr v8, v7

    .line 40
    long-to-int v3, v8

    .line 41
    sub-int/2addr p0, v3

    .line 42
    sget v3, LL0/g;->c:I

    .line 43
    .line 44
    shr-long v8, v1, v7

    .line 45
    .line 46
    long-to-int v3, v8

    .line 47
    sub-int/2addr p0, v3

    .line 48
    and-long/2addr v1, v5

    .line 49
    long-to-int v1, v1

    .line 50
    invoke-static {p0, v1}, LA6/h;->b(II)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {p1}, Lr0/t;->g()J

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    shr-long v10, v1, v7

    .line 59
    .line 60
    long-to-int p0, v10

    .line 61
    shr-long v10, v8, v7

    .line 62
    .line 63
    long-to-int v3, v10

    .line 64
    add-int/2addr p0, v3

    .line 65
    and-long/2addr v1, v5

    .line 66
    long-to-int v1, v1

    .line 67
    and-long v2, v8, v5

    .line 68
    .line 69
    long-to-int v2, v2

    .line 70
    add-int/2addr v1, v2

    .line 71
    invoke-static {p0, v1}, LA6/h;->b(II)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-virtual {p1, v1, v2, v4, v0}, Lr0/t;->m(JFLtf/l;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lr0/t;->g()J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    sget p0, LL0/g;->c:I

    .line 84
    .line 85
    shr-long v10, v1, v7

    .line 86
    .line 87
    long-to-int p0, v10

    .line 88
    shr-long v10, v8, v7

    .line 89
    .line 90
    long-to-int v3, v10

    .line 91
    add-int/2addr p0, v3

    .line 92
    and-long/2addr v1, v5

    .line 93
    long-to-int v1, v1

    .line 94
    and-long v2, v8, v5

    .line 95
    .line 96
    long-to-int v2, v2

    .line 97
    add-int/2addr v1, v2

    .line 98
    invoke-static {p0, v1}, LA6/h;->b(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide v1

    .line 102
    invoke-virtual {p1, v1, v2, v4, v0}, Lr0/t;->m(JFLtf/l;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static e(Lr0/s;Lr0/t;Ltf/l;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "layerBlock"

    .line 5
    .line 6
    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-static {p0, p0}, LA6/h;->b(II)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p1}, Lr0/t;->g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    sget p0, LL0/g;->c:I

    .line 19
    .line 20
    const/16 p0, 0x20

    .line 21
    .line 22
    shr-long v4, v0, p0

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    shr-long v5, v2, p0

    .line 26
    .line 27
    long-to-int p0, v5

    .line 28
    add-int/2addr v4, p0

    .line 29
    const-wide v5, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v5

    .line 35
    long-to-int p0, v0

    .line 36
    and-long v0, v2, v5

    .line 37
    .line 38
    long-to-int v0, v0

    .line 39
    add-int/2addr p0, v0

    .line 40
    invoke-static {v4, p0}, LA6/h;->b(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    const/4 p0, 0x0

    .line 45
    invoke-virtual {p1, v0, v1, p0, p2}, Lr0/t;->m(JFLtf/l;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static f(Lr0/t;JFLtf/l;)V
    .locals 6

    .line 1
    const-string v0, "$this$placeWithLayer"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "layerBlock"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lr0/t;->g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sget v2, LL0/g;->c:I

    .line 16
    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    shr-long v3, p1, v2

    .line 20
    .line 21
    long-to-int v3, v3

    .line 22
    shr-long v4, v0, v2

    .line 23
    .line 24
    long-to-int v2, v4

    .line 25
    add-int/2addr v3, v2

    .line 26
    const-wide v4, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr p1, v4

    .line 32
    long-to-int p1, p1

    .line 33
    and-long/2addr v0, v4

    .line 34
    long-to-int p2, v0

    .line 35
    add-int/2addr p1, p2

    .line 36
    invoke-static {v3, p1}, LA6/h;->b(II)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    invoke-virtual {p0, p1, p2, p3, p4}, Lr0/t;->m(JFLtf/l;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
