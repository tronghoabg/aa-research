.class public final synthetic Lv9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv9/b;


# direct methods
.method public synthetic constructor <init>(Lv9/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv9/a;->a:I

    iput-object p1, p0, Lv9/a;->b:Lv9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lv9/a;->b:Lv9/b;

    .line 4
    .line 5
    iget v3, p0, Lv9/a;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lv9/b;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lv9/r;->d:Lv9/r;

    .line 17
    .line 18
    iput-object v0, v2, Lv9/b;->h:Lv9/r;

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    iget-object v3, v2, Lv9/b;->h:Lv9/r;

    .line 22
    .line 23
    sget-object v4, Lv9/r;->f:Lv9/r;

    .line 24
    .line 25
    if-ne v3, v4, :cond_1

    .line 26
    .line 27
    move v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v4, v1

    .line 30
    :goto_0
    const-string v5, "State should still be backoff but was %s"

    .line 31
    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    aput-object v3, v0, v1

    .line 35
    .line 36
    invoke-static {v4, v5, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lv9/r;->a:Lv9/r;

    .line 40
    .line 41
    iput-object v0, v2, Lv9/b;->h:Lv9/r;

    .line 42
    .line 43
    invoke-virtual {v2}, Lv9/b;->g()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lv9/b;->d()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const-string v2, "Stream should have started"

    .line 51
    .line 52
    new-array v1, v1, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
