.class Lcom/applovin/impl/z0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/z0;->c(Lcom/applovin/impl/v0;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/applovin/impl/x0;

.field final synthetic c:Lcom/applovin/impl/v0;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lcom/applovin/impl/z0;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/z0;ZLcom/applovin/impl/x0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/applovin/impl/z0$b;->a:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/applovin/impl/z0$b;->b:Lcom/applovin/impl/x0;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/applovin/impl/z0$b;->c:Lcom/applovin/impl/v0;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/applovin/impl/z0$b;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    iget-object p2, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;)Lcom/applovin/impl/v0;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 8
    .line 9
    invoke-static {p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Landroid/app/Dialog;)Landroid/app/Dialog;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-object p2, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/applovin/impl/z0;->e(Lcom/applovin/impl/z0;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    sub-long/2addr v0, v2

    .line 23
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const-string v0, "duration_ms"

    .line 28
    .line 29
    invoke-static {v0, p2}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-boolean v0, p0, Lcom/applovin/impl/z0$b;->a:Z

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "details"

    .line 40
    .line 41
    invoke-static {v1, v0, p2}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/applovin/impl/z0;->d(Lcom/applovin/impl/z0;)Lcom/applovin/impl/sdk/k;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Lcom/applovin/impl/d2;->o:Lcom/applovin/impl/d2;

    .line 55
    .line 56
    invoke-virtual {v0, v1, p2}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/applovin/impl/z0$b;->b:Lcom/applovin/impl/x0;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/applovin/impl/x0;->a()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p2, v0}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;I)Lcom/applovin/impl/v0;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-nez p2, :cond_0

    .line 72
    .line 73
    iget-object p1, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 74
    .line 75
    const-string p2, "Destination state for TOS/PP alert is null"

    .line 76
    .line 77
    invoke-static {p1, p2}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/z0$b;->e:Lcom/applovin/impl/z0;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/applovin/impl/z0$b;->c:Lcom/applovin/impl/v0;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/applovin/impl/z0$b;->d:Landroid/app/Activity;

    .line 86
    .line 87
    invoke-static {v0, v1, p2, v2}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    sget-object v0, Lcom/applovin/impl/v0$b;->a:Lcom/applovin/impl/v0$b;

    .line 95
    .line 96
    if-eq p2, v0, :cond_1

    .line 97
    .line 98
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method
