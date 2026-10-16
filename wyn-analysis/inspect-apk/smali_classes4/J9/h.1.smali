.class public final synthetic LJ9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/h;->a:I

    iput-object p1, p0, LJ9/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ9/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LJ9/h;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, LM/y;

    .line 9
    .line 10
    invoke-virtual {v0}, LM/y;->f()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:LA/e0;

    .line 17
    .line 18
    iget-object p1, v0, LM/y;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->l()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    check-cast v0, LJ9/i;

    .line 27
    .line 28
    iget-object p1, p1, Ll9/a;->a:Ls8/b;

    .line 29
    .line 30
    iget-object v0, v0, LJ9/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    iget-boolean p1, p1, Ls8/b;->b:Z

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
