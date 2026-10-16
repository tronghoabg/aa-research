.class public final LA7/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:LA7/Y;


# direct methods
.method public constructor <init>(LA7/P0;LA7/F0;JZLA7/F0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/d1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/d1;->d:Ljava/lang/Object;

    iput-wide p3, p0, LA7/d1;->b:J

    iput-boolean p5, p0, LA7/d1;->c:Z

    iput-object p6, p0, LA7/d1;->e:Ljava/lang/Object;

    iput-object p1, p0, LA7/d1;->f:LA7/Y;

    return-void
.end method

.method public constructor <init>(LA7/i1;LA7/j1;LA7/j1;JZ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/d1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/d1;->d:Ljava/lang/Object;

    iput-object p3, p0, LA7/d1;->e:Ljava/lang/Object;

    iput-wide p4, p0, LA7/d1;->b:J

    iput-boolean p6, p0, LA7/d1;->c:Z

    iput-object p1, p0, LA7/d1;->f:LA7/Y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LA7/d1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/d1;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, LA7/j1;

    .line 10
    .line 11
    iget-wide v4, p0, LA7/d1;->b:J

    .line 12
    .line 13
    iget-boolean v6, p0, LA7/d1;->c:Z

    .line 14
    .line 15
    iget-object v0, p0, LA7/d1;->f:LA7/Y;

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, LA7/i1;

    .line 19
    .line 20
    iget-object v0, p0, LA7/d1;->e:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, LA7/j1;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    invoke-virtual/range {v1 .. v7}, LA7/i1;->m0(LA7/j1;LA7/j1;JZLandroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, LA7/d1;->f:LA7/Y;

    .line 31
    .line 32
    check-cast v0, LA7/P0;

    .line 33
    .line 34
    iget-object v1, p0, LA7/d1;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LA7/F0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, LA7/P0;->n0(LA7/F0;)V

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    iget-boolean v7, p0, LA7/d1;->c:Z

    .line 43
    .line 44
    iget-object v2, p0, LA7/d1;->f:LA7/Y;

    .line 45
    .line 46
    check-cast v2, LA7/P0;

    .line 47
    .line 48
    iget-object v3, p0, LA7/d1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, LA7/F0;

    .line 51
    .line 52
    iget-wide v4, p0, LA7/d1;->b:J

    .line 53
    .line 54
    invoke-static/range {v2 .. v7}, LA7/P0;->p0(LA7/P0;LA7/F0;JZZ)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, LA7/d1;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, LA7/F0;

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, LA7/P0;->q0(LA7/P0;LA7/F0;LA7/F0;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
