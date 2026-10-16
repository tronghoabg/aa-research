.class public final Lvd/h;
.super Lvd/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvd/h;->a:I

    iput-object p1, p0, Lvd/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LDd/c;)Lmd/e;
    .locals 3

    .line 1
    iget v0, p0, Lvd/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lvd/a;->b(LDd/c;)Lmd/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-virtual {p1}, LDd/c;->G()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lmd/N;

    .line 16
    .line 17
    invoke-super {p0, p1}, Lvd/a;->b(LDd/c;)Lmd/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lmd/e;->c()Lmd/b;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lmd/O;->d:Lmd/a;

    .line 28
    .line 29
    iget-object v1, v1, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    new-instance v1, Lvd/g;

    .line 38
    .line 39
    invoke-direct {v1, p1, v0}, Lvd/g;-><init>(Lmd/e;Lmd/N;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v1

    .line 43
    :cond_0
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lmd/m;Lmd/M;)V
    .locals 3

    .line 1
    iget v0, p0, Lvd/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lvd/a;->l(Lmd/m;Lmd/M;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lvd/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lvd/i;

    .line 13
    .line 14
    iget-object v1, v0, Lvd/i;->g:Lvd/v;

    .line 15
    .line 16
    iget-object v1, v1, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iget-object v2, v0, Lvd/i;->a:Lvd/j;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iput-object p1, v0, Lvd/i;->d:Lmd/m;

    .line 28
    .line 29
    iput-object p2, v0, Lvd/i;->e:Lmd/M;

    .line 30
    .line 31
    iget-boolean p2, v0, Lvd/i;->f:Z

    .line 32
    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    iget-object p2, v0, Lvd/i;->g:Lvd/v;

    .line 36
    .line 37
    iget-boolean v1, p2, Lvd/v;->h:Z

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    sget-object v1, Lmd/m;->d:Lmd/m;

    .line 42
    .line 43
    if-ne p1, v1, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lvd/i;->b:Lvd/e;

    .line 46
    .line 47
    invoke-virtual {p1}, Lvd/e;->e()V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p2}, Lvd/v;->j()V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final m()Lmd/y;
    .locals 1

    .line 1
    iget v0, p0, Lvd/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvd/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvd/i;

    .line 9
    .line 10
    iget-object v0, v0, Lvd/i;->g:Lvd/v;

    .line 11
    .line 12
    iget-object v0, v0, Lvd/v;->g:Lmd/y;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lvd/h;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lmd/y;

    .line 18
    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
