.class public final LVa/x7;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LVa/Lb;

.field public final synthetic e:Lorg/json/JSONObject;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:LVa/e0;

.field public final synthetic h:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(LVa/Lb;Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 1
    iput p6, p0, LVa/x7;->c:I

    iput-object p1, p0, LVa/x7;->d:LVa/Lb;

    iput-object p2, p0, LVa/x7;->e:Lorg/json/JSONObject;

    iput-object p3, p0, LVa/x7;->f:Landroid/view/View;

    iput-object p4, p0, LVa/x7;->g:LVa/e0;

    iput-object p5, p0, LVa/x7;->h:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LVa/x7;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/x7;->g:LVa/e0;

    .line 7
    .line 8
    iget-object v1, p0, LVa/x7;->h:Landroid/view/KeyEvent$Callback;

    .line 9
    .line 10
    iget-object v2, p0, LVa/x7;->d:LVa/Lb;

    .line 11
    .line 12
    iget-object v3, p0, LVa/x7;->e:Lorg/json/JSONObject;

    .line 13
    .line 14
    iget-object v4, p0, LVa/x7;->f:Landroid/view/View;

    .line 15
    .line 16
    invoke-interface {v2, v3, v4, v0, v1}, LVa/Lb;->n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, LVa/x7;->g:LVa/e0;

    .line 21
    .line 22
    iget-object v1, p0, LVa/x7;->h:Landroid/view/KeyEvent$Callback;

    .line 23
    .line 24
    iget-object v2, p0, LVa/x7;->d:LVa/Lb;

    .line 25
    .line 26
    iget-object v3, p0, LVa/x7;->e:Lorg/json/JSONObject;

    .line 27
    .line 28
    iget-object v4, p0, LVa/x7;->f:Landroid/view/View;

    .line 29
    .line 30
    invoke-interface {v2, v3, v4, v0, v1}, LVa/Lb;->s(Lorg/json/JSONObject;Ljava/lang/Object;LVa/e0;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
