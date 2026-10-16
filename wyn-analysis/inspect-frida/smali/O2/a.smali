.class public final LO2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final synthetic a:I

.field public final b:Ls2/m;


# direct methods
.method public constructor <init>(BI)V
    .locals 2

    iput p2, p0, LO2/a;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ls2/y;

    const/4 p2, 0x2

    const-string v0, "image/png"

    const v1, 0x8950

    invoke-direct {p1, v1, p2, v0}, Ls2/y;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, LO2/a;->b:Ls2/m;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ls2/y;

    const/4 p2, 0x2

    const-string v0, "image/bmp"

    const/16 v1, 0x424d

    invoke-direct {p1, v1, p2, v0}, Ls2/y;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, LO2/a;->b:Ls2/m;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, LO2/a;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Ls2/y;

    const-string v0, "image/jpeg"

    const v1, 0xffd8

    const/4 v2, 0x2

    invoke-direct {p1, v1, v2, v0}, Ls2/y;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, LO2/a;->b:Ls2/m;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, LA2/a;

    invoke-direct {p1}, LA2/a;-><init>()V

    iput-object p1, p0, LO2/a;->b:Ls2/m;

    :goto_0
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2, p3, p4}, Ls2/m;->a(JJ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 13
    .line 14
    check-cast v0, Ls2/y;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, p3, p4}, Ls2/y;->a(JJ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 21
    .line 22
    check-cast v0, Ls2/y;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Ls2/y;->a(JJ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ls2/o;)V
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ls2/m;->g(Ls2/o;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 13
    .line 14
    check-cast v0, Ls2/y;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ls2/y;->g(Ls2/o;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 21
    .line 22
    check-cast v0, Ls2/y;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ls2/y;->g(Ls2/o;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ls2/m;
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ls2/m;->i(Ls2/n;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 14
    .line 15
    check-cast v0, Ls2/y;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ls2/y;->i(Ls2/n;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_1
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 23
    .line 24
    check-cast v0, Ls2/y;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ls2/y;->i(Ls2/n;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 7
    .line 8
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 12
    .line 13
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 17
    .line 18
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Ls2/m;->k(Ls2/n;LJ5/n;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_0
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 14
    .line 15
    check-cast v0, Ls2/y;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ls2/y;->k(Ls2/n;LJ5/n;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_1
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 23
    .line 24
    check-cast v0, Ls2/y;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ls2/y;->k(Ls2/n;LJ5/n;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, LO2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO2/a;->b:Ls2/m;

    .line 7
    .line 8
    invoke-interface {v0}, Ls2/m;->release()V

    .line 9
    .line 10
    .line 11
    :pswitch_0
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
