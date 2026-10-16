.class public final synthetic LN6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LN6/x;ZZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN6/w;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/w;->d:Ljava/lang/Object;

    iput-boolean p2, p0, LN6/w;->b:Z

    iput-boolean p3, p0, LN6/w;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LN6/w;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LN6/w;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, LN6/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LN6/w;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LN6/w;->c:Z

    .line 12
    .line 13
    iget-object v0, p0, LN6/w;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Runnable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    iget-boolean v0, p0, LN6/w;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p0, LN6/w;->c:Z

    .line 24
    .line 25
    iget-object v2, p0, LN6/w;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, LN6/x;

    .line 28
    .line 29
    invoke-virtual {v2, v0, v1}, LN6/x;->d(ZZ)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
