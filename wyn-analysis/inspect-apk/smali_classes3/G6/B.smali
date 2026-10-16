.class public final LG6/B;
.super LG6/p;
.source "SourceFile"


# instance fields
.field public final a:LH6/p;

.field public final b:Ljava/lang/String;

.field public final c:LH6/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LH6/q;)V
    .locals 1

    .line 1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 2
    .line 3
    iget-object v0, v0, LC6/n;->c:LG6/U;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LG6/U;->E(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {p0}, LG6/p;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v0, LH6/p;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2}, LH6/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LG6/B;->a:LH6/p;

    .line 18
    .line 19
    iput-object p3, p0, LG6/B;->b:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p4, p0, LG6/B;->c:LH6/q;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 8

    .line 1
    iget-object v0, p0, LG6/B;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LG6/B;->c:LH6/q;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfsd;

    .line 8
    .line 9
    sget-object v5, Lcom/google/android/gms/internal/ads/zzcfy;->zze:Lcom/google/android/gms/internal/ads/zzhcq;

    .line 10
    .line 11
    iget-object v3, v1, LH6/q;->a:LH6/k;

    .line 12
    .line 13
    iget-object v4, p0, LG6/B;->a:LH6/p;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzfsd;-><init>(LH6/s;LH6/p;Lcom/google/android/gms/internal/ads/zzhcq;Lcom/google/android/gms/internal/ads/zzfse;Lcom/google/android/gms/internal/ads/zzcnn;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzfsd;->zza(Ljava/lang/String;)Lp8/p;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v1, p0, LG6/B;->a:LH6/p;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v1, v2, v0}, LH6/p;->a(Ljava/util/HashMap;Ljava/lang/String;)LH6/o;

    .line 28
    .line 29
    .line 30
    return-void
.end method
