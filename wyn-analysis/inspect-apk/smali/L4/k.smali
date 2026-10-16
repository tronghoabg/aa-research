.class public abstract LL4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL4/i;

.field public static final b:LL4/i;

.field public static final c:LB4/f;

.field public static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LL4/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LL4/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LL4/i;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v2}, LL4/i;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sput-object v1, LL4/k;->a:LL4/i;

    .line 14
    .line 15
    sput-object v0, LL4/k;->b:LL4/i;

    .line 16
    .line 17
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    .line 18
    .line 19
    invoke-static {v0, v1}, LB4/f;->a(Ljava/lang/Object;Ljava/lang/String;)LB4/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LL4/k;->c:LB4/f;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    sput-boolean v0, LL4/k;->d:Z

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public abstract a(IIII)I
.end method

.method public abstract b(IIII)F
.end method
