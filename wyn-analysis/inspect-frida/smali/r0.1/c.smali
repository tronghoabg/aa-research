.class public abstract Lr0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/j;

.field public static final b:Lr0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr0/j;

    .line 2
    .line 3
    sget-object v1, Lr0/a;->a:Lr0/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr0/j;-><init>(Ltf/p;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr0/c;->a:Lr0/j;

    .line 9
    .line 10
    new-instance v0, Lr0/j;

    .line 11
    .line 12
    sget-object v1, Lr0/b;->a:Lr0/b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lr0/j;-><init>(Ltf/p;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr0/c;->b:Lr0/j;

    .line 18
    .line 19
    return-void
.end method
