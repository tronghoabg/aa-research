.class public final LD6/g1;
.super LD6/D;
.source "SourceFile"


# instance fields
.field public final synthetic a:LD6/h1;


# direct methods
.method public synthetic constructor <init>(LD6/h1;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD6/g1;->a:LD6/h1;

    .line 5
    .line 6
    invoke-direct {p0}, LD6/D;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final zze(LD6/v1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LD6/g1;->zzi(LD6/v1;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final zzg()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final zzi(LD6/v1;I)V
    .locals 0

    .line 1
    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    .line 2
    .line 3
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LH6/f;->b:Lcom/google/android/gms/internal/ads/zzgax;

    .line 7
    .line 8
    new-instance p2, LA7/V;

    .line 9
    .line 10
    invoke-direct {p2, p0}, LA7/V;-><init>(LD6/g1;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
