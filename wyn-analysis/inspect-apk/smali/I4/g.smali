.class public interface abstract LI4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI4/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI4/h;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/h;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LI4/j;

    .line 7
    .line 8
    iget-object v0, v0, LI4/h;->a:Ljava/util/Map;

    .line 9
    .line 10
    invoke-direct {v1, v0}, LI4/j;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, LI4/g;->a:LI4/j;

    .line 14
    .line 15
    return-void
.end method
