.class public final synthetic Lec/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lic/a;
.implements Lic/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lec/c;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lec/c;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lec/b;->a:I

    iput-object p1, p0, Lec/b;->b:Lec/c;

    iput-boolean p2, p0, Lec/b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    iget v0, p0, Lec/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lec/b;->b:Lec/c;

    .line 7
    .line 8
    iget-object v1, v0, Lec/c;->a:Landroid/content/Context;

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    const-string v3, "IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED"

    .line 13
    .line 14
    invoke-static {v1, v3, v2}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v1, p0, Lec/b;->c:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lec/c;->c()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lec/b;->b:Lec/c;

    .line 26
    .line 27
    iget-object v1, v0, Lec/c;->a:Landroid/content/Context;

    .line 28
    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    const-string v3, "IS_MAN_AUTO_START_ACCEPTED"

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lec/b;->c:Z

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-virtual {v0, v1}, Lec/c;->d(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v0}, Lec/c;->c()V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Lec/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lec/b;->c:Z

    .line 7
    .line 8
    iget-object v1, p0, Lec/b;->b:Lec/c;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lec/c;->c()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lec/b;->b:Lec/c;

    .line 21
    .line 22
    iget-boolean v1, p0, Lec/b;->c:Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Lec/c;->d(Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v0}, Lec/c;->c()V

    .line 32
    .line 33
    .line 34
    :goto_1
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
