.class public final synthetic Lkd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkd/n;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lkd/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/m;->a:Lkd/n;

    iput-object p2, p0, Lkd/m;->b:Ljava/lang/String;

    iput-object p3, p0, Lkd/m;->c:Ljava/lang/String;

    iput-object p4, p0, Lkd/m;->d:Ljava/lang/String;

    iput-object p5, p0, Lkd/m;->e:Ljava/lang/String;

    iput-wide p6, p0, Lkd/m;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkd/m;->a:Lkd/n;

    .line 9
    .line 10
    iget-object v2, v1, Lkd/n;->a:Lkd/o;

    .line 11
    .line 12
    iget-object v3, p0, Lkd/m;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "urlArg"

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lkd/m;->c:Ljava/lang/String;

    .line 20
    .line 21
    const-string v5, "userAgentArg"

    .line 22
    .line 23
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Lkd/m;->d:Ljava/lang/String;

    .line 27
    .line 28
    const-string v6, "contentDispositionArg"

    .line 29
    .line 30
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v6, p0, Lkd/m;->e:Ljava/lang/String;

    .line 34
    .line 35
    const-string v7, "mimetypeArg"

    .line 36
    .line 37
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v2, Lkd/o;->a:LC8/i;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, LC8/i;->q()Luc/n;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    new-instance v8, LVa/X7;

    .line 50
    .line 51
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart"

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Luc/f;

    .line 57
    .line 58
    invoke-direct {v8, v2, v7, v10, v9}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-wide v9, p0, Lkd/m;->f:J

    .line 62
    .line 63
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/4 v7, 0x6

    .line 68
    new-array v7, v7, [Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    aput-object v1, v7, v9

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    aput-object v3, v7, v1

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    aput-object v4, v7, v1

    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    aput-object v5, v7, v1

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    aput-object v6, v7, v1

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    aput-object v2, v7, v1

    .line 87
    .line 88
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, Lk2/c;

    .line 93
    .line 94
    const/16 v3, 0xd

    .line 95
    .line 96
    invoke-direct {v2, v0, v3}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8, v1, v2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method
