.class public final LJ8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK8/n;
.implements LK8/J;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ8/h;->a:I

    iput-object p1, p0, LJ8/h;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/zzagl;LJ8/o;)V
    .locals 2

    .line 1
    iget v0, p0, LJ8/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ8/h;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v0, p2, p1, v1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;ZZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, LK8/e;

    .line 24
    .line 25
    iput-object p1, v0, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 26
    .line 27
    iget-object v0, p0, LJ8/h;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v0, p2, p1, v1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->l(Lcom/google/firebase/auth/FirebaseAuth;LJ8/o;Lcom/google/android/gms/internal/firebase-auth-api/zzagl;ZZ)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget v0, p0, LJ8/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 7
    .line 8
    const/16 v0, 0x4273

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x427d

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x426d

    .line 17
    .line 18
    if-ne p1, v0, :cond_1

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, LJ8/h;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->q()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, LK8/z;->b:LK8/l;

    .line 30
    .line 31
    iget-object v0, p1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 32
    .line 33
    iget-object p1, p1, LK8/l;->e:LA7/p;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_0
    iget p1, p1, Lcom/google/android/gms/common/api/Status;->a:I

    .line 40
    .line 41
    const/16 v0, 0x4273

    .line 42
    .line 43
    if-eq p1, v0, :cond_2

    .line 44
    .line 45
    const/16 v0, 0x427d

    .line 46
    .line 47
    if-eq p1, v0, :cond_2

    .line 48
    .line 49
    const/16 v0, 0x426d

    .line 50
    .line 51
    if-eq p1, v0, :cond_2

    .line 52
    .line 53
    const/16 v0, 0x42c3

    .line 54
    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, LJ8/h;->b:Lcom/google/firebase/auth/FirebaseAuth;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->q()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->x:LK8/z;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p1, LK8/z;->b:LK8/l;

    .line 67
    .line 68
    iget-object v0, p1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 69
    .line 70
    iget-object p1, p1, LK8/l;->e:LA7/p;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
