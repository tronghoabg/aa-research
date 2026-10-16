.class public final LJ8/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK8/m;


# instance fields
.field public final synthetic a:LJ8/o;

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LJ8/N;->a:LJ8/o;

    .line 5
    .line 6
    iput-object p1, p0, LJ8/N;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 2
    .line 3
    const/16 v0, 0x4273

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x427d

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x426d

    .line 12
    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, LJ8/N;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->q()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, LK8/z;->b:LK8/l;

    .line 25
    .line 26
    iget-object v0, p1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 27
    .line 28
    iget-object p1, p1, LK8/l;->e:LA7/p;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method
