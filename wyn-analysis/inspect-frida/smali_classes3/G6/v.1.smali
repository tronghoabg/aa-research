.class public final LG6/v;
.super Lcom/google/android/gms/internal/ads/zzauo;
.source "SourceFile"


# instance fields
.field public final synthetic a:[B

.field public final synthetic b:Ljava/util/HashMap;

.field public final synthetic c:LH6/i;


# direct methods
.method public constructor <init>(LG6/y;ILjava/lang/String;LG6/w;LS3/s;[BLjava/util/HashMap;LH6/i;)V
    .locals 0

    .line 1
    iput-object p6, p0, LG6/v;->a:[B

    .line 2
    .line 3
    iput-object p7, p0, LG6/v;->b:Ljava/util/HashMap;

    .line 4
    .line 5
    iput-object p8, p0, LG6/v;->c:LH6/i;

    .line 6
    .line 7
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzauo;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzatq;Lcom/google/android/gms/internal/ads/zzatp;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final zzm()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LG6/v;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public final zzn()[B
    .locals 1

    .line 1
    iget-object v0, p0, LG6/v;->a:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :cond_0
    return-object v0
.end method

.method public final bridge synthetic zzs(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LG6/v;->zzz(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzz(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LG6/v;->c:LH6/i;

    .line 2
    .line 3
    invoke-static {}, LH6/i;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, LS3/l;

    .line 17
    .line 18
    invoke-direct {v2, v1}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "onNetworkResponseBody"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzauo;->zzz(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
