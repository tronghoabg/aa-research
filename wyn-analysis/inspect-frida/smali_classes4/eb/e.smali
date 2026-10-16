.class public final Leb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llc/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Leb/e;->a:I

    iput-object p1, p0, Leb/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method

.method private final d()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, Leb/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leb/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Llc/b;

    .line 9
    .line 10
    iget-object v1, v0, Llc/b;->t:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Llc/a;

    .line 27
    .line 28
    invoke-interface {v2}, Llc/a;->a()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :goto_1
    iget-object v1, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 33
    .line 34
    iget-object v2, v1, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x0

    .line 41
    if-lez v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v1, v1, Lio/flutter/plugin/platform/q;->v:Lio/flutter/plugin/platform/n;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_2
    iget-object v1, v0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 54
    .line 55
    iget-object v2, v1, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-lez v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iget-object v1, v1, Lio/flutter/plugin/platform/p;->p:Lio/flutter/plugin/platform/n;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    const/4 v1, 0x0

    .line 74
    iget-object v0, v0, Llc/b;->k:Lq/o;

    .line 75
    .line 76
    iput-object v1, v0, Lq/o;->f:Ljava/lang/Object;

    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    iget-object v0, p0, Leb/e;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Leb/f;

    .line 82
    .line 83
    iget-object v0, v0, Leb/f;->b:LDd/c;

    .line 84
    .line 85
    invoke-virtual {v0}, LDd/c;->B()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 1

    .line 1
    iget v0, p0, Leb/e;->a:I

    return-void
.end method
