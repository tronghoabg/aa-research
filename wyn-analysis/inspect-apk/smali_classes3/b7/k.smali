.class public final Lb7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/T;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LL4/s;
.implements LQ4/a;
.implements LT5/x;
.implements LV3/a;
.implements Lc0/e;
.implements Lm1/g;


# static fields
.field public static e:Lb7/k;

.field public static f:Lb7/k;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lb7/k;->a:I

    packed-switch p1, :pswitch_data_0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 128
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    return-void

    .line 129
    :pswitch_0
    new-instance p1, Lc0/g;

    invoke-direct {p1}, Lc0/g;-><init>()V

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 132
    sget-object v0, Lc0/k;->a:La2/v;

    .line 133
    sget-object v0, Lc0/k;->b:LZ/k;

    invoke-interface {p1, v0}, LZ/k;->g(LZ/k;)LZ/k;

    move-result-object p1

    .line 134
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(ILKd/a;)V
    .locals 2

    const/16 v0, 0x16

    iput v0, p0, Lb7/k;->a:I

    .line 1
    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    invoke-static {p1, p2, v0}, Lic/d;->c(ILKd/a;LHf/l;)LHf/e0;

    move-result-object p1

    .line 5
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    move-result-object p1

    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 6
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/e;

    invoke-direct {v1, p0, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/e;-><init>(Lb7/k;Ljf/c;)V

    invoke-static {v1}, LHf/k0;->j(Ltf/p;)LHf/h;

    move-result-object v0

    .line 7
    new-instance v1, LHf/u0;

    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p1}, LHf/x0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHf/v0;

    invoke-interface {p1}, LHf/v0;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p2, v1, p1}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    move-result-object p1

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 10
    iput p1, p0, Lb7/k;->a:I

    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb7/k;->c:Ljava/lang/Object;

    iput-object p4, p0, Lb7/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 11
    iput p1, p0, Lb7/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA/e0;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lb7/k;->a:I

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 137
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 138
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LG5/G;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lb7/k;->a:I

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 140
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 141
    new-instance p1, LG5/F;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LG5/F;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ5/i;)V
    .locals 1

    const/16 v0, 0x19

    iput v0, p0, Lb7/k;->a:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LS3/n;LO3/b;)V
    .locals 13

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/16 v4, 0xa

    iput v4, p0, Lb7/k;->a:I

    const/4 v4, 0x0

    const-string v5, "trackers"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    new-instance v5, LP3/a;

    .line 68
    iget-object v6, p1, LS3/n;->a:Ljava/lang/Object;

    check-cast v6, LQ3/f;

    const-string v7, "tracker"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {v5, v6, v4}, LP3/a;-><init>(LQ3/f;I)V

    .line 70
    new-instance v6, LP3/a;

    .line 71
    iget-object v8, p1, LS3/n;->b:Ljava/lang/Object;

    check-cast v8, LQ3/a;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-direct {v6, v8, v3}, LP3/a;-><init>(LQ3/f;I)V

    .line 73
    new-instance v8, LP3/a;

    .line 74
    iget-object v9, p1, LS3/n;->d:Ljava/lang/Object;

    check-cast v9, LQ3/f;

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-direct {v8, v9, v2}, LP3/a;-><init>(LQ3/f;I)V

    .line 76
    new-instance v9, LP3/a;

    .line 77
    iget-object p1, p1, LS3/n;->c:Ljava/lang/Object;

    check-cast p1, LQ3/f;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {v9, p1, v1}, LP3/a;-><init>(LQ3/f;I)V

    .line 79
    new-instance v10, LP3/a;

    .line 80
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-direct {v10, p1, v0}, LP3/a;-><init>(LQ3/f;I)V

    .line 82
    new-instance v11, LP3/d;

    .line 83
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-direct {v11, p1}, LP3/b;-><init>(LQ3/f;)V

    .line 85
    new-instance v12, LP3/c;

    .line 86
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-direct {v12, p1}, LP3/b;-><init>(LQ3/f;)V

    const/4 p1, 0x7

    .line 88
    new-array p1, p1, [LP3/b;

    aput-object v5, p1, v4

    aput-object v6, p1, v3

    aput-object v8, p1, v1

    aput-object v9, p1, v0

    aput-object v10, p1, v2

    const/4 v0, 0x5

    aput-object v11, p1, v0

    const/4 v0, 0x6

    aput-object v12, p1, v0

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 91
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 92
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lre/d;Lk3/p;Lre/a;)V
    .locals 0

    const/16 p1, 0x12

    iput p1, p0, Lb7/k;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 43
    iput-object p3, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 44
    iput-object p4, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    iput p2, p0, Lb7/k;->a:I

    sparse-switch p2, :sswitch_data_0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lb7/b;->a(Landroid/content/Context;)Lb7/b;

    move-result-object p1

    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 14
    invoke-virtual {p1}, Lb7/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p2

    iput-object p2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 15
    const-string p2, "defaultGoogleSignInAccount"

    invoke-virtual {p1, p2}, Lb7/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "googleSignInOptions"

    .line 17
    invoke-static {v0, p2}, Lb7/b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb7/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 18
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->W(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 19
    :goto_1
    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void

    .line 20
    :sswitch_0
    new-instance p2, LK3/l;

    invoke-direct {p2, p1}, LK3/l;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lb7/k;->c:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 26
    sget-object p1, Lk4/d;->a:Lh4/b;

    .line 27
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 28
    new-instance p1, Lk4/i;

    .line 29
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;LF4/f;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lb7/k;->a:I

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iput-object p3, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 96
    invoke-static {p2, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iput-object p2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 98
    new-instance p2, LC4/i;

    invoke-direct {p2, p1}, LC4/i;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/o;Lcom/moloco/sdk/acm/services/b;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lb7/k;->a:I

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 33
    iput-object p2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/y;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lb7/k;->a:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Landroidx/lifecycle/x;

    invoke-direct {v0, p1}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/v;)V

    iput-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 47
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf9/h;)V
    .locals 2

    const/16 v0, 0x18

    iput v0, p0, Lb7/k;->a:I

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 101
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 102
    iget-object p1, p1, Lf9/h;->c:Ls8/g;

    invoke-virtual {p1}, Ls8/g;->a()V

    .line 103
    iget-object p1, p1, Ls8/g;->c:Ls8/l;

    iget-object p1, p1, Ls8/l;->a:Ljava/lang/String;

    .line 104
    const-string v1, "apiKey"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 106
    const-string v1, "parameters"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p4, p0, Lb7/k;->a:I

    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb7/k;->c:Ljava/lang/Object;

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lb7/k;->a:I

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, LE5/S;

    invoke-direct {v0}, LE5/S;-><init>()V

    .line 62
    iput-object p1, v0, LE5/S;->k:Ljava/lang/String;

    .line 63
    new-instance p1, LE5/T;

    invoke-direct {p1, v0}, LE5/T;-><init>(LE5/S;)V

    .line 64
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lb7/k;->a:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 55
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, Lb7/k;->a:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 58
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ls2/C;

    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 59
    new-instance p1, LR1/q;

    new-instance v0, LS8/b;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0}, LR1/q;-><init>(LR1/p;)V

    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    const/16 v0, 0x17

    iput v0, p0, Lb7/k;->a:I

    .line 35
    invoke-static {}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    move-result-object v0

    .line 36
    const-string v1, "vastTracker"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 40
    iput-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, Lb7/k;->a:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 50
    new-instance v0, LA7/V0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LA7/V0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 51
    new-instance v0, LT3/m;

    invoke-direct {v0, p1}, LT3/m;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([LO1/d;)V
    .locals 5

    const/16 v0, 0xe

    iput v0, p0, Lb7/k;->a:I

    .line 107
    new-instance v0, LW1/x;

    invoke-direct {v0}, LW1/x;-><init>()V

    new-instance v1, LO1/g;

    .line 108
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 109
    iput v2, v1, LO1/g;->c:F

    .line 110
    iput v2, v1, LO1/g;->d:F

    .line 111
    sget-object v2, LO1/b;->e:LO1/b;

    iput-object v2, v1, LO1/g;->e:LO1/b;

    .line 112
    iput-object v2, v1, LO1/g;->f:LO1/b;

    .line 113
    iput-object v2, v1, LO1/g;->g:LO1/b;

    .line 114
    iput-object v2, v1, LO1/g;->h:LO1/b;

    .line 115
    sget-object v2, LO1/d;->a:Ljava/nio/ByteBuffer;

    iput-object v2, v1, LO1/g;->k:Ljava/nio/ByteBuffer;

    .line 116
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v3

    iput-object v3, v1, LO1/g;->l:Ljava/nio/ShortBuffer;

    .line 117
    iput-object v2, v1, LO1/g;->m:Ljava/nio/ByteBuffer;

    const/4 v2, -0x1

    .line 118
    iput v2, v1, LO1/g;->b:I

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [LO1/d;

    iput-object v2, p0, Lb7/k;->b:Ljava/lang/Object;

    const/4 v3, 0x0

    .line 121
    array-length v4, p1

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    iput-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 123
    iput-object v1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 124
    array-length v3, p1

    aput-object v0, v2, v3

    .line 125
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method

.method public static declared-synchronized I(Landroid/content/Context;)Lb7/k;
    .locals 1

    .line 1
    const-class v0, Lb7/k;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lb7/k;->K(Landroid/content/Context;)Lb7/k;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p0
.end method

.method public static declared-synchronized K(Landroid/content/Context;)Lb7/k;
    .locals 3

    .line 1
    const-class v0, Lb7/k;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lb7/k;->e:Lb7/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    new-instance v1, Lb7/k;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lb7/k;-><init>(Landroid/content/Context;I)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lb7/k;->e:Lb7/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    throw p0
.end method

.method public static r(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/util/Map$Entry;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "="

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, ""

    .line 39
    .line 40
    const-string v5, "UTF-8"

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v1, v4

    .line 56
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const-string v3, "&"

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/util/Map$Entry;

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v1, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    goto :goto_2

    .line 105
    :cond_1
    move-object v1, v4

    .line 106
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_3
    const-string v0, "?"

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :cond_4
    invoke-static {p1, p0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :cond_5
    invoke-static {p1, v0, p0}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0
.end method

.method public static w(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object v0
.end method

.method public static z()Lb7/k;
    .locals 6

    .line 1
    sget-object v0, Lb7/k;->f:Lb7/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La2/k;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljc/a;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iput v2, v1, Ljc/a;->a:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v3, Loc/d;

    .line 23
    .line 24
    new-instance v4, Lio/flutter/embedding/engine/FlutterJNI;

    .line 25
    .line 26
    invoke-direct {v4}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-boolean v2, v3, Loc/d;->b:Z

    .line 33
    .line 34
    iput-object v4, v3, Loc/d;->e:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v1, v3, Loc/d;->f:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v2, Lb7/k;

    .line 39
    .line 40
    const/16 v4, 0x1b

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct {v2, v4, v5}, Lb7/k;-><init>(IZ)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v2, Lb7/k;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v0, v2, Lb7/k;->c:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v1, v2, Lb7/k;->d:Ljava/lang/Object;

    .line 51
    .line 52
    sput-object v2, Lb7/k;->f:Lb7/k;

    .line 53
    .line 54
    :cond_0
    sget-object v0, Lb7/k;->f:Lb7/k;

    .line 55
    .line 56
    return-object v0
.end method


# virtual methods
.method public A(I)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lc0/g;

    .line 8
    .line 9
    invoke-static {v2}, LA6/c;->t(Lc0/g;)Lc0/g;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    :cond_0
    const/16 v17, 0x0

    .line 16
    .line 17
    goto/16 :goto_f

    .line 18
    .line 19
    :cond_1
    iget-object v5, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, LL0/i;

    .line 22
    .line 23
    const-string v6, "layoutDirection"

    .line 24
    .line 25
    if-eqz v5, :cond_29

    .line 26
    .line 27
    const/16 v8, 0x8

    .line 28
    .line 29
    const/4 v9, 0x7

    .line 30
    const/4 v10, 0x6

    .line 31
    const/4 v11, 0x4

    .line 32
    const/4 v12, 0x3

    .line 33
    const/4 v13, 0x5

    .line 34
    const/4 v14, 0x2

    .line 35
    const/4 v15, 0x1

    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    iget-object v7, v3, Lc0/g;->i:Lc0/l;

    .line 39
    .line 40
    if-ne v1, v15, :cond_2

    .line 41
    .line 42
    iget-object v5, v7, Lc0/l;->b:Lc0/o;

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_2
    if-ne v1, v14, :cond_3

    .line 47
    .line 48
    iget-object v5, v7, Lc0/l;->c:Lc0/o;

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_3
    if-ne v1, v13, :cond_4

    .line 53
    .line 54
    iget-object v5, v7, Lc0/l;->d:Lc0/o;

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_4
    if-ne v1, v10, :cond_5

    .line 59
    .line 60
    iget-object v5, v7, Lc0/l;->e:Lc0/o;

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_5
    if-ne v1, v12, :cond_9

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_7

    .line 70
    .line 71
    if-ne v5, v15, :cond_6

    .line 72
    .line 73
    iget-object v5, v7, Lc0/l;->i:Lc0/o;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    new-instance v1, LE5/Q;

    .line 77
    .line 78
    const/16 v2, 0x9

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_7
    iget-object v5, v7, Lc0/l;->h:Lc0/o;

    .line 86
    .line 87
    :goto_0
    sget-object v4, Lc0/o;->b:Lc0/o;

    .line 88
    .line 89
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_8

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_8
    move-object/from16 v5, v16

    .line 97
    .line 98
    :goto_1
    if-nez v5, :cond_f

    .line 99
    .line 100
    iget-object v5, v7, Lc0/l;->f:Lc0/o;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_9
    if-ne v1, v11, :cond_d

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_b

    .line 110
    .line 111
    if-ne v4, v15, :cond_a

    .line 112
    .line 113
    iget-object v4, v7, Lc0/l;->h:Lc0/o;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_a
    new-instance v1, LE5/Q;

    .line 117
    .line 118
    const/16 v2, 0x9

    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_b
    iget-object v4, v7, Lc0/l;->i:Lc0/o;

    .line 126
    .line 127
    :goto_2
    sget-object v5, Lc0/o;->b:Lc0/o;

    .line 128
    .line 129
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_c

    .line 134
    .line 135
    move-object v5, v4

    .line 136
    goto :goto_3

    .line 137
    :cond_c
    move-object/from16 v5, v16

    .line 138
    .line 139
    :goto_3
    if-nez v5, :cond_f

    .line 140
    .line 141
    iget-object v5, v7, Lc0/l;->g:Lc0/o;

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_d
    if-ne v1, v9, :cond_e

    .line 145
    .line 146
    sget-object v5, Lc0/o;->b:Lc0/o;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_e
    if-ne v1, v8, :cond_28

    .line 150
    .line 151
    sget-object v5, Lc0/o;->b:Lc0/o;

    .line 152
    .line 153
    :cond_f
    :goto_4
    sget-object v4, Lc0/o;->b:Lc0/o;

    .line 154
    .line 155
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_10

    .line 160
    .line 161
    invoke-virtual {v5}, Lc0/o;->a()V

    .line 162
    .line 163
    .line 164
    return v15

    .line 165
    :cond_10
    iget-object v4, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, LL0/i;

    .line 168
    .line 169
    if-eqz v4, :cond_27

    .line 170
    .line 171
    new-instance v5, LB/F;

    .line 172
    .line 173
    const/16 v6, 0xc

    .line 174
    .line 175
    invoke-direct {v5, v3, v6}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    if-ne v1, v15, :cond_11

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_11
    if-ne v1, v14, :cond_14

    .line 182
    .line 183
    :goto_5
    if-ne v1, v15, :cond_12

    .line 184
    .line 185
    invoke-static {v2, v5}, LA6/h;->w(Lc0/g;LB/F;)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :cond_12
    if-ne v1, v14, :cond_13

    .line 192
    .line 193
    invoke-static {v2, v5}, LA6/h;->i(Lc0/g;LB/F;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string v2, "This function should only be used for 1-D focus search"

    .line 202
    .line 203
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :cond_14
    if-ne v1, v12, :cond_15

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_15
    if-ne v1, v11, :cond_16

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_16
    if-ne v1, v13, :cond_17

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_17
    if-ne v1, v10, :cond_18

    .line 217
    .line 218
    :goto_6
    invoke-static {v2, v1, v5}, LBa/c;->T(Lc0/g;ILB/F;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    goto :goto_a

    .line 223
    :cond_18
    if-ne v1, v9, :cond_1c

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-eqz v3, :cond_1a

    .line 230
    .line 231
    if-ne v3, v15, :cond_19

    .line 232
    .line 233
    move v3, v12

    .line 234
    goto :goto_7

    .line 235
    :cond_19
    new-instance v1, LE5/Q;

    .line 236
    .line 237
    const/16 v2, 0x9

    .line 238
    .line 239
    const/4 v3, 0x0

    .line 240
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 241
    .line 242
    .line 243
    throw v1

    .line 244
    :cond_1a
    move v3, v11

    .line 245
    :goto_7
    invoke-static {v2}, LA6/c;->t(Lc0/g;)Lc0/g;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-eqz v4, :cond_1b

    .line 250
    .line 251
    invoke-static {v4, v3, v5}, LBa/c;->T(Lc0/g;ILB/F;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    goto :goto_a

    .line 256
    :cond_1b
    :goto_8
    const/4 v3, 0x0

    .line 257
    goto :goto_a

    .line 258
    :cond_1c
    if-ne v1, v8, :cond_26

    .line 259
    .line 260
    invoke-static {v2}, LA6/c;->t(Lc0/g;)Lc0/g;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-eqz v3, :cond_1d

    .line 265
    .line 266
    invoke-static {v3}, LA6/c;->u(Lc0/g;)Lc0/g;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    goto :goto_9

    .line 271
    :cond_1d
    move-object/from16 v7, v16

    .line 272
    .line 273
    :goto_9
    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-nez v3, :cond_1b

    .line 278
    .line 279
    if-nez v7, :cond_1e

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_1e
    invoke-virtual {v5, v7}, LB/F;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    :goto_a
    if-nez v3, :cond_25

    .line 293
    .line 294
    iget-object v3, v2, Lc0/g;->d:Lc0/r;

    .line 295
    .line 296
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_20

    .line 301
    .line 302
    if-eq v3, v15, :cond_20

    .line 303
    .line 304
    if-eq v3, v14, :cond_20

    .line 305
    .line 306
    if-eq v3, v12, :cond_21

    .line 307
    .line 308
    if-eq v3, v11, :cond_20

    .line 309
    .line 310
    if-ne v3, v13, :cond_1f

    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_1f
    new-instance v1, LE5/Q;

    .line 314
    .line 315
    const/16 v2, 0x9

    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 319
    .line 320
    .line 321
    throw v1

    .line 322
    :cond_20
    iget-object v3, v2, Lc0/g;->d:Lc0/r;

    .line 323
    .line 324
    invoke-virtual {v3}, Lc0/r;->b()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_22

    .line 329
    .line 330
    :cond_21
    :goto_b
    const/4 v3, 0x0

    .line 331
    goto :goto_e

    .line 332
    :cond_22
    if-ne v1, v15, :cond_23

    .line 333
    .line 334
    :goto_c
    const/4 v3, 0x0

    .line 335
    goto :goto_d

    .line 336
    :cond_23
    if-ne v1, v14, :cond_21

    .line 337
    .line 338
    goto :goto_c

    .line 339
    :goto_d
    invoke-virtual {v0, v3}, Lb7/k;->p(Z)V

    .line 340
    .line 341
    .line 342
    iget-object v2, v2, Lc0/g;->d:Lc0/r;

    .line 343
    .line 344
    invoke-virtual {v2}, Lc0/r;->b()Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-nez v2, :cond_24

    .line 349
    .line 350
    goto :goto_b

    .line 351
    :cond_24
    invoke-virtual/range {p0 .. p1}, Lb7/k;->A(I)Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    :goto_e
    if-eqz v3, :cond_0

    .line 356
    .line 357
    goto :goto_10

    .line 358
    :goto_f
    return v17

    .line 359
    :cond_25
    :goto_10
    return v15

    .line 360
    :cond_26
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 361
    .line 362
    const-string v2, "Invalid FocusDirection"

    .line 363
    .line 364
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v1

    .line 368
    :cond_27
    invoke-static {v6}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v16

    .line 372
    :cond_28
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 373
    .line 374
    const-string v2, "invalid FocusDirection"

    .line 375
    .line 376
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v1

    .line 380
    :cond_29
    const/16 v16, 0x0

    .line 381
    .line 382
    invoke-static {v6}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v16
.end method

.method public B(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-string v0, "workSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LO3/b;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, p1}, LO3/b;->b(Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    throw p1
.end method

.method public C(Landroid/app/Activity;LD3/k;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/WeakHashMap;

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LD3/k;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, LD3/k;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    :try_start_1
    invoke-virtual {v1, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, LD3/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LA/e0;

    .line 45
    .line 46
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LG3/l;

    .line 49
    .line 50
    iget-object v0, v0, LG3/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, LG3/k;

    .line 67
    .line 68
    iget-object v2, v1, LG3/k;->a:Landroid/app/Activity;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iput-object p2, v1, LG3/k;->c:LD3/k;

    .line 78
    .line 79
    iget-object v1, v1, LG3/k;->b:LD3/i;

    .line 80
    .line 81
    invoke-virtual {v1, p2}, LD3/i;->accept(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void

    .line 86
    :catchall_0
    move-exception p1

    .line 87
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method public D(Ljava/lang/String;Ljava/lang/Boolean;Lgd/e;Lgd/a;)Ljava/lang/Boolean;
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-object v0, p3, Lgd/e;->c:Ljava/util/Map;

    .line 8
    .line 9
    invoke-static {v0}, Lb7/k;->w(Ljava/util/Map;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const-string v1, "com.android.browser.headers"

    .line 18
    .line 19
    if-eqz p2, :cond_5

    .line 20
    .line 21
    iget-object p2, p3, Lgd/e;->c:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :pswitch_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v3, -0x1

    .line 53
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    sparse-switch v4, :sswitch_data_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :sswitch_0
    const-string v4, "accept-language"

    .line 62
    .line 63
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v3, 0x3

    .line 71
    goto :goto_0

    .line 72
    :sswitch_1
    const-string v4, "content-type"

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const/4 v3, 0x2

    .line 82
    goto :goto_0

    .line 83
    :sswitch_2
    const-string v4, "content-language"

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/4 v3, 0x1

    .line 93
    goto :goto_0

    .line 94
    :sswitch_3
    const-string v4, "accept"

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    const/4 v3, 0x0

    .line 104
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    iget-object v2, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Landroid/app/Activity;

    .line 115
    .line 116
    new-instance v3, Lp9/C;

    .line 117
    .line 118
    invoke-direct {v3}, Lp9/C;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-object p4, p4, Lgd/a;->a:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result p4

    .line 127
    iget-object v4, v3, Lp9/C;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Landroid/content/Intent;

    .line 130
    .line 131
    const-string v5, "android.support.customtabs.extra.TITLE_VISIBILITY"

    .line 132
    .line 133
    invoke-virtual {v4, v5, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Lp9/C;->b()Lu/k;

    .line 137
    .line 138
    .line 139
    move-result-object p4

    .line 140
    iget-object v3, p4, Lu/k;->a:Landroid/content/Intent;

    .line 141
    .line 142
    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 143
    .line 144
    .line 145
    :try_start_0
    invoke-virtual {p4, v2, p2}, Lu/k;->a(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    return-object p1

    .line 151
    :catch_0
    :cond_5
    :goto_1
    iget-object p2, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, Landroid/app/Activity;

    .line 154
    .line 155
    iget-object p4, p3, Lgd/e;->a:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result p4

    .line 161
    iget-object p3, p3, Lgd/e;->b:Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    sget v2, Lio/flutter/plugins/urllauncher/WebViewActivity;->e:I

    .line 168
    .line 169
    new-instance v2, Landroid/content/Intent;

    .line 170
    .line 171
    const-class v3, Lio/flutter/plugins/urllauncher/WebViewActivity;

    .line 172
    .line 173
    invoke-direct {v2, p2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 174
    .line 175
    .line 176
    const-string p2, "url"

    .line 177
    .line 178
    invoke-virtual {v2, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p2, "enableJavaScript"

    .line 183
    .line 184
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string p2, "enableDomStorage"

    .line 189
    .line 190
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    :try_start_1
    iget-object p2, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p2, Landroid/app/Activity;

    .line 201
    .line 202
    invoke-virtual {p2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 203
    .line 204
    .line 205
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 206
    .line 207
    return-object p1

    .line 208
    :catch_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 209
    .line 210
    return-object p1

    .line 211
    :cond_6
    new-instance p1, Lgd/b;

    .line 212
    .line 213
    invoke-direct {p1}, Lgd/b;-><init>()V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :sswitch_data_0
    .sparse-switch
        -0x54d84af8 -> :sswitch_3
        -0x494c25d4 -> :sswitch_2
        0x2ed4600e -> :sswitch_1
        0x2fd98a7d -> :sswitch_0
    .end sparse-switch

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public E(Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/a0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/a0;->run()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Landroidx/lifecycle/a0;

    .line 11
    .line 12
    iget-object v1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/lifecycle/x;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/a0;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/m;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public F(Ljava/lang/Iterable;)V
    .locals 8

    .line 1
    const-string v0, "workSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [LP3/b;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    aget-object v5, v1, v4

    .line 19
    .line 20
    iget-object v6, v5, LP3/b;->e:Lb7/k;

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    iput-object v6, v5, LP3/b;->e:Lb7/k;

    .line 26
    .line 27
    iget-object v7, v5, LP3/b;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v5, v6, v7}, LP3/b;->d(Lb7/k;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_3

    .line 37
    :cond_1
    iget-object v1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, [LP3/b;

    .line 40
    .line 41
    array-length v2, v1

    .line 42
    move v4, v3

    .line 43
    :goto_1
    if-ge v4, v2, :cond_2

    .line 44
    .line 45
    aget-object v5, v1, v4

    .line 46
    .line 47
    invoke-virtual {v5, p1}, LP3/b;->c(Ljava/lang/Iterable;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, [LP3/b;

    .line 56
    .line 57
    array-length v1, p1

    .line 58
    :goto_2
    if-ge v3, v1, :cond_4

    .line 59
    .line 60
    aget-object v2, p1, v3

    .line 61
    .line 62
    iget-object v4, v2, LP3/b;->e:Lb7/k;

    .line 63
    .line 64
    if-eq v4, p0, :cond_3

    .line 65
    .line 66
    iput-object p0, v2, LP3/b;->e:Lb7/k;

    .line 67
    .line 68
    iget-object v4, v2, LP3/b;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p0, v4}, LP3/b;->d(Lb7/k;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    monitor-exit v0

    .line 77
    return-void

    .line 78
    :goto_3
    monitor-exit v0

    .line 79
    throw p1
.end method

.method public G()V
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, [LP3/b;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_1

    .line 11
    .line 12
    aget-object v4, v1, v3

    .line 13
    .line 14
    iget-object v5, v4, LP3/b;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-nez v6, :cond_0

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object v5, v4, LP3/b;->a:LQ3/f;

    .line 26
    .line 27
    invoke-virtual {v5, v4}, LQ3/f;->b(LP3/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw v1
.end method

.method public declared-synchronized H()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0
.end method

.method public declared-synchronized J()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lb7/b;

    .line 5
    .line 6
    iget-object v1, v0, Lb7/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v0, v0, Lb7/b;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v0, p0, Lb7/k;->d:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 42
    throw v0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public c(LY4/b;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu6/t;

    .line 4
    .line 5
    invoke-static {v0}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v0, Lu6/v;->a:I

    .line 9
    .line 10
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lu6/t;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-wide v2, v1, Lu6/t;->c:J

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v6, v1, Lu6/t;->b:J

    .line 28
    .line 29
    add-long/2addr v2, v6

    .line 30
    :goto_0
    move-wide v7, v2

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v1}, Lu6/t;->c()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lu6/t;

    .line 44
    .line 45
    invoke-virtual {v0}, Lu6/t;->d()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    cmp-long v2, v7, v4

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    cmp-long v2, v0, v4

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, LE5/T;

    .line 61
    .line 62
    iget-wide v3, v2, LE5/T;->p:J

    .line 63
    .line 64
    cmp-long v3, v0, v3

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, LE5/T;->a()LE5/S;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-wide v0, v2, LE5/S;->o:J

    .line 73
    .line 74
    new-instance v0, LE5/T;

    .line 75
    .line 76
    invoke-direct {v0, v2}, LE5/T;-><init>(LE5/S;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, LJ5/w;

    .line 84
    .line 85
    invoke-interface {v1, v0}, LJ5/w;->a(LE5/T;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {p1}, LY4/b;->a()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, LJ5/w;

    .line 95
    .line 96
    invoke-interface {v0, v10, p1}, LJ5/w;->c(ILY4/b;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, p1

    .line 102
    check-cast v6, LJ5/w;

    .line 103
    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v9, 0x1

    .line 106
    const/4 v11, 0x0

    .line 107
    invoke-interface/range {v6 .. v12}, LJ5/w;->b(JIIILJ5/v;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_2
    return-void

    .line 111
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    throw p1
.end method

.method public d(Lu6/t;LJ5/m;LT5/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p3}, LT5/B;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, LT5/B;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, LT5/B;->e:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, LJ5/m;->m(II)LJ5/w;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, LE5/T;

    .line 21
    .line 22
    invoke-interface {p1, p2}, LJ5/w;->a(LE5/T;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public e(LE4/B;LB4/g;)LE4/B;
    .locals 3

    .line 1
    invoke-interface {p1}, LE4/B;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LF4/a;

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v2, LL4/c;

    .line 26
    .line 27
    invoke-direct {v2, v0, p1}, LL4/c;-><init>(LF4/a;Landroid/graphics/Bitmap;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LA/x;

    .line 33
    .line 34
    invoke-virtual {p1, v2, p2}, LA/x;->e(LE4/B;LB4/g;)LE4/B;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    instance-of v0, v0, LP4/c;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LQ4/c;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, LQ4/c;->e(LE4/B;LB4/g;)LE4/B;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_2
    return-object v2
.end method

.method public f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public g()V
    .locals 0

    .line 1
    return-void
.end method

.method public getDescription()Landroid/content/ClipDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object v0
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public i()I
    .locals 11

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LF4/f;

    .line 8
    .line 9
    iget-object v2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, LB4/c;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    :try_start_0
    new-instance v8, LL4/t;

    .line 29
    .line 30
    new-instance v9, Ljava/io/FileInputStream;

    .line 31
    .line 32
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {v8, v9, v1}, LL4/t;-><init>(Ljava/io/InputStream;LF4/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    .line 45
    .line 46
    :try_start_1
    invoke-interface {v6, v8, v1}, LB4/c;->a(Ljava/io/InputStream;LF4/f;)I

    .line 47
    .line 48
    .line 49
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    :try_start_2
    invoke-virtual {v8}, LL4/t;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 54
    .line 55
    .line 56
    if-eq v6, v5, :cond_0

    .line 57
    .line 58
    move v5, v6

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    move-object v7, v8

    .line 65
    goto :goto_1

    .line 66
    :catchall_1
    move-exception v1

    .line 67
    :goto_1
    if-eqz v7, :cond_1

    .line 68
    .line 69
    :try_start_3
    invoke-virtual {v7}, LL4/t;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 70
    .line 71
    .line 72
    :catch_1
    :cond_1
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    :goto_2
    return v5
.end method

.method public j()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public k(Lcom/moloco/sdk/acm/eventprocessing/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LJf/n;->a:LFf/e;

    .line 4
    .line 5
    iget-object v0, v0, LFf/e;->e:LFf/e;

    .line 6
    .line 7
    new-instance v1, Lcom/moloco/sdk/acm/services/c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/moloco/sdk/acm/services/c;-><init>(Lb7/k;Ljf/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1
.end method

.method public l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LF4/f;

    .line 8
    .line 9
    iget-object v2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, LB4/c;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    :try_start_0
    new-instance v7, LL4/t;

    .line 28
    .line 29
    new-instance v8, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v7, v8, v1}, LL4/t;-><init>(Ljava/io/InputStream;LF4/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-interface {v5, v7}, LB4/c;->c(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 46
    .line 47
    .line 48
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :try_start_2
    invoke-virtual {v7}, LL4/t;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    .line 51
    .line 52
    :catch_0
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 53
    .line 54
    .line 55
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 56
    .line 57
    if-eq v5, v6, :cond_0

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    move-object v6, v7

    .line 65
    goto :goto_1

    .line 66
    :catchall_1
    move-exception v1

    .line 67
    :goto_1
    if-eqz v6, :cond_1

    .line 68
    .line 69
    :try_start_3
    invoke-virtual {v6}, LL4/t;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 70
    .line 71
    .line 72
    :catch_1
    :cond_1
    invoke-virtual {v0}, LC4/i;->e()Landroid/os/ParcelFileDescriptor;

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 77
    .line 78
    :goto_2
    return-object v5
.end method

.method public m(Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "workSpecId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [LP3/b;

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    aget-object v5, v1, v4

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v6, v5, LP3/b;->d:Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    invoke-virtual {v5, v6}, LP3/b;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    iget-object v6, v5, LP3/b;->c:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 v5, 0x0

    .line 48
    :goto_1
    if-eqz v5, :cond_2

    .line 49
    .line 50
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, LO3/c;->a:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v4, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v6, "Work "

    .line 62
    .line 63
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, " constrained by "

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v1, v2, p1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :cond_2
    if-nez v5, :cond_3

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    :cond_3
    monitor-exit v0

    .line 96
    return v3

    .line 97
    :goto_2
    monitor-exit v0

    .line 98
    throw p1
.end method

.method public n(I)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v1, "apiKey"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, "suffix"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lf9/h;

    .line 21
    .line 22
    invoke-static {v0}, Lf9/h;->c(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lcom/google/android/gms/common/api/internal/V;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lcom/google/android/gms/common/api/internal/V;-><init>(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lf9/h;->a:Lf9/b;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/A;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string v0, "Missing API key. Set with setApiKey()."

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public o(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, LK3/l;

    .line 18
    .line 19
    iget-object p1, p1, LK3/l;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/content/ComponentName;->toShortString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    if-nez p1, :cond_1

    .line 38
    .line 39
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_1
    const-string v0, "{com.android.fallback/com.android.fallback.Fallback}"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    xor-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LJ8/v;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v3, ""

    .line 25
    .line 26
    :goto_0
    const-string v4, "Error while validating application identity: "

    .line 27
    .line 28
    const-string v5, "FirebaseAuth"

    .line 29
    .line 30
    invoke-static {v4, v3, v5}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    instance-of v3, v1, LJ8/k;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    instance-of v3, v1, LJ8/j;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    move-object v3, v1

    .line 44
    check-cast v3, LJ8/j;

    .line 45
    .line 46
    const-string v4, "UNAUTHORIZED_DOMAIN"

    .line 47
    .line 48
    iget-object v3, v3, LJ8/j;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    :cond_1
    check-cast v1, Ls8/j;

    .line 57
    .line 58
    iget-object v3, v0, Lb7/k;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->m(Ls8/j;LJ8/v;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    const-string v1, "Proceeding without any application identifier."

    .line 67
    .line 68
    invoke-static {v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LK8/K;

    .line 76
    .line 77
    iget-object v3, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lcom/google/firebase/auth/FirebaseAuth;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v4, v2, LJ8/v;->b:Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    const-wide/16 v4, 0x0

    .line 91
    .line 92
    cmp-long v4, v7, v4

    .line 93
    .line 94
    if-ltz v4, :cond_9

    .line 95
    .line 96
    const-wide/16 v4, 0x78

    .line 97
    .line 98
    cmp-long v4, v7, v4

    .line 99
    .line 100
    if-gtz v4, :cond_9

    .line 101
    .line 102
    iget-object v6, v2, LJ8/v;->e:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v6}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v1, LK8/K;->c:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzag;->zzc(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_4

    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5}, LC6/l;->I()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_4

    .line 130
    .line 131
    const-string v4, "NO_RECAPTCHA"

    .line 132
    .line 133
    :cond_4
    move-object v14, v4

    .line 134
    new-instance v17, Lcom/google/android/gms/internal/firebase-auth-api/zzagz;

    .line 135
    .line 136
    iget-object v4, v2, LJ8/v;->g:LJ8/w;

    .line 137
    .line 138
    if-eqz v4, :cond_5

    .line 139
    .line 140
    const/4 v4, 0x1

    .line 141
    :goto_1
    move v9, v4

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    const/4 v4, 0x0

    .line 144
    goto :goto_1

    .line 145
    :goto_2
    iget-object v10, v3, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v11, v3, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->r()Z

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    iget-object v12, v1, LK8/K;->a:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v13, v1, LK8/K;->b:Ljava/lang/String;

    .line 156
    .line 157
    move-object/from16 v5, v17

    .line 158
    .line 159
    invoke-direct/range {v5 .. v15}, Lcom/google/android/gms/internal/firebase-auth-api/zzagz;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    iget-object v4, v2, LJ8/v;->c:LPc/T;

    .line 163
    .line 164
    iget-object v5, v3, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 165
    .line 166
    iget-object v7, v5, LK8/f;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v7, Ljava/lang/String;

    .line 169
    .line 170
    if-eqz v7, :cond_6

    .line 171
    .line 172
    iget-object v5, v5, LK8/f;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v5, Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v5, :cond_6

    .line 177
    .line 178
    if-eqz v6, :cond_6

    .line 179
    .line 180
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_6

    .line 185
    .line 186
    new-instance v5, LJ8/K;

    .line 187
    .line 188
    invoke-direct {v5, v3, v4}, LJ8/K;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LPc/T;)V

    .line 189
    .line 190
    .line 191
    move-object v4, v5

    .line 192
    :cond_6
    iget-object v1, v1, LK8/K;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    new-instance v1, LK8/K;

    .line 201
    .line 202
    invoke-direct {v1, v12, v13, v14}, LK8/K;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v2, LJ8/v;->j:Z

    .line 206
    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_7
    new-instance v5, LJ8/J;

    .line 211
    .line 212
    invoke-direct {v5, v3, v2, v1, v4}, LJ8/J;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LJ8/v;LK8/K;LJ8/x;)V

    .line 213
    .line 214
    .line 215
    move-object v4, v5

    .line 216
    :cond_8
    :goto_3
    move-object/from16 v18, v4

    .line 217
    .line 218
    iget-object v1, v2, LJ8/v;->f:Landroid/app/Activity;

    .line 219
    .line 220
    iget-object v2, v2, LJ8/v;->d:Ljava/util/concurrent/Executor;

    .line 221
    .line 222
    iget-object v15, v3, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 223
    .line 224
    iget-object v3, v3, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 225
    .line 226
    move-object/from16 v19, v1

    .line 227
    .line 228
    move-object/from16 v20, v2

    .line 229
    .line 230
    move-object/from16 v16, v3

    .line 231
    .line 232
    invoke-virtual/range {v15 .. v20}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;Lcom/google/android/gms/internal/firebase-auth-api/zzagz;LJ8/x;Landroid/app/Activity;Ljava/util/concurrent/Executor;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 237
    .line 238
    const-string v2, "We only support 0-120 seconds for sms-auto-retrieval timeout"

    .line 239
    .line 240
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v1
.end method

.method public p(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc0/g;

    .line 4
    .line 5
    iget-object v1, v0, Lc0/g;->d:Lc0/r;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lxg/g;->q(Lc0/g;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    if-ne p1, v1, :cond_0

    .line 33
    .line 34
    sget-object p1, Lc0/r;->f:Lc0/r;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, LE5/Q;

    .line 38
    .line 39
    const/16 v0, 0x9

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    sget-object p1, Lc0/r;->d:Lc0/r;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    sget-object p1, Lc0/r;->a:Lc0/r;

    .line 50
    .line 51
    :goto_0
    invoke-virtual {v0, p1}, Lc0/g;->e0(Lc0/r;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public q(Ls2/o;LT5/B;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ls2/C;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_3

    .line 9
    .line 10
    invoke-virtual {p2}, LT5/B;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, LT5/B;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, LT5/B;->e:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Ls2/o;->m(II)Ls2/C;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, LN1/n;

    .line 32
    .line 33
    iget-object v5, v4, LN1/n;->n:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v8, "Invalid closed caption MIME type provided: "

    .line 58
    .line 59
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v6}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v6, v4, LN1/n;->a:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-virtual {p2}, LT5/B;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v6, p2, LT5/B;->f:Ljava/lang/String;

    .line 81
    .line 82
    :goto_3
    new-instance v7, LN1/m;

    .line 83
    .line 84
    invoke-direct {v7}, LN1/m;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v6, v7, LN1/m;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v5}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iput-object v5, v7, LN1/m;->m:Ljava/lang/String;

    .line 94
    .line 95
    iget v5, v4, LN1/n;->e:I

    .line 96
    .line 97
    iput v5, v7, LN1/m;->e:I

    .line 98
    .line 99
    iget-object v5, v4, LN1/n;->d:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v7, LN1/m;->d:Ljava/lang/String;

    .line 102
    .line 103
    iget v5, v4, LN1/n;->H:I

    .line 104
    .line 105
    iput v5, v7, LN1/m;->G:I

    .line 106
    .line 107
    iget-object v4, v4, LN1/n;->q:Ljava/util/List;

    .line 108
    .line 109
    iput-object v4, v7, LN1/m;->p:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {v7, v3}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 112
    .line 113
    .line 114
    aput-object v3, v2, v1

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
.end method

.method public s(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 4

    .line 1
    new-instance v0, Lk9/f;

    .line 2
    .line 3
    iget-object v1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v2, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v3, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lj9/a;

    .line 14
    .line 15
    invoke-direct {v0, p1, v2, v1, v3}, Lk9/f;-><init>(Ljava/io/ByteArrayOutputStream;Ljava/util/HashMap;Ljava/util/HashMap;Lj9/a;)V

    .line 16
    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lh9/e;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1, p2, v0}, Lh9/a;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p1, Lh9/b;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "No encoder for "

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 13

    .line 1
    iget p1, p0, Lb7/k;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, p1

    .line 9
    check-cast v5, LA7/P1;

    .line 10
    .line 11
    iget-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, LA7/L1;

    .line 15
    .line 16
    iget-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    move v2, p2

    .line 22
    move-object/from16 v3, p3

    .line 23
    .line 24
    move-object/from16 v4, p4

    .line 25
    .line 26
    invoke-virtual/range {v0 .. v5}, LA7/L1;->s(Ljava/lang/String;ILjava/io/IOException;[BLA7/P1;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v12, p1

    .line 33
    check-cast v12, Ljava/util/ArrayList;

    .line 34
    .line 35
    iget-object p1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v6, p1

    .line 38
    check-cast v6, LA7/L1;

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    iget-object p1, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v11, p1

    .line 44
    check-cast v11, Ljava/lang/String;

    .line 45
    .line 46
    move v8, p2

    .line 47
    move-object/from16 v9, p3

    .line 48
    .line 49
    move-object/from16 v10, p4

    .line 50
    .line 51
    invoke-virtual/range {v6 .. v12}, LA7/L1;->w(ZILjava/io/IOException;[BLjava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u()LVa/Aa;
    .locals 8

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    const-string v1, "GET Request URL: "

    .line 4
    .line 5
    invoke-static {}, LS8/f;->b()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    iget-object v3, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Lb7/k;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 16
    .line 17
    :try_start_1
    invoke-static {v4, v3}, Lb7/k;->r(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 33
    const/4 v4, 0x2

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_0
    :goto_0
    :try_start_3
    new-instance v0, Ljava/net/URL;

    .line 48
    .line 49
    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 57
    .line 58
    const/16 v1, 0x2710

    .line 59
    .line 60
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 64
    .line 65
    .line 66
    const-string v1, "GET"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Ljava/util/Map$Entry;

    .line 94
    .line 95
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Ljava/lang/String;

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v4, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_1
    move-exception v1

    .line 112
    goto :goto_6

    .line 113
    :cond_1
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 121
    .line 122
    .line 123
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    :try_start_5
    new-instance v2, Ljava/io/BufferedReader;

    .line 127
    .line 128
    new-instance v4, Ljava/io/InputStreamReader;

    .line 129
    .line 130
    const-string v5, "UTF-8"

    .line 131
    .line 132
    invoke-direct {v4, v3, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 136
    .line 137
    .line 138
    const/16 v4, 0x2000

    .line 139
    .line 140
    new-array v4, v4, [C

    .line 141
    .line 142
    new-instance v5, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    :goto_2
    invoke-virtual {v2, v4}, Ljava/io/Reader;->read([C)I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    const/4 v7, -0x1

    .line 152
    if-eq v6, v7, :cond_2

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    invoke-virtual {v5, v4, v7, v6}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 163
    goto :goto_3

    .line 164
    :catchall_2
    move-exception v1

    .line 165
    move-object v2, v3

    .line 166
    goto :goto_6

    .line 167
    :cond_3
    :goto_3
    if-eqz v3, :cond_4

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 170
    .line 171
    .line 172
    :cond_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 173
    .line 174
    .line 175
    new-instance v0, LVa/Aa;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 178
    .line 179
    .line 180
    iput v1, v0, LVa/Aa;->a:I

    .line 181
    .line 182
    iput-object v2, v0, LVa/Aa;->b:Ljava/lang/String;

    .line 183
    .line 184
    return-object v0

    .line 185
    :catchall_3
    move-exception v1

    .line 186
    :goto_4
    move-object v0, v2

    .line 187
    goto :goto_6

    .line 188
    :goto_5
    move-object v1, v0

    .line 189
    goto :goto_4

    .line 190
    :catchall_4
    move-exception v0

    .line 191
    goto :goto_5

    .line 192
    :goto_6
    if-eqz v2, :cond_5

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 195
    .line 196
    .line 197
    :cond_5
    if-eqz v0, :cond_6

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 200
    .line 201
    .line 202
    :cond_6
    throw v1
.end method

.method public v(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LT3/m;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LT3/m;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public x(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public y(Lt6/l;Landroid/net/Uri;Ljava/util/Map;JJLf6/N;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v10, 0x6

    .line 4
    const/4 v11, 0x5

    .line 5
    const/4 v12, 0x4

    .line 6
    const/4 v13, 0x3

    .line 7
    const/4 v14, 0x2

    .line 8
    const/4 v15, 0x0

    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    new-instance v16, LJ5/h;

    .line 15
    .line 16
    move-object/from16 v17, p1

    .line 17
    .line 18
    move-wide/from16 v18, p4

    .line 19
    .line 20
    move-wide/from16 v20, p6

    .line 21
    .line 22
    invoke-direct/range {v16 .. v21}, LJ5/h;-><init>(Lt6/l;JJ)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v5, v16

    .line 26
    .line 27
    iput-object v5, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v6, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, LJ5/k;

    .line 32
    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v6, v1, Lb7/k;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v6, LJ5/i;

    .line 39
    .line 40
    monitor-enter v6

    .line 41
    :try_start_0
    new-instance v7, Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v19, LJ5/i;->a:[I

    .line 44
    .line 45
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const-string v8, "Content-Type"

    .line 49
    .line 50
    move-object/from16 v9, p3

    .line 51
    .line 52
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Ljava/util/List;

    .line 57
    .line 58
    if-eqz v8, :cond_2

    .line 59
    .line 60
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    check-cast v8, Ljava/lang/String;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    :goto_0
    move-object v8, v15

    .line 75
    :goto_1
    if-nez v8, :cond_3

    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_3
    sget-object v9, Lu6/k;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    sparse-switch v9, :sswitch_data_0

    .line 86
    .line 87
    .line 88
    :goto_2
    move v9, v2

    .line 89
    goto :goto_3

    .line 90
    :sswitch_0
    const-string v9, "audio/mp3"

    .line 91
    .line 92
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-nez v9, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move v9, v14

    .line 100
    goto :goto_3

    .line 101
    :sswitch_1
    const-string v9, "audio/x-wav"

    .line 102
    .line 103
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-nez v9, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move v9, v4

    .line 111
    goto :goto_3

    .line 112
    :sswitch_2
    const-string v9, "audio/x-flac"

    .line 113
    .line 114
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-nez v9, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move v9, v3

    .line 122
    :goto_3
    packed-switch v9, :pswitch_data_0

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :pswitch_0
    :try_start_1
    const-string v8, "audio/mpeg"

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :pswitch_1
    const-string v8, "audio/wav"

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :pswitch_2
    const-string v8, "audio/flac"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    :goto_4
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    sparse-switch v9, :sswitch_data_1

    .line 139
    .line 140
    .line 141
    :goto_5
    move v14, v2

    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :sswitch_3
    const-string v9, "video/x-matroska"

    .line 145
    .line 146
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-nez v8, :cond_7

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_7
    const/16 v14, 0x19

    .line 154
    .line 155
    goto/16 :goto_6

    .line 156
    .line 157
    :sswitch_4
    const-string v9, "audio/webm"

    .line 158
    .line 159
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_8

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_8
    const/16 v14, 0x18

    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :sswitch_5
    const-string v9, "audio/mpeg"

    .line 171
    .line 172
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-nez v8, :cond_9

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    const/16 v14, 0x17

    .line 180
    .line 181
    goto/16 :goto_6

    .line 182
    .line 183
    :sswitch_6
    const-string v9, "audio/midi"

    .line 184
    .line 185
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-nez v8, :cond_a

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    const/16 v14, 0x16

    .line 193
    .line 194
    goto/16 :goto_6

    .line 195
    .line 196
    :sswitch_7
    const-string v9, "audio/flac"

    .line 197
    .line 198
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-nez v8, :cond_b

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_b
    const/16 v14, 0x15

    .line 206
    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :sswitch_8
    const-string v9, "audio/eac3"

    .line 210
    .line 211
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-nez v8, :cond_c

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_c
    const/16 v14, 0x14

    .line 219
    .line 220
    goto/16 :goto_6

    .line 221
    .line 222
    :sswitch_9
    const-string v9, "audio/3gpp"

    .line 223
    .line 224
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-nez v8, :cond_d

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_d
    const/16 v14, 0x13

    .line 232
    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :sswitch_a
    const-string v9, "video/mp4"

    .line 236
    .line 237
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-nez v8, :cond_e

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_e
    const/16 v14, 0x12

    .line 245
    .line 246
    goto/16 :goto_6

    .line 247
    .line 248
    :sswitch_b
    const-string v9, "audio/wav"

    .line 249
    .line 250
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-nez v8, :cond_f

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_f
    const/16 v14, 0x11

    .line 258
    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :sswitch_c
    const-string v9, "audio/ogg"

    .line 262
    .line 263
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-nez v8, :cond_10

    .line 268
    .line 269
    goto/16 :goto_5

    .line 270
    .line 271
    :cond_10
    move v14, v0

    .line 272
    goto/16 :goto_6

    .line 273
    .line 274
    :sswitch_d
    const-string v9, "audio/mp4"

    .line 275
    .line 276
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-nez v8, :cond_11

    .line 281
    .line 282
    goto/16 :goto_5

    .line 283
    .line 284
    :cond_11
    const/16 v14, 0xf

    .line 285
    .line 286
    goto/16 :goto_6

    .line 287
    .line 288
    :sswitch_e
    const-string v9, "audio/amr"

    .line 289
    .line 290
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-nez v8, :cond_12

    .line 295
    .line 296
    goto/16 :goto_5

    .line 297
    .line 298
    :cond_12
    const/16 v14, 0xe

    .line 299
    .line 300
    goto/16 :goto_6

    .line 301
    .line 302
    :sswitch_f
    const-string v9, "audio/ac4"

    .line 303
    .line 304
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-nez v8, :cond_13

    .line 309
    .line 310
    goto/16 :goto_5

    .line 311
    .line 312
    :cond_13
    const/16 v14, 0xd

    .line 313
    .line 314
    goto/16 :goto_6

    .line 315
    .line 316
    :sswitch_10
    const-string v9, "audio/ac3"

    .line 317
    .line 318
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    if-nez v8, :cond_14

    .line 323
    .line 324
    goto/16 :goto_5

    .line 325
    .line 326
    :cond_14
    const/16 v14, 0xc

    .line 327
    .line 328
    goto/16 :goto_6

    .line 329
    .line 330
    :sswitch_11
    const-string v9, "video/x-flv"

    .line 331
    .line 332
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-nez v8, :cond_15

    .line 337
    .line 338
    goto/16 :goto_5

    .line 339
    .line 340
    :cond_15
    const/16 v14, 0xb

    .line 341
    .line 342
    goto/16 :goto_6

    .line 343
    .line 344
    :sswitch_12
    const-string v9, "application/webm"

    .line 345
    .line 346
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    if-nez v8, :cond_16

    .line 351
    .line 352
    goto/16 :goto_5

    .line 353
    .line 354
    :cond_16
    const/16 v14, 0xa

    .line 355
    .line 356
    goto/16 :goto_6

    .line 357
    .line 358
    :sswitch_13
    const-string v9, "audio/x-matroska"

    .line 359
    .line 360
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    if-nez v8, :cond_17

    .line 365
    .line 366
    goto/16 :goto_5

    .line 367
    .line 368
    :cond_17
    const/16 v14, 0x9

    .line 369
    .line 370
    goto/16 :goto_6

    .line 371
    .line 372
    :sswitch_14
    const-string v9, "text/vtt"

    .line 373
    .line 374
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    if-nez v8, :cond_18

    .line 379
    .line 380
    goto/16 :goto_5

    .line 381
    .line 382
    :cond_18
    const/16 v14, 0x8

    .line 383
    .line 384
    goto/16 :goto_6

    .line 385
    .line 386
    :sswitch_15
    const-string v9, "video/x-msvideo"

    .line 387
    .line 388
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-nez v8, :cond_19

    .line 393
    .line 394
    goto/16 :goto_5

    .line 395
    .line 396
    :cond_19
    const/4 v14, 0x7

    .line 397
    goto :goto_6

    .line 398
    :sswitch_16
    const-string v9, "application/mp4"

    .line 399
    .line 400
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-nez v8, :cond_1a

    .line 405
    .line 406
    goto/16 :goto_5

    .line 407
    .line 408
    :cond_1a
    move v14, v10

    .line 409
    goto :goto_6

    .line 410
    :sswitch_17
    const-string v9, "image/jpeg"

    .line 411
    .line 412
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    if-nez v8, :cond_1b

    .line 417
    .line 418
    goto/16 :goto_5

    .line 419
    .line 420
    :cond_1b
    move v14, v11

    .line 421
    goto :goto_6

    .line 422
    :sswitch_18
    const-string v9, "audio/amr-wb"

    .line 423
    .line 424
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    if-nez v8, :cond_1c

    .line 429
    .line 430
    goto/16 :goto_5

    .line 431
    .line 432
    :cond_1c
    move v14, v12

    .line 433
    goto :goto_6

    .line 434
    :sswitch_19
    const-string v9, "video/webm"

    .line 435
    .line 436
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    if-nez v8, :cond_1d

    .line 441
    .line 442
    goto/16 :goto_5

    .line 443
    .line 444
    :cond_1d
    move v14, v13

    .line 445
    goto :goto_6

    .line 446
    :sswitch_1a
    const-string v9, "video/mp2t"

    .line 447
    .line 448
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    if-nez v8, :cond_20

    .line 453
    .line 454
    goto/16 :goto_5

    .line 455
    .line 456
    :sswitch_1b
    const-string v9, "video/mp2p"

    .line 457
    .line 458
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    if-nez v8, :cond_1e

    .line 463
    .line 464
    goto/16 :goto_5

    .line 465
    .line 466
    :cond_1e
    move v14, v4

    .line 467
    goto :goto_6

    .line 468
    :sswitch_1c
    const-string v9, "audio/eac3-joc"

    .line 469
    .line 470
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    if-nez v8, :cond_1f

    .line 475
    .line 476
    goto/16 :goto_5

    .line 477
    .line 478
    :cond_1f
    move v14, v3

    .line 479
    :cond_20
    :goto_6
    packed-switch v14, :pswitch_data_1

    .line 480
    .line 481
    .line 482
    :goto_7
    move v10, v2

    .line 483
    goto :goto_8

    .line 484
    :pswitch_3
    const/4 v10, 0x7

    .line 485
    goto :goto_8

    .line 486
    :pswitch_4
    const/16 v10, 0xf

    .line 487
    .line 488
    goto :goto_8

    .line 489
    :pswitch_5
    move v10, v12

    .line 490
    goto :goto_8

    .line 491
    :pswitch_6
    const/16 v10, 0xc

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :pswitch_7
    const/16 v10, 0x9

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :pswitch_8
    move v10, v4

    .line 498
    goto :goto_8

    .line 499
    :pswitch_9
    move v10, v11

    .line 500
    goto :goto_8

    .line 501
    :pswitch_a
    const/16 v10, 0xd

    .line 502
    .line 503
    goto :goto_8

    .line 504
    :pswitch_b
    move v10, v0

    .line 505
    goto :goto_8

    .line 506
    :pswitch_c
    const/16 v10, 0x8

    .line 507
    .line 508
    goto :goto_8

    .line 509
    :pswitch_d
    const/16 v10, 0xe

    .line 510
    .line 511
    goto :goto_8

    .line 512
    :pswitch_e
    move v10, v13

    .line 513
    goto :goto_8

    .line 514
    :pswitch_f
    const/16 v10, 0xb

    .line 515
    .line 516
    goto :goto_8

    .line 517
    :pswitch_10
    const/16 v10, 0xa

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :pswitch_11
    move v10, v3

    .line 521
    :goto_8
    :pswitch_12
    if-eq v10, v2, :cond_21

    .line 522
    .line 523
    :try_start_2
    invoke-static {v7, v10}, LJ5/i;->a(Ljava/util/ArrayList;I)V

    .line 524
    .line 525
    .line 526
    :cond_21
    invoke-static/range {p2 .. p2}, Lu6/a;->v(Landroid/net/Uri;)I

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    if-eq v8, v2, :cond_22

    .line 531
    .line 532
    if-eq v8, v10, :cond_22

    .line 533
    .line 534
    invoke-static {v7, v8}, LJ5/i;->a(Ljava/util/ArrayList;I)V

    .line 535
    .line 536
    .line 537
    :cond_22
    move v2, v3

    .line 538
    :goto_9
    if-ge v2, v0, :cond_24

    .line 539
    .line 540
    aget v9, v19, v2

    .line 541
    .line 542
    if-eq v9, v10, :cond_23

    .line 543
    .line 544
    if-eq v9, v8, :cond_23

    .line 545
    .line 546
    invoke-static {v7, v9}, LJ5/i;->a(Ljava/util/ArrayList;I)V

    .line 547
    .line 548
    .line 549
    :cond_23
    add-int/2addr v2, v4

    .line 550
    goto :goto_9

    .line 551
    :catchall_0
    move-exception v0

    .line 552
    goto/16 :goto_14

    .line 553
    .line 554
    :cond_24
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    new-array v0, v0, [LJ5/k;

    .line 559
    .line 560
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    check-cast v0, [LJ5/k;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 565
    .line 566
    monitor-exit v6

    .line 567
    array-length v2, v0

    .line 568
    if-ne v2, v4, :cond_25

    .line 569
    .line 570
    aget-object v0, v0, v3

    .line 571
    .line 572
    iput-object v0, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 573
    .line 574
    goto/16 :goto_13

    .line 575
    .line 576
    :cond_25
    array-length v2, v0

    .line 577
    move v6, v3

    .line 578
    :goto_a
    if-ge v6, v2, :cond_2d

    .line 579
    .line 580
    aget-object v7, v0, v6

    .line 581
    .line 582
    :try_start_3
    invoke-interface {v7, v5}, LJ5/k;->i(LJ5/l;)Z

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    if-eqz v8, :cond_26

    .line 587
    .line 588
    iput-object v7, v1, Lb7/k;->c:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/io/EOFException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 589
    .line 590
    iput v3, v5, LJ5/h;->f:I

    .line 591
    .line 592
    goto :goto_11

    .line 593
    :catchall_1
    move-exception v0

    .line 594
    goto :goto_d

    .line 595
    :cond_26
    iget-object v7, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v7, LJ5/k;

    .line 598
    .line 599
    if-nez v7, :cond_28

    .line 600
    .line 601
    iget-wide v7, v5, LJ5/h;->d:J

    .line 602
    .line 603
    cmp-long v7, v7, p4

    .line 604
    .line 605
    if-nez v7, :cond_27

    .line 606
    .line 607
    goto :goto_b

    .line 608
    :cond_27
    move v7, v3

    .line 609
    goto :goto_c

    .line 610
    :cond_28
    :goto_b
    move v7, v4

    .line 611
    :goto_c
    invoke-static {v7}, Lu6/a;->i(Z)V

    .line 612
    .line 613
    .line 614
    iput v3, v5, LJ5/h;->f:I

    .line 615
    .line 616
    goto :goto_10

    .line 617
    :goto_d
    iget-object v2, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v2, LJ5/k;

    .line 620
    .line 621
    if-nez v2, :cond_2a

    .line 622
    .line 623
    iget-wide v6, v5, LJ5/h;->d:J

    .line 624
    .line 625
    cmp-long v2, v6, p4

    .line 626
    .line 627
    if-nez v2, :cond_29

    .line 628
    .line 629
    goto :goto_e

    .line 630
    :cond_29
    move v4, v3

    .line 631
    :cond_2a
    :goto_e
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 632
    .line 633
    .line 634
    iput v3, v5, LJ5/h;->f:I

    .line 635
    .line 636
    throw v0

    .line 637
    :catch_0
    iget-object v7, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v7, LJ5/k;

    .line 640
    .line 641
    if-nez v7, :cond_2c

    .line 642
    .line 643
    iget-wide v7, v5, LJ5/h;->d:J

    .line 644
    .line 645
    cmp-long v7, v7, p4

    .line 646
    .line 647
    if-nez v7, :cond_2b

    .line 648
    .line 649
    goto :goto_f

    .line 650
    :cond_2b
    move v7, v3

    .line 651
    goto :goto_c

    .line 652
    :cond_2c
    :goto_f
    move v7, v4

    .line 653
    goto :goto_c

    .line 654
    :goto_10
    add-int/2addr v6, v4

    .line 655
    goto :goto_a

    .line 656
    :cond_2d
    :goto_11
    iget-object v2, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v2, LJ5/k;

    .line 659
    .line 660
    if-nez v2, :cond_30

    .line 661
    .line 662
    new-instance v2, LN5/d;

    .line 663
    .line 664
    new-instance v5, Ljava/lang/StringBuilder;

    .line 665
    .line 666
    const-string v6, "None of the available extractors ("

    .line 667
    .line 668
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    sget v6, Lu6/v;->a:I

    .line 672
    .line 673
    new-instance v6, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 676
    .line 677
    .line 678
    move v7, v3

    .line 679
    :goto_12
    array-length v8, v0

    .line 680
    if-ge v7, v8, :cond_2f

    .line 681
    .line 682
    aget-object v8, v0, v7

    .line 683
    .line 684
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v8

    .line 692
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    array-length v8, v0

    .line 696
    sub-int/2addr v8, v4

    .line 697
    if-ge v7, v8, :cond_2e

    .line 698
    .line 699
    const-string v8, ", "

    .line 700
    .line 701
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    :cond_2e
    add-int/2addr v7, v4

    .line 705
    goto :goto_12

    .line 706
    :cond_2f
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    const-string v0, ") could read the stream."

    .line 714
    .line 715
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-direct {v2, v0, v15, v3, v4}, LE5/o0;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 723
    .line 724
    .line 725
    throw v2

    .line 726
    :cond_30
    :goto_13
    iget-object v0, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, LJ5/k;

    .line 729
    .line 730
    move-object/from16 v2, p8

    .line 731
    .line 732
    invoke-interface {v0, v2}, LJ5/k;->h(Lf6/N;)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :goto_14
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 737
    throw v0

    .line 738
    nop

    :sswitch_data_0
    .sparse-switch
        -0x3c11ec0a -> :sswitch_2
        -0x22f81362 -> :sswitch_1
        0xb26c537 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7e929daa -> :sswitch_1c
        -0x6315f78b -> :sswitch_1b
        -0x6315f787 -> :sswitch_1a
        -0x63118f53 -> :sswitch_19
        -0x5fc6f775 -> :sswitch_18
        -0x58a7d764 -> :sswitch_17
        -0x4a681e4e -> :sswitch_16
        -0x405dba54 -> :sswitch_15
        -0x3be2f26c -> :sswitch_14
        -0x17118226 -> :sswitch_13
        -0x2974308 -> :sswitch_12
        0xd45707 -> :sswitch_11
        0xb269698 -> :sswitch_10
        0xb269699 -> :sswitch_f
        0xb26980d -> :sswitch_e
        0xb26c538 -> :sswitch_d
        0xb26cbd6 -> :sswitch_c
        0xb26e933 -> :sswitch_b
        0x4f62635d -> :sswitch_a
        0x59976a2d -> :sswitch_9
        0x59ae0c65 -> :sswitch_8
        0x59aeaa01 -> :sswitch_7
        0x59b1cdba -> :sswitch_6
        0x59b1e81e -> :sswitch_5
        0x59b64a32 -> :sswitch_4
        0x79909c15 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_12
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_12
        :pswitch_12
        :pswitch_9
        :pswitch_11
        :pswitch_8
        :pswitch_e
        :pswitch_c
        :pswitch_7
        :pswitch_6
        :pswitch_c
        :pswitch_e
        :pswitch_11
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_12
        :pswitch_12
    .end packed-switch
.end method
