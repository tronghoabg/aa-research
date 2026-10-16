.class public final Lrb/f;
.super Lrb/a;
.source "SourceFile"

# interfaces
.implements Lnb/a;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lnb/c;Lad/L;Lcom/unity3d/scar/adapter/common/c;I)V
    .locals 6

    .line 1
    iput p5, p0, Lrb/f;->h:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lrb/a;-><init>(Landroid/content/Context;Lnb/c;Ljava/lang/Object;Lcom/unity3d/scar/adapter/common/c;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Lrb/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast v0, LR6/c;

    .line 11
    .line 12
    iget-object v1, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lrb/b;

    .line 15
    .line 16
    check-cast v1, Lrb/j;

    .line 17
    .line 18
    iget-object v1, v1, Lrb/j;->e:Lcom/google/android/gms/ads/nativead/l;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, LR6/c;->show(Landroid/app/Activity;Lx6/r;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lrb/a;->d:Lnb/c;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/unity3d/scar/adapter/common/a;->a(Lnb/c;)Lcom/unity3d/scar/adapter/common/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lrb/a;->e:Lcom/unity3d/scar/adapter/common/c;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Lcom/unity3d/scar/adapter/common/c;->handleError(Lcom/unity3d/scar/adapter/common/g;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :pswitch_0
    iget-object v0, p0, Lrb/a;->b:Ljava/lang/Object;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    check-cast v0, LI6/a;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, LI6/a;->show(Landroid/app/Activity;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object p1, p0, Lrb/a;->d:Lnb/c;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/unity3d/scar/adapter/common/a;->a(Lnb/c;)Lcom/unity3d/scar/adapter/common/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lrb/a;->e:Lcom/unity3d/scar/adapter/common/c;

    .line 53
    .line 54
    invoke-interface {v0, p1}, Lcom/unity3d/scar/adapter/common/c;->handleError(Lcom/unity3d/scar/adapter/common/g;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lx6/g;)V
    .locals 3

    .line 1
    iget v0, p0, Lrb/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/a;->d:Lnb/c;

    .line 7
    .line 8
    iget-object v0, v0, Lnb/c;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lrb/b;

    .line 13
    .line 14
    check-cast v1, Lrb/j;

    .line 15
    .line 16
    iget-object v1, v1, Lrb/j;->d:Lrb/i;

    .line 17
    .line 18
    iget-object v2, p0, Lrb/a;->c:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v2, v0, p1, v1}, LR6/c;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LR6/d;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lrb/a;->d:Lnb/c;

    .line 25
    .line 26
    iget-object v0, v0, Lnb/c;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lrb/b;

    .line 31
    .line 32
    check-cast v1, Lrb/h;

    .line 33
    .line 34
    iget-object v1, v1, Lrb/h;->d:Lad/G;

    .line 35
    .line 36
    iget-object v2, p0, Lrb/a;->c:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {v2, v0, p1, v1}, LI6/a;->load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LI6/b;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
