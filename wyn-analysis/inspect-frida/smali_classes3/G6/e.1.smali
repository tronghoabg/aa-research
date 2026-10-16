.class public final synthetic LG6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:LG6/j;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LG6/j;Ljava/util/concurrent/atomic/AtomicInteger;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG6/e;->a:LG6/j;

    .line 5
    .line 6
    iput-object p2, p0, LG6/e;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    iput p3, p0, LG6/e;->c:I

    .line 9
    .line 10
    iput p4, p0, LG6/e;->d:I

    .line 11
    .line 12
    iput p5, p0, LG6/e;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget-object p1, p0, LG6/e;->a:LG6/j;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LG6/e;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, LG6/e;->c:I

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v1, p0, LG6/e;->d:I

    .line 21
    .line 22
    iget-object v2, p1, LG6/j;->b:Lcom/google/android/gms/internal/ads/zzecz;

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    sget-object p2, Lcom/google/android/gms/internal/ads/zzecv;->zzb:Lcom/google/android/gms/internal/ads/zzecv;

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzecz;->zze(Lcom/google/android/gms/internal/ads/zzecv;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget v0, p0, LG6/e;->e:I

    .line 37
    .line 38
    if-ne p2, v0, :cond_1

    .line 39
    .line 40
    sget-object p2, Lcom/google/android/gms/internal/ads/zzecv;->zzc:Lcom/google/android/gms/internal/ads/zzecv;

    .line 41
    .line 42
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzecz;->zze(Lcom/google/android/gms/internal/ads/zzecv;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzecv;->zza:Lcom/google/android/gms/internal/ads/zzecv;

    .line 47
    .line 48
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzecz;->zze(Lcom/google/android/gms/internal/ads/zzecv;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    invoke-virtual {p1}, LG6/j;->b()V

    .line 52
    .line 53
    .line 54
    return-void
.end method
