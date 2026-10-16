.class public final LB9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:LB9/f;


# direct methods
.method public constructor <init>(LB9/f;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB9/a;->b:LB9/f;

    .line 5
    .line 6
    iput-object p2, p0, LB9/a;->a:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, LB9/a;->b:LB9/f;

    .line 2
    .line 3
    iget-object v0, p1, LB9/f;->k:Lz9/E;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lz9/C;->c:Lz9/C;

    .line 8
    .line 9
    check-cast v0, LJ9/o;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LJ9/o;->f(Lz9/C;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LB9/a;->a:Landroid/app/Activity;

    .line 15
    .line 16
    const-string v1, "Dismissing fiam"

    .line 17
    .line 18
    invoke-static {v1}, LD9/e;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, LB9/f;->e(Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p1, LB9/f;->j:LN9/h;

    .line 26
    .line 27
    iput-object v0, p1, LB9/f;->k:Lz9/E;

    .line 28
    .line 29
    return-void
.end method
