.class public Lcom/applovin/impl/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/impl/o2$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/applovin/impl/sdk/k;

.field private final b:Lcom/applovin/impl/sdk/o;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/sdk/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/applovin/impl/o2;->a:Lcom/applovin/impl/sdk/k;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/applovin/impl/o2;->b:Lcom/applovin/impl/sdk/o;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(J)Lcom/applovin/impl/t4;
    .locals 8

    .line 1
    const-string v1, "LicenseVerificationManager"

    .line 2
    .line 3
    new-instance v4, Lcom/applovin/impl/t4;

    .line 4
    .line 5
    const-string v0, "verify_license"

    .line 6
    .line 7
    invoke-direct {v4, v0}, Lcom/applovin/impl/t4;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, p1, v2

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    new-instance v5, Ljava/lang/Exception;

    .line 17
    .line 18
    const-string v0, "License Verification Timed Out"

    .line 19
    .line 20
    invoke-direct {v5, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v7, p0, Lcom/applovin/impl/o2;->a:Lcom/applovin/impl/sdk/k;

    .line 24
    .line 25
    const-string v6, "verify_license_timeout"

    .line 26
    .line 27
    move-wide v2, p1

    .line 28
    invoke-static/range {v2 .. v7}, Lcom/applovin/impl/j6;->a(JLcom/applovin/impl/t4;Ljava/lang/Object;Ljava/lang/String;Lcom/applovin/impl/sdk/k;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    .line 32
    .line 33
    const-class p2, Lcom/android/vending/licensing/ILicensingService;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p2, "com.android.vending"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    new-instance p2, Lcom/applovin/impl/o2$a;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/applovin/impl/o2;->b:Lcom/applovin/impl/sdk/o;

    .line 50
    .line 51
    invoke-direct {p2, v0, v4}, Lcom/applovin/impl/o2$a;-><init>(Lcom/applovin/impl/sdk/o;Lcom/applovin/impl/t4;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {v0, p1, p2, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    iget-object p1, p0, Lcom/applovin/impl/o2;->b:Lcom/applovin/impl/sdk/o;

    .line 72
    .line 73
    const-string p2, "Failed to bind to the license service"

    .line 74
    .line 75
    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    .line 83
    .line 84
    const-string p2, "Failed to bind to license service"

    .line 85
    .line 86
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, p1}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :goto_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_2

    .line 98
    .line 99
    iget-object p2, p0, Lcom/applovin/impl/o2;->b:Lcom/applovin/impl/sdk/o;

    .line 100
    .line 101
    const-string v0, "Failed to verify license"

    .line 102
    .line 103
    invoke-virtual {p2, v1, v0, p1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v4, p1}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 107
    .line 108
    .line 109
    :cond_3
    return-object v4
.end method
