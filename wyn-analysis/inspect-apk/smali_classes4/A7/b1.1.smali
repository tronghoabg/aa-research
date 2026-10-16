.class public final LA7/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LA7/F0;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:LA7/F0;

.field public final synthetic f:LA7/P0;


# direct methods
.method public constructor <init>(LA7/P0;LA7/F0;JJZLA7/F0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LA7/b1;->a:LA7/F0;

    .line 5
    .line 6
    iput-wide p3, p0, LA7/b1;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, LA7/b1;->c:J

    .line 9
    .line 10
    iput-boolean p7, p0, LA7/b1;->d:Z

    .line 11
    .line 12
    iput-object p8, p0, LA7/b1;->e:LA7/F0;

    .line 13
    .line 14
    iput-object p1, p0, LA7/b1;->f:LA7/P0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, LA7/b1;->f:LA7/P0;

    .line 2
    .line 3
    iget-object v1, p0, LA7/b1;->a:LA7/F0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LA7/P0;->n0(LA7/F0;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LA7/n0;

    .line 17
    .line 18
    iget-object v2, v2, LA7/n0;->g:LA7/e;

    .line 19
    .line 20
    sget-object v3, LA7/y;->X0:LA7/D;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v2, v4, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-wide v2, p0, LA7/b1;->b:J

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v0, v2, v3, v4}, LA7/P0;->l0(JZ)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v9, 0x1

    .line 36
    iget-boolean v10, p0, LA7/b1;->d:Z

    .line 37
    .line 38
    iget-object v5, p0, LA7/b1;->f:LA7/P0;

    .line 39
    .line 40
    iget-object v6, p0, LA7/b1;->a:LA7/F0;

    .line 41
    .line 42
    iget-wide v7, p0, LA7/b1;->c:J

    .line 43
    .line 44
    invoke-static/range {v5 .. v10}, LA7/P0;->p0(LA7/P0;LA7/F0;JZZ)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, LA7/b1;->e:LA7/F0;

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, LA7/P0;->q0(LA7/P0;LA7/F0;LA7/F0;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
