.class public final synthetic LU1/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/io/IOException;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/IOException;ZI)V
    .locals 0

    .line 1
    iput p7, p0, LU1/L;->a:I

    iput-object p1, p0, LU1/L;->d:Ljava/lang/Object;

    iput-object p2, p0, LU1/L;->e:Ljava/lang/Object;

    iput-object p3, p0, LU1/L;->f:Ljava/lang/Object;

    iput-object p4, p0, LU1/L;->g:Ljava/lang/Object;

    iput-object p5, p0, LU1/L;->b:Ljava/io/IOException;

    iput-boolean p6, p0, LU1/L;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LU1/L;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU1/L;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LI5/f;

    .line 9
    .line 10
    iget v2, v0, LI5/f;->a:I

    .line 11
    .line 12
    iget-object v1, p0, LU1/L;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v3, p0, LU1/L;->f:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lf6/p;

    .line 18
    .line 19
    iget-object v3, p0, LU1/L;->g:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v5, v3

    .line 22
    check-cast v5, Lf6/u;

    .line 23
    .line 24
    iget-object v6, p0, LU1/L;->b:Ljava/io/IOException;

    .line 25
    .line 26
    iget-boolean v7, p0, LU1/L;->c:Z

    .line 27
    .line 28
    iget-object v3, v0, LI5/f;->b:Lf6/z;

    .line 29
    .line 30
    invoke-interface/range {v1 .. v7}, Lf6/D;->o(ILf6/z;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, LU1/L;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LU1/M;

    .line 37
    .line 38
    iget-object v0, v0, LU1/M;->b:LE5/n0;

    .line 39
    .line 40
    iget-object v0, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, LV1/d;

    .line 44
    .line 45
    iget-object v0, p0, LU1/L;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Landroid/util/Pair;

    .line 48
    .line 49
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v3, v0

    .line 60
    check-cast v3, Lk2/H;

    .line 61
    .line 62
    iget-object v0, p0, LU1/L;->f:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, v0

    .line 65
    check-cast v4, Lk2/z;

    .line 66
    .line 67
    iget-object v0, p0, LU1/L;->g:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v5, v0

    .line 70
    check-cast v5, Lh2/g;

    .line 71
    .line 72
    iget-object v6, p0, LU1/L;->b:Ljava/io/IOException;

    .line 73
    .line 74
    iget-boolean v7, p0, LU1/L;->c:Z

    .line 75
    .line 76
    invoke-virtual/range {v1 .. v7}, LV1/d;->s(ILk2/H;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
