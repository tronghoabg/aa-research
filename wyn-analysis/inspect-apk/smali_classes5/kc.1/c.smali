.class public final Lkc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkc/c;->a:I

    iput-object p1, p0, Lkc/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lkc/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, Lkc/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lkc/r;

    .line 10
    .line 11
    iput-boolean v0, v1, Lkc/r;->g:Z

    .line 12
    .line 13
    iget-object v0, v1, Lkc/r;->f:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lio/flutter/embedding/engine/renderer/l;

    .line 30
    .line 31
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/l;->d()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    :pswitch_0
    return-void

    .line 36
    :pswitch_1
    iget-object v0, p0, Lkc/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkc/f;

    .line 39
    .line 40
    iget-object v1, v0, Lkc/f;->a:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-interface {v1}, Lkc/e;->d()V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, v0, Lkc/f;->g:Z

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 2

    .line 1
    iget v0, p0, Lkc/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lkc/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lkc/r;

    .line 10
    .line 11
    iput-boolean v0, v1, Lkc/r;->g:Z

    .line 12
    .line 13
    iget-object v0, v1, Lkc/r;->f:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lio/flutter/embedding/engine/renderer/l;

    .line 30
    .line 31
    invoke-interface {v1}, Lio/flutter/embedding/engine/renderer/l;->e()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    iget-object v0, p0, Lkc/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkc/n;

    .line 39
    .line 40
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lkc/n;->c:Lio/flutter/embedding/engine/renderer/k;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, v0, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/FlutterJNI;->removeIsDisplayingFlutterUiListener(Lio/flutter/embedding/engine/renderer/l;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :pswitch_1
    iget-object v0, p0, Lkc/c;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lkc/f;

    .line 58
    .line 59
    iget-object v1, v0, Lkc/f;->a:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-interface {v1}, Lkc/e;->e()V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    iput-boolean v1, v0, Lkc/f;->g:Z

    .line 66
    .line 67
    iput-boolean v1, v0, Lkc/f;->h:Z

    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
