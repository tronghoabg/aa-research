.class public final synthetic Lkd/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkd/a0;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lkd/a0;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd/Z;->a:Lkd/a0;

    iput p2, p0, Lkd/Z;->b:I

    iput p3, p0, Lkd/Z;->c:I

    iput p4, p0, Lkd/Z;->d:I

    iput p5, p0, Lkd/Z;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lkd/Z;->b:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget v2, p0, Lkd/Z;->c:I

    .line 5
    .line 6
    int-to-long v2, v2

    .line 7
    iget v4, p0, Lkd/Z;->d:I

    .line 8
    .line 9
    int-to-long v4, v4

    .line 10
    iget v6, p0, Lkd/Z;->e:I

    .line 11
    .line 12
    int-to-long v6, v6

    .line 13
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 14
    .line 15
    const/16 v9, 0x1a

    .line 16
    .line 17
    invoke-direct {v8, v9}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iget-object v9, p0, Lkd/Z;->a:Lkd/a0;

    .line 21
    .line 22
    iget-object v10, v9, Lkd/a0;->a:Lkd/s;

    .line 23
    .line 24
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v10, v10, Lkd/s;->a:LC8/i;

    .line 28
    .line 29
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    new-instance v12, LVa/X7;

    .line 37
    .line 38
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    iget-object v10, v10, LC8/i;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v10, Luc/f;

    .line 44
    .line 45
    invoke-direct {v12, v10, v11, v14, v13}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const/4 v4, 0x5

    .line 65
    new-array v4, v4, [Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    aput-object v9, v4, v5

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    aput-object v0, v4, v5

    .line 72
    .line 73
    const/4 v0, 0x2

    .line 74
    aput-object v1, v4, v0

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    aput-object v2, v4, v0

    .line 78
    .line 79
    const/4 v0, 0x4

    .line 80
    aput-object v3, v4, v0

    .line 81
    .line 82
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v1, Lkd/D;

    .line 87
    .line 88
    const/16 v2, 0x12

    .line 89
    .line 90
    invoke-direct {v1, v8, v2}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
