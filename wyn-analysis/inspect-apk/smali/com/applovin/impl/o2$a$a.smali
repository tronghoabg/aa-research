.class Lcom/applovin/impl/o2$a$a;
.super Lp4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/o2$a;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/applovin/impl/o2$a;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/o2$a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/o2$a$a;->b:Lcom/applovin/impl/o2$a;

    .line 2
    .line 3
    iput p2, p0, Lcom/applovin/impl/o2$a$a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string p1, "com.android.vending.licensing.ILicenseResultListener"

    .line 9
    .line 10
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/o2$a$a;->b:Lcom/applovin/impl/o2$a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/applovin/impl/o2$a;->a(Lcom/applovin/impl/o2$a;)Lcom/applovin/impl/sdk/o;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/applovin/impl/o2$a$a;->b:Lcom/applovin/impl/o2$a;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/applovin/impl/o2$a;->a(Lcom/applovin/impl/o2$a;)Lcom/applovin/impl/sdk/o;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "Verified with code "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "LicenseVerificationManager"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/o2$a$a;->b:Lcom/applovin/impl/o2$a;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/applovin/impl/o2$a;->b(Lcom/applovin/impl/o2$a;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/applovin/impl/o2$a$a;->b:Lcom/applovin/impl/o2$a;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/applovin/impl/o2$a;->c(Lcom/applovin/impl/o2$a;)Lcom/applovin/impl/t4;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {}, Lcom/applovin/impl/p2;->a()Lcom/applovin/impl/p2$a;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, p2}, Lcom/applovin/impl/p2$a;->b(Ljava/lang/String;)Lcom/applovin/impl/p2$a;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2, p3}, Lcom/applovin/impl/p2$a;->a(Ljava/lang/String;)Lcom/applovin/impl/p2$a;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2, p1}, Lcom/applovin/impl/p2$a;->b(I)Lcom/applovin/impl/p2$a;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget p2, p0, Lcom/applovin/impl/o2$a$a;->a:I

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/applovin/impl/p2$a;->a(I)Lcom/applovin/impl/p2$a;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/applovin/impl/p2$a;->a()Lcom/applovin/impl/p2;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1}, Lcom/applovin/impl/t4;->b(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 75
    .line 76
    .line 77
    return-void
.end method
