.class public final Lad/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;


# instance fields
.field public final a:Ltc/g;

.field public b:Z


# direct methods
.method public constructor <init>(Ltc/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/W;->a:Ltc/g;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lad/W;->b:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onInitializationComplete(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lad/W;->b:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    const-class v2, Lcom/google/android/gms/ads/MobileAds;

    .line 9
    .line 10
    const-string v3, "setPlugin"

    .line 11
    .line 12
    new-array v4, v1, [Ljava/lang/Class;

    .line 13
    .line 14
    const-class v5, Ljava/lang/String;

    .line 15
    .line 16
    aput-object v5, v4, v0

    .line 17
    .line 18
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    new-array v3, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v4, "Flutter-GMA-5.3.1"

    .line 28
    .line 29
    aput-object v4, v3, v0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :catch_0
    new-instance v0, Lad/F;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lad/F;-><init>(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lad/W;->a:Ltc/g;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v1, p0, Lad/W;->b:Z

    .line 46
    .line 47
    return-void
.end method
