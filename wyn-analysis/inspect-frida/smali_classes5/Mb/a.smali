.class public final synthetic LMb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILcom/vungle/ads/internal/util/j;Landroid/view/Window;Landroid/graphics/Rect;Ltf/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LMb/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LMb/a;->b:I

    iput p2, p0, LMb/a;->c:I

    iput-object p3, p0, LMb/a;->d:Ljava/lang/Object;

    iput-object p4, p0, LMb/a;->e:Ljava/lang/Object;

    iput-object p5, p0, LMb/a;->f:Ljava/lang/Object;

    iput-object p6, p0, LMb/a;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lme/a;[BIILaa/f;Ljava/util/HashMap;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LMb/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMb/a;->d:Ljava/lang/Object;

    iput-object p2, p0, LMb/a;->e:Ljava/lang/Object;

    iput p3, p0, LMb/a;->b:I

    iput p4, p0, LMb/a;->c:I

    iput-object p5, p0, LMb/a;->f:Ljava/lang/Object;

    iput-object p6, p0, LMb/a;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LMb/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LMb/a;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lme/a;

    .line 9
    .line 10
    iget-object v1, p0, LMb/a;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, [B

    .line 13
    .line 14
    iget v2, p0, LMb/a;->b:I

    .line 15
    .line 16
    iget v3, p0, LMb/a;->c:I

    .line 17
    .line 18
    iget-object v4, p0, LMb/a;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Laa/f;

    .line 21
    .line 22
    iget-object v5, p0, LMb/a;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v0, v0, Lme/a;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La2/v;

    .line 32
    .line 33
    invoke-static {v1}, Lu9/c;->l([B)Lu9/c;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, La2/v;->r(Lu9/c;)Ls9/k;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ls9/o;

    .line 42
    .line 43
    new-instance v6, Ls8/q;

    .line 44
    .line 45
    int-to-long v7, v2

    .line 46
    invoke-direct {v6, v7, v8, v3}, Ls8/q;-><init>(JI)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v6}, Ls9/o;-><init>(Ls8/q;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, v0, Ls9/k;->d:Ls9/o;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    invoke-virtual {v4, v0}, Laa/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    :cond_0
    monitor-enter v5

    .line 69
    :try_start_1
    iget-object v1, v0, Ls9/k;->a:Ls9/h;

    .line 70
    .line 71
    invoke-virtual {v5, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    monitor-exit v5

    .line 75
    :cond_1
    return-void

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw v0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    const-string v1, "MaybeDocument failed to parse: %s"

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    new-array v2, v2, [Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    aput-object v0, v2, v3

    .line 87
    .line 88
    invoke-static {v1, v2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    throw v0

    .line 93
    :pswitch_0
    iget-object v0, p0, LMb/a;->f:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v5, v0

    .line 96
    check-cast v5, Landroid/graphics/Rect;

    .line 97
    .line 98
    iget-object v0, p0, LMb/a;->g:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v6, v0

    .line 101
    check-cast v6, Ltf/l;

    .line 102
    .line 103
    iget v1, p0, LMb/a;->b:I

    .line 104
    .line 105
    iget v2, p0, LMb/a;->c:I

    .line 106
    .line 107
    iget-object v0, p0, LMb/a;->d:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v3, v0

    .line 110
    check-cast v3, Lcom/vungle/ads/internal/util/j;

    .line 111
    .line 112
    iget-object v0, p0, LMb/a;->e:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v4, v0

    .line 115
    check-cast v4, Landroid/view/Window;

    .line 116
    .line 117
    invoke-static/range {v1 .. v6}, Lcom/vungle/ads/internal/util/g;->a(IILcom/vungle/ads/internal/util/j;Landroid/view/Window;Landroid/graphics/Rect;Ltf/l;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
