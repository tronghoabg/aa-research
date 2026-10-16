.class public final LVa/w7;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LVa/Lb;

.field public final synthetic e:Lorg/json/JSONObject;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(LVa/Lb;Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 1
    iput p5, p0, LVa/w7;->c:I

    iput-object p1, p0, LVa/w7;->d:LVa/Lb;

    iput-object p2, p0, LVa/w7;->e:Lorg/json/JSONObject;

    iput-object p3, p0, LVa/w7;->f:Landroid/view/View;

    iput-object p4, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/w7;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/w7;->f:Landroid/view/View;

    .line 7
    .line 8
    iget-object v1, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    .line 9
    .line 10
    iget-object v2, p0, LVa/w7;->d:LVa/Lb;

    .line 11
    .line 12
    iget-object v3, p0, LVa/w7;->e:Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-interface {v2, v3, v0, v1}, LVa/Lb;->h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LVa/w7;->f:Landroid/view/View;

    .line 19
    .line 20
    iget-object v1, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    .line 21
    .line 22
    iget-object v2, p0, LVa/w7;->d:LVa/Lb;

    .line 23
    .line 24
    iget-object v3, p0, LVa/w7;->e:Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-interface {v2, v3, v0, v1}, LVa/Lb;->m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, LVa/w7;->f:Landroid/view/View;

    .line 31
    .line 32
    iget-object v1, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    .line 33
    .line 34
    iget-object v2, p0, LVa/w7;->d:LVa/Lb;

    .line 35
    .line 36
    iget-object v3, p0, LVa/w7;->e:Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-interface {v2, v3, v0, v1}, LVa/Lb;->r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object v0, p0, LVa/w7;->f:Landroid/view/View;

    .line 43
    .line 44
    iget-object v1, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    .line 45
    .line 46
    iget-object v2, p0, LVa/w7;->d:LVa/Lb;

    .line 47
    .line 48
    iget-object v3, p0, LVa/w7;->e:Lorg/json/JSONObject;

    .line 49
    .line 50
    invoke-interface {v2, v3, v0, v1}, LVa/Lb;->v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    iget-object v0, p0, LVa/w7;->f:Landroid/view/View;

    .line 55
    .line 56
    iget-object v1, p0, LVa/w7;->g:Landroid/view/KeyEvent$Callback;

    .line 57
    .line 58
    iget-object v2, p0, LVa/w7;->d:LVa/Lb;

    .line 59
    .line 60
    iget-object v3, p0, LVa/w7;->e:Lorg/json/JSONObject;

    .line 61
    .line 62
    invoke-interface {v2, v3, v0, v1}, LVa/Lb;->k(Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
