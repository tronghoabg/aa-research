.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;

.field public static final b:LBf/i;

.field public static final c:LBf/i;

.field public static final d:LBf/i;

.field public static final e:LBf/i;

.field public static final f:LBf/i;

.field public static final g:LBf/i;

.field public static final h:LBf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->a:Lef/p;

    .line 13
    .line 14
    new-instance v0, LBf/i;

    .line 15
    .line 16
    const-string v1, "\\[ERRORCODE]"

    .line 17
    .line 18
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->b:LBf/i;

    .line 22
    .line 23
    new-instance v0, LBf/i;

    .line 24
    .line 25
    const-string v1, "\\[CONTENTPLAYHEAD]"

    .line 26
    .line 27
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->c:LBf/i;

    .line 31
    .line 32
    new-instance v0, LBf/i;

    .line 33
    .line 34
    const-string v1, "\\[CACHEBUSTING]"

    .line 35
    .line 36
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->d:LBf/i;

    .line 40
    .line 41
    new-instance v0, LBf/i;

    .line 42
    .line 43
    const-string v1, "\\[ASSETURI]"

    .line 44
    .line 45
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->e:LBf/i;

    .line 49
    .line 50
    new-instance v0, LBf/i;

    .line 51
    .line 52
    const-string v1, "\\[[^]]*]"

    .line 53
    .line 54
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->f:LBf/i;

    .line 58
    .line 59
    new-instance v0, LBf/i;

    .line 60
    .line 61
    const-string v1, "\\[MEDIAPLAYHEAD]"

    .line 62
    .line 63
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->g:LBf/i;

    .line 67
    .line 68
    new-instance v0, LBf/i;

    .line 69
    .line 70
    const-string v1, "\\[ADPLAYHEAD]"

    .line 71
    .line 72
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->h:LBf/i;

    .line 76
    .line 77
    return-void
.end method

.method public static final a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->a:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final b(I)Ljava/lang/String;
    .locals 10

    .line 1
    int-to-long v0, p0

    .line 2
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    sget-object v5, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v6, 0x1

    .line 19
    .line 20
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    rem-long/2addr v3, v8

    .line 25
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    invoke-virtual {p0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    rem-long/2addr v4, v6

    .line 40
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/16 v4, 0x3e8

    .line 45
    .line 46
    int-to-long v4, v4

    .line 47
    rem-long/2addr v0, v4

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x4

    .line 53
    new-array v4, v1, [Ljava/lang/Object;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    aput-object v2, v4, v5

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    aput-object v3, v4, v2

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    aput-object p0, v4, v2

    .line 63
    .line 64
    const/4 p0, 0x3

    .line 65
    aput-object v0, v4, p0

    .line 66
    .line 67
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string v0, "%02d:%02d:%02d.%03d"

    .line 72
    .line 73
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method
