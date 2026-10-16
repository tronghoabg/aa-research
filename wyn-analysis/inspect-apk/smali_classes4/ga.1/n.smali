.class public final Lga/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lx1/e;

.field public static final d:Lx1/e;

.field public static final e:Lx1/e;

.field public static final f:Lx1/e;

.field public static final g:Lx1/e;


# instance fields
.field public final a:Lu1/i;

.field public b:Lga/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "firebase_sessions_enabled"

    .line 2
    .line 3
    invoke-static {v0}, La/a;->k(Ljava/lang/String;)Lx1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lga/n;->c:Lx1/e;

    .line 8
    .line 9
    new-instance v0, Lx1/e;

    .line 10
    .line 11
    const-string v1, "firebase_sessions_sampling_rate"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lga/n;->d:Lx1/e;

    .line 17
    .line 18
    new-instance v0, Lx1/e;

    .line 19
    .line 20
    const-string v1, "firebase_sessions_restart_timeout"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lga/n;->e:Lx1/e;

    .line 26
    .line 27
    new-instance v0, Lx1/e;

    .line 28
    .line 29
    const-string v1, "firebase_sessions_cache_duration"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lga/n;->f:Lx1/e;

    .line 35
    .line 36
    new-instance v0, Lx1/e;

    .line 37
    .line 38
    const-string v1, "firebase_sessions_cache_updated_time"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lga/n;->g:Lx1/e;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Lu1/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lga/n;->a:Lu1/i;

    .line 5
    .line 6
    new-instance p1, Lga/k;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Lga/k;-><init>(Lga/n;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lga/n;Lx1/b;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lga/f;

    .line 5
    .line 6
    sget-object v1, Lga/n;->c:Lx1/e;

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    sget-object v2, Lga/n;->d:Lx1/e;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Double;

    .line 21
    .line 22
    sget-object v3, Lga/n;->e:Lx1/e;

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Integer;

    .line 29
    .line 30
    sget-object v4, Lga/n;->f:Lx1/e;

    .line 31
    .line 32
    invoke-virtual {p1, v4}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/lang/Integer;

    .line 37
    .line 38
    sget-object v5, Lga/n;->g:Lx1/e;

    .line 39
    .line 40
    invoke-virtual {p1, v5}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    move-object v5, p1

    .line 45
    check-cast v5, Ljava/lang/Long;

    .line 46
    .line 47
    invoke-direct/range {v0 .. v5}, Lga/f;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lga/n;->b:Lga/f;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lga/n;->b:Lga/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "sessionConfigs"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, v0, Lga/f;->e:Ljava/lang/Long;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lga/f;->d:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    sub-long/2addr v2, v4

    .line 27
    const/16 v1, 0x3e8

    .line 28
    .line 29
    int-to-long v4, v1

    .line 30
    div-long/2addr v2, v4

    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-long v0, v0

    .line 36
    cmp-long v0, v2, v0

    .line 37
    .line 38
    if-gez v0, :cond_0

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    return v0

    .line 42
    :cond_0
    const/4 v0, 0x1

    .line 43
    return v0

    .line 44
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v1
.end method

.method public final c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lga/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lga/l;

    .line 7
    .line 8
    iget v1, v0, Lga/l;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lga/l;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lga/l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lga/l;-><init>(Lga/n;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lga/l;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lga/l;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iget-object p3, p0, Lga/n;->a:Lu1/i;

    .line 54
    .line 55
    new-instance v2, Lga/m;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p2, p1, p0, v4}, Lga/m;-><init>(Ljava/lang/Object;Lx1/e;Lga/n;Ljf/c;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lga/l;->c:I

    .line 62
    .line 63
    invoke-static {p3, v2, v0}, Landroid/support/v4/media/session/b;->d0(Lu1/i;Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string p3, "Failed to update cache config value: "

    .line 73
    .line 74
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "SettingsCache"

    .line 85
    .line 86
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 90
    .line 91
    return-object p1
.end method
