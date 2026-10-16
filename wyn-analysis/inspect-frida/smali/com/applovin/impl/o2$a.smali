.class Lcom/applovin/impl/o2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/o2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/applovin/impl/sdk/o;

.field private final b:Lcom/applovin/impl/t4;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/sdk/o;Lcom/applovin/impl/t4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/applovin/impl/o2$a;->b:Lcom/applovin/impl/t4;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/o2$a;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    return-object p0
.end method

.method private a()V
    .locals 4

    .line 2
    :try_start_0
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 3
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    const-string v2, "LicenseVerificationManager"

    const-string v3, "Failed to unbind license service"

    invoke-virtual {v1, v2, v3, v0}, Lcom/applovin/impl/sdk/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/o2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/applovin/impl/o2$a;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/applovin/impl/o2$a;)Lcom/applovin/impl/t4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/o2$a;->b:Lcom/applovin/impl/t4;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "LicenseVerificationManager"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "License service connected: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, v1, p1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget p1, Lp4/b;->a:I

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p1, "com.android.vending.licensing.ILicensingService"

    .line 35
    .line 36
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    instance-of v0, p1, Lcom/android/vending/licensing/ILicensingService;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    check-cast p1, Lcom/android/vending/licensing/ILicensingService;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p1, Lp4/a;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p2, p1, Lp4/a;->a:Landroid/os/IBinder;

    .line 55
    .line 56
    :goto_0
    :try_start_0
    new-instance p2, Ljava/security/SecureRandom;

    .line 57
    .line 58
    invoke-direct {p2}, Ljava/security/SecureRandom;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/util/Random;->nextInt()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    int-to-long v2, p2

    .line 66
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v4, Lcom/applovin/impl/o2$a$a;

    .line 75
    .line 76
    invoke-direct {v4, p0, p2}, Lcom/applovin/impl/o2$a$a;-><init>(Lcom/applovin/impl/o2$a;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v2, v3, v0, v4}, Lcom/android/vending/licensing/ILicensingService;->P(JLjava/lang/String;Lp4/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catch_0
    move-exception p1

    .line 84
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_3

    .line 89
    .line 90
    iget-object p2, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    .line 91
    .line 92
    const-string v0, "Failed to check license"

    .line 93
    .line 94
    invoke-virtual {p2, v1, v0, p1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-direct {p0}, Lcom/applovin/impl/o2$a;->a()V

    .line 98
    .line 99
    .line 100
    iget-object p2, p0, Lcom/applovin/impl/o2$a;->b:Lcom/applovin/impl/t4;

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "License service disconnected"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/applovin/impl/o2$a;->a:Lcom/applovin/impl/sdk/o;

    .line 10
    .line 11
    const-string v1, "LicenseVerificationManager"

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Lcom/applovin/impl/sdk/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/o2$a;->b:Lcom/applovin/impl/t4;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/applovin/impl/t4;->c()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/applovin/impl/o2$a;->b:Lcom/applovin/impl/t4;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method
